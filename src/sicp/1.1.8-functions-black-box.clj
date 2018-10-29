(defn fn-args-count [& args] ; variable number of attributes
  (apply count args))

(fn-args-count [1 4 6 "hello"])

(defn (square x)
  (exp (double (log x))))

(defn double [x]
  (+ x x))

(square 3.3)

(defn abs [n] (max n (-' n)))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(good-enough? 1 1.001)

