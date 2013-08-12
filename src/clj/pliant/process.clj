(ns pliant.process)

(defmacro defprocess
  "Creates a new process with the associated default function.
  The docstring and attribute-map are optional."
  {:arglists '([name docstring? [params*] body])
   :added "1.0"}
  [process-name & args]
  (let [docstring   (if (string? (first args))
                      (first args)
                      nil)
        fn-tail  (if (string? (first args))
                      (next args)
                      args)
        procmeta    (if docstring {:doc docstring} {})]
    `(let [v# (def ~process-name)]
       (when-not (and (.hasRoot v#) (instance? pliant.process.lang.ProcessFn (deref v#)))
         (def ~(with-meta process-name procmeta)
           (new pliant.process.lang.ProcessFn ~(name process-name) (fn ~@fn-tail) ))))))

(defmacro deflayer
  "Creates and installs a new layer of a process."
  {:arglists '([processfn name docstring? [params*] body])
   :added "1.0"}
  [processfn layer-name & args]
  (let [docstring   (if (string? (first args))
                      (first args)
                      nil)
        fn-tail  (if (string? (first args))
                      (next args)
                      args)
        layermeta    (if docstring {:doc docstring :process processfn} {:process processfn})]
    `(def ~(with-meta layer-name layermeta)
       (. ~(with-meta processfn {:tag 'pliant.process.lang.ProcessFn}) addLayer ~*ns* ~(name layer-name) (fn ~@fn-tail)))))

(defn as-method
  [process ^clojure.lang.MultiFn multi dispatch-val]
  (. multi addMethod dispatch-val process))

(defn continue
  "Creates a return value to tell the process dispatcher to execute the next process."
  []
  (new pliant.process.lang.Continue))

(defn skip
  "Creates a return value to tell the process dispatcher to execute the next process, skipping any processes that have been provided."
  [& skips]
  (new pliant.process.lang.Skip skips))

(defn skipback
  "Creates a return value to tell the process dispatcher to execute the next process, skipping any processes that have been provide,
   and then execute a function on the return value of the last process."
  [call & skips]
  (new pliant.process.lang.Skipback call skips))

(defn callback
  "Creates a return value to tell the process dispatcher to execute the next process, then execute a function on the return value of
   then last process."
  [call]
  (new pliant.process.lang.Callback call))

(defn do-before
  "Re-orders the process layers so that the first processes layer is executed befor the second process layer."
  [^pliant.process.lang.ProcessFn process layer1 layer2]
  (. process before layer1 layer2))

(defn do-first
  "Re-orders the process layers so that the provided layer is executed first."
  [^pliant.process.lang.ProcessFn process layer-fn]
  (. process first layer-fn))

(defn do-last
  "Re-orders the process layers so that the provided layer is executed last."
  [^pliant.process.lang.ProcessFn process layer-fn]
  (. process last layer-fn))