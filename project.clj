(defproject pliant/process "0.1.0"
  :description "Defines all of the process functions and macros."
  
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :test-paths ["test/clj"]
  
  ;; Keep java source and project definition out of the artifact
  :jar-exclusions [#"^\." #"^*\/\." #"\.java$" #"project\.clj"]
  
  :dependencies [[org.clojure/clojure "1.3.0"]])

