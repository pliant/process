(ns pliant.process)

(defn index-of
  ([coll item] (index-of coll item =))
  ([coll item pred] (loop [items coll
                           index 0]
                      (cond
                        (nil? items) nil
                        (pred item (first items)) index
                        :else (recur (next items) (inc index))))))

(defn index-of
  ([coll v] (index-of coll v =))
  ([coll v pred] 
    (first (for [[idx item] (map-indexed vector coll) :when (pred v item)]
      idx))))


;; Defines protocol to indicate continued processing of layers.
(defprotocol IContinue)

(deftype Continue 
  []
  IContinue)

;; Defines protocol to indicate continued processing of layers, then execute a callback function afterwards.
(defprotocol ICallback
  (-callback [this response]))

(deftype Callback 
  [callback-fn]
  IContinue
  ICallback
  (-callback [this response] (callback-fn response)))

;; Defines protocol to indicate continued processing of layers, yet skipping layers that have been indicated.
(defprotocol ISkip)

(deftype Skip 
  [& skips]
  IContinue
  ISkip
  (-skip? [this layer] (some #(= (:fn layer) %) skips)))


(deftype SkipBack 
  [& skips]
  IContinue
  ISkip
  (-skip? [this layer] (some #(= (:fn layer) %) skips))
  ICallback
  (-callback [this response] (callback-fn response)))

;; Handles processing of layers.
(defn- process
  [pf default-fn layer-fns args]
  (loop [layers layer-fns
         skips []
         callbacks[]]
    (if (empty? layers)
      (let [layer (first layers)]
          
    ))

;; 
(defprotocol IProcessFn
  "Defines the API for a ProcessFn"
  (-before [this first-fn second-fn])
  (-add-layer [this namespace name layer-fn])
  (-process [this args]))

(deftype ProcessFn [name default-fn layer-table]
  IProcessFn
  (-before [this first-fn second-fn] )
  (-add-layer [this namespace name layer-fn]
              (swap! layer-table conj {:name name :namespace namespace :fn layer-fn}))
  (-process [this args] (process this default-fn layer-table args)))
  
(set! pliant.cljs.process.ProcessFn.prototype.call
      (fn [_ & args]
        (this-as self
          (-process self args))))

(set! pliant.cljs.process.ProcessFn.prototype.apply
      (fn [_ args]
        (this-as self
          (-process self args))))
