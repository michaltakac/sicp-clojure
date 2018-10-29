(ns sicp.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, Worksnkcjnld!!!!!!"))

(foo 3)

(defn -main [& args]
  (foo 3)
  (println "Server started on port 8080"))
