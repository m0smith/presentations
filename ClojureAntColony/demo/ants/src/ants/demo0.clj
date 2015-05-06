(ns ants.demo0
  (:use [ants.ants]))


(def ants (setup))
(send-off animator animation)
(dorun (map #(send-off % behave) ants))
(send-off evaporator evaporation)


