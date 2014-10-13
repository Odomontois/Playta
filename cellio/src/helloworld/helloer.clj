(ns helloworld.helloer)
(defprotocol  Helloer
    (make-hello [this] "make a hello string"))