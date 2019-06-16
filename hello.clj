(ns playground.hello)

(println "Hello world")

(println (reduce + (map inc (range 4))))