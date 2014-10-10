(ns
  ^{:author Oleg}
  helloworld.helloer)

(defprotocol Helloer
  "Special Protocol for greeting"
  (hello-world [x])
 )