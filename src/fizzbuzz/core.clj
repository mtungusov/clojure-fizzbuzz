(ns fizzbuzz.core)

(defn testdiv [div]
  (fn [num]
    (zero? (mod num div))))

(defn fizzbuzz [num]
  (cond
    ((testdiv 15) num) "fizzbuzz"
    ((testdiv 3) num) "fizz"
    ((testdiv 5) num) "buzz"
    :else num))

(defn fizzbuzz-upto [num]
  (map fizzbuzz (range 1 (inc num))))

(defn p-fizzbuzz-upto [num]
  (doseq [v (fizzbuzz-upto num)]
    (println v)))

(defn -main [& args]
  (let [num (Integer. (first args))]
    (p-fizzbuzz-upto num)))