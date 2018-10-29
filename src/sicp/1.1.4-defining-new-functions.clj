(defn square [x]
  (* x x))

(square 2)
(square 21)

;-----------

(defn spread
  ([x] x)
  ([x y] (- (max x y) (min x y)))
  ([x y z] (- (max x y z) (min x y z))))

(spread 3 9)

; variadic function

(defn spread [& nums] ; variable number of attributes
  (- (apply max nums) (apply min nums)))

(spread 3 9)

