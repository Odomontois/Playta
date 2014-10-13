(ns cella.core
  (:gen-class)
  (:require [helloworld.gentle :refer :all]
            [helloworld.helloer :refer :all])
  (:import  [helloworld.gentle GentleHelloer]))

(defn -main
  [& args]
  (println (make-hello (GentleHelloer. "Oleg"))))
