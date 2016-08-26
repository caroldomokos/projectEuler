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
     (recur (dec line) (inc row) (max (conj acc (apply max (row_builder line))))))))
