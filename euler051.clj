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
;;; I need to transform the numbers into vectors
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
(recur (/ (- number (lastdigit number)) 10) (into vectorized (vector (lastdigit number)))))))

(defn duplicateList-bad
  ([number] (duplicatelist number[])
  ([number duplicates]
    (if (empty? number)
      duplicates
      (if (some (first number) (rest number))
          (duplicatelist (rest number) (set (into duplicates (first number))))
          (duplicatelist (rest number) duplicates)))))

(defn duplicate
  [numvect position]
  (if  (some #(= % (nth numvect position))(nthnext numvect (inc position))) (nth numvect position)))
  
  
