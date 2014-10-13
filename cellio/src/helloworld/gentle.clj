(ns helloworld.gentle
(:require [helloworld.helloer :refer :all]))

(deftype GentleHelloer [name]
    Helloer
    (make-hello [this] (str "Greetings, " name "!")))