(defn prime?
[number]
(if  (empty? (filter true? (map integer? (map #(/ number %) (range 2 number)))))
  true
  false))
(defn middle
[number]
(if (integer? (/ number 2))
  number
  (/ ( - number 1) 2)))
(defn euler003
([number] (euler003 number (middle number)))
([number hpc]
   (if (integer? (/ number hpc))
         (if (prime? hpc)
             hpc
             (recur number (- hpc 1)))
         (recur number (- hpc 1)))))
