(defn fibo
"Calculate the Fibonacci sequence up to the number max"
([max] (fibo max [1 2]))
([max fiboseq]
    (if (<= max (last fiboseq))
    fiboseq
    (fibo max (conj fiboseq (reduce + (take-last 2 fiboseq)))))))
(defn euler002
"print the answer to the second question"
[]
(reduce + (take-nth 3 (drop 1 (fibo 4000000)))))

