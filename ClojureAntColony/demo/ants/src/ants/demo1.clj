(ns ants.demo1
  (:use [ants.ants]))


(def ants (setup))
(send-off animator animation)
(comment
  (dorun (map #(send-off % behave) ants))
  (send-off evaporator evaporation)
)

