(ns
  ^{:author Oleg}
  helloworld.gentle
  :require [helloworld.helloer :refer :all])
(deftype GentleHelloer [username]
  Helloer
  (hello-world [h] (str "Hello world," username "!")))