(ns pliant.test.process
  (:use [pliant.process]
        [clojure.test]))
  

;; Test a basic process execution.
(defprocess process-only 
  [flag]
  0)

(deftest test-process-only
  (is (= 0 (process-only 0))))

;; Test a processes overridden by a layer.
(defprocess process-overridden 
  [flag]
  0)

(deflayer process-overridden process-overridden-layer
  [flag] 
  (if (= 1 flag) 
    1
    2))

(deftest test-process-overridden 
  (is (= 2 (process-overridden 0)))
  (is (= 1 (process-overridden 1))))

;; Test a process extended by a layer using continue
(defprocess process-next 
  [flag]
  0)

(deflayer process-next process-continue
  [flag] 
  (if (= 1 flag) 
    1
    (continue)))

(deftest test-process-next 
  (is (= 0 (process-next 0)))
  (is (= 1 (process-next 1))))

;; Test a process that uses a callback
(defprocess process-callback 
  [flag]
  0)

(deflayer process-callback process-callback-layer
  [flag] 
  (if (= 1 flag) 
    1
    (callback (fn [flag] 2))))

(deftest test-process-callback
  (is (= 2 (process-callback 0)))
  (is (= 1 (process-callback 1))))


;; Test a process that skips layers
(defprocess process-skip 
  [flag]
  0)

(deflayer process-skip process-skip-layer1
  [flag] 
  (if (= 1 flag) 
    1
    (continue)))

(deflayer process-skip process-skip-layer2
  [flag] 
  (if (= 1 flag) 
    (skip process-skip-layer1)
    (continue)))

(before process-skip process-skip-layer2 process-skip-layer1)

(deftest test-process-skip
  (is (= 0 (process-skip 0)))
  (is (= 0 (process-skip 1))))

;; Test a process skips a layer and uses a callback.
(defprocess process-skipback
  [flag]
  0)

(deflayer process-skipback process-skipback-layer1
  [flag] 
  (if (= 1 flag) 
    1
    (continue)))

(deflayer process-skipback process-skipback-layer2
  [flag] 
  (if (= 1 flag) 
    (skipback (fn [f] 3) process-skipback-layer1)
    (continue)))

(before process-skipback process-skipback-layer2 process-skipback-layer1)

(deftest test-process-skipback
  (is (= 0 (process-skipback 0)))
  (is (= 3 (process-skipback 1))))

;; Test dispatching a process as a multi method.
(defmulti process-multi (fn [arg] arg))

(defprocess process-multi-left [arg] 0)
(as-method process-multi-left process-multi :left)

(defprocess process-multi-right [arg] 1)
(as-method process-multi-right process-multi :right)

(deftest test-process-skipback
  (is (= 0 (process-multi :left)))
  (is (= 1 (process-multi :right))))
