(ns cursive-intellij-unresolved-minimal.core)

(require '[java-time :as jt]
         '[org.httpkit.client :as http])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(jt/local-date-time)

(:body
  @(http/get "https://google.com"))
