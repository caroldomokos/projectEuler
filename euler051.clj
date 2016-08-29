;; placeholder
(defn middle
[number]
(if (integer? (/ number 2))
  number
(/ ( - number 1) 2)))
;; we want to check if a number is divisible with all numbers up to (rounded -floor like) haf of its value
(defn prime
  [number]
  (if (empty?(filter integer? (map #(/ number %) (range 2 number))))
   number))
  (defn primegen
  [start end]
  (remove #(= nil %) (map prime (range start end))))
