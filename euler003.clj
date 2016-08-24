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
;; this one works by seraching down from the middle of the number every number that is a factor (prime or not) 
;; and checks if it is a prime. It works for numbers that have mixed factors (prime and not prime) but it takes forever to finish
;; for the number at project euler. I realized that thus is because the result of mutiplying prime factors is further and further
;; away. For instance 3x5=15 relatevily close. But 7x11=77 is further away. ANd this keeps increasing. So there is a good chance
;; that the highest prime is closer to the begining. The code above will take forever to get down from a very high number to a 
;; relatively small one. So the next code will start at 2 and work it's way up. And this did the trick. It will crash if you feed
;; a number that is not a mutiple of prime (for instance 99=9X11). It also searches by incrementing 2 with 1 every time so it
;; searches through all numbers. A better way would be to have a lazy prime list and just go to next
(defn euler003_1
([number] (euler003_1 number 2))
([number hpf]
 (if (integer? (/ number hpf))
   (if (= number hpf)
       hpf
       (recur (/ number hpf) (inc hpf)))
     (recur number (inc hpf)))))
