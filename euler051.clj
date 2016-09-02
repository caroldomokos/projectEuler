;; not able to crack :(
;; will try to implement the math solution described at:http://www.mathblog.dk/project-euler-51-eight-prime-family/
;; "the prime will be 5 or 6 digits. It must have 3 digit being 0,1 or 2 excluding the last digit of the number."
 (defn lastdigit
  ([number] (lastdigit number 0))
  ([number lastdigit]
   (if (integer? (/ number 10))
     lastdigit
     (recur (dec number) (inc lastdigit)))))
(defn vectorize
  ([number] (vectorize number []))
  ([number vectorized] 
    (if (= number 0)
      vectorized
 (defn prime
  [number]
  (if (empty?(filter integer? (map #(/ number %) (range 2 number))))
   number))
(defn primegen
  "Generate primes starting from a prime (will skip even numbers)"
   [start end]
   (remove #(= nil %) (map prime (range start end 2))))
(defn euler051 
  ([] (euler051 10007)
  ([firstPrime]
    (if (contains? (set (map #(get (frequencies (reverse (vectorize (first (primegen firstPrime 99999))))) %) [0 1 2])) 3)
        (if (contains? 
  
(defn replacedigit
  [old new]
  (if (= old 
