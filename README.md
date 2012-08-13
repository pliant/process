# About

Provides a Clojure library to layer functions into a single process workflow.  Like the Clojure multimethod functionality, process allows for the ability to execute branches of logic based on the context of function call(arguments, etc).

Similaritities                       | multimethod            | process
------------------------------------ | ---------------------- | ------------------------- 
Define a callable function           | clojure.core/defmulti  | pliant.process/defprocess
Define branches of logic to execute  | clojure.core/defmethod | pliant.process/deflayer


But process differs in how the dispatching is performed.  Where multimethod defines a single dispatch function and matches the value it returns to a single method to execute, process allows for each layer that is added to it, starting with the first layer in order, to determine if it will execute or not, as well as whether it will allow the next layer to be executed.

Differences             | multimethod                                                                   | process
----------------------- | ----------------------------------------------------------------------------- | ------------------------- 
Dispatching             | Single dispatch function that is matched to a single method to execute        | Each layer determines if it is executed.
Workflow of execution   | None.  Only one method is executed.                                           | Can execute one or many layers on a single call, as well as skipping over layers and performing callbacks.
Default logic execution | Available when method is added with :default dispatch value                   | Inherent in the defining of defmethod
Ordering vs Prefer      | Prefers one method over another with same dispatch value with *prefer-method* | Can set order of execution of layers with *before*



## Usage

Creating a process is just like creating a function, except instead of using *defn* you use *pliant.process/defprocess* .

```clojure
(use 'pliant.process)

(defprocess myprocess
  "This is my process doc"
  [arg1 arg2]
  (println "Running default logic with args:" arg1 arg2))
```

The process function myprocess can be called just like a normal function.

```clojure
user=> (myprocess 1 2)
Running default logic with args: 1 2
nil
```

Adding a layer to the process is done using *pliant.process/deflayer*.

```clojure
(deflayer myprocess mylayer1 
  [arg1 arg2] 
  (if (= arg2 4) 
    (println "Running layer1 logic with args:" arg1 arg2) 
    (continue)))
```

```clojure
user=> (myprocess 1 2)
Running default logic with args: 1 2
nil
user=> (myprocess 1 4)
Running layer1 logic with args: 1 4
nil
```

## Layering

Differences emerge from multimethod when execution is based off of different criteria:

```clojure
(deflayer myprocess mylayer2 
  [arg1 arg2] 
  (if (:doit arg1) 
    (println "Running layer2 logic with args:" arg1 arg2) 
    (continue)))

(deflayer myprocess mylayer3
  [arg1 arg2] 
  (if (roles/is-manager (session/user))
    (println "Running layer3 logic with args:" arg1 arg2) 
    (continue)))
```

## Ordering Execution

By default layers are executed in the order that they are read into Clojure.  To change the order you can currently 
use the *pliant.process/before* function.

```clojure
user=> (before mylayer3 mylayer2)
nil
```

## Flow Control
Controlling the flow of a process is performed by calling one of the flow control functions at the end of your logic, which returns a value to the processes internal controller.  If a layer returns any value, including nil, that is not generated from one of the flow control functions the execution of the process is considered complete and that value is returned.  The available flow control functions are:

Control Flow Function            | Instruction
-------------------------------- | -----------
<b>*pliant.process/continue*</b> | Continue to and attempt to execute the next layer on the process.
<b>*pliant.process/skip*</b>     | Continue to and attempt to execute the next layer on the process.  Skip a layer if it matches any of the layer functions that have been provided to the skip function. 
<b>*pliant.process/callback*</b> | Continue to and attempt to execute the next layer on the process.  When finished executing layers execute the function provided with the value returned from the last layer.
<b>*pliant.process/skipback*</b> | Continue to and attempt to execute the next layer on the process.  Combines the ability to skip layers and perform a callback.


### Continue Example
```clojure
(deflayer myprocess mycontinue 
  [arg1 arg2] 
  (if (= arg1 arg2) 
    true 
    (continue)))
```

### Skip Example
```clojure
(deflayer myprocess myskip 
  [arg1 arg2] 
  (if (= arg1 arg2) 
    (skip mycontinue) 
    (continue)))
```

### Callback Example
```clojure
(deflayer myprocess mycallback 
  [arg1 arg2] 
  (if (= arg1 arg2) 
    (callback (fn [val] (if val "Yes" "Nope"))) 
    (continue)))
```

### Skipback Example
```clojure
(deflayer myprocess myskipback
  [arg1 arg2] 
  (if (= arg1 arg2) 
    (skipback (fn [val] (if val "Yes" "Nope")) mycontinure) 
    (continue)))
```

