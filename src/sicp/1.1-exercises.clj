; Exercise 1.1

10
(+ 5 3 4)
(- 9 1)
(/ 6 2) ; 3
(+ (* 2 4) (- 4 6)) ; 6
(def a 3)
(def b (+ a 1))
b ; 4
(+ a b (* a b)) ; 19
(= a b) ; false
(if (and (> b a) (< b (* a b)))
  b
  a) ; 4
(cond (= a 4) 6
      (= b 5) "Hello"
      (= b 4) (+ 6 7 a) ; 16
      :else 25)
(+ 2 (if (> b a) b a)) ; 6
(* (cond (> a b) a
         (< a b) b
         :else -1)
   (+ a 1)) ; 16


; Exercise 1.4

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -)
   a
   b))

(a-plus-abs-b 5 0)

; Exercise 1.5

(defn p []
  (p))

(defn testtt [x y]
  (if (= x 0)
      0
      y))

(testtt 0 (p))
