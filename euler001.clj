(defn sumofmult
  "Calculate the sum of mulptiples given the end of the range and the number - ie multiples of 3 in 1000"
  [mult rangeend]
  (reduce + (#(range % %2 %3) mult rangeend mult)))
(defn euler001
  "Find the sum of all the multiples of key1 and key2 bellow end  
  [key1 key2 end]
 (- (+ (sumofmult key1 end) (sumofmult key2 end)) (sumofmult (* key1 key2) end)))
; example for the original problem form project euler
; Find the sum of all the multiples of 3 or 5 below 1000.
; user=> (euler001 [100 100] [3 5])
; user=> 2633
