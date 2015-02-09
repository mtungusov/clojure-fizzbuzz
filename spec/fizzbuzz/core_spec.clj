(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
          (let [test-cases [[1 1]
                            [4 4]
                            [3 "fizz"]
                            [6 "fizz"]
                            [5 "buzz"]
                            [10 "buzz"]
                            [15 "fizzbuzz"]
                            [30 "fizzbuzz"]]]
            (for [[val exp] test-cases]
              (it (str "returns " exp " for fizzbuzz of " val)
                  (should= exp (fizzbuzz val)))))
          (it "return up to 10"
              (should= '(1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz")
                       (fizzbuzz-upto 10)))
          (it "print up to 10"
              (should= "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n"
                       (with-out-str (p-fizzbuzz-upto 10)))))
