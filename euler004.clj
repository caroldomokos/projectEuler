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
;; the vector is in reverse order. for palindrome it does not matter
(defn palindrome_bad?
  ([number] (palindrome? number (vectorize number)))
  ([number vectorized]
    (if (empty? vectorized)
        true
        (if (= (last vectorized) (first vectorized))
            (do (println vectorized)
              (recur number (peek (pop vectorized))))
            false))))
;; not working but learned about peek, pop 
(defn palindrome?
  [number]
  (if (= (vectorize number) (reverse (vectorize number)))
      number
      0))
(defn row_builder
[number]
(map  #(* % number) (range number  0 -1)))

(defn table_builder
([line] ( table_builder line 0))
([line row] 
  (if (= line 0)
     "Finished"
     (do (println (into (row_builder line) (take row (repeat 0))))
         (recur (dec line) (inc row))))))
(defn product_list
([line] (product_list line 0 []))
([line row acc] 
  (if (= line 0)
     acc
     ;(recur (dec line) (inc row) (max (conj acc (apply max (row_builder line))))))))
    (recur (dec line) (inc row) (conj acc (apply max (map palindrome? (row_builder line))))))))
  (defn euler004
    [number]
    (apply max (product_list 999)))
