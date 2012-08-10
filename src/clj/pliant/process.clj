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
  [process multi dispatch-val]
  (. multi addMethod dispatch-val process))

(defn continue
  "Creates a return value to tell the process dispatcher to execute the next"
  []
  (new pliant.process.lang.Continue))

(defn skip
  "Creates a return value to tell the process dispatcher to execute the next"
  [& skips]
  (new pliant.process.lang.Skip skips))

(defn skipback
  "Creates a return value to tell the process dispatcher to execute the next"
  [call & skips]
  (new pliant.process.lang.Skipback call skips))

(defn callback
  "Creates a return value to tell the process dispatcher to execute the next"
  [call]
  (new pliant.process.lang.Callback call))

(defn before
  "Creates a return value to tell the process dispatcher to execute the next"
  [process fn1 fn2]
  (. process before fn1 fn2))