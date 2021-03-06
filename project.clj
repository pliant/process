(defproject pliant/process "0.1.3-SNAPSHOT"
  :description "Defines all of the process functions and macros."
  
  :url "https://github.com/pliant/process"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :test-paths ["test/clj"]
  
  :javac-options     ["-target" "1.6" "-source" "1.6"]
  :min-lein-version "2.0.0"
  
  ;; Keep java source and project definition out of the artifact
  :jar-exclusions [#"^\." #"^*\/\." #"\.java$" #"project\.clj"]
  
  :signing {:gpg-key "B42493D5"}
  
  :dependencies [[org.clojure/clojure "1.4.0"]])

