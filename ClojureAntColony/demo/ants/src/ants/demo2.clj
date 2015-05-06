(ns ants.demo2
  (:use [ants.ants]))


(defn behave1
  "the main function for the ant agent"
  [loc]
  (let [p (place loc)
        ant (:ant @p)
        [ahead _ _ :as places] (next-places loc ant)]
    (. Thread (sleep ant-sleep-ms))
    (dosync
     (when running
       (send-off *agent* #'behave1))
     (wander rank-foraging-places places loc))))


(def ants (setup))
(send-off animator animation)
(dorun (map #(send-off % behave1) ants))
(send-off evaporator evaporation)

