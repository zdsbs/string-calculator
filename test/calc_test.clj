(ns test.calc-test
  (:use clojure.test calc))

(deftest simple-cases
	(is (= 0 (calc "")))
	(is (= 1 (calc "1")))
	(is (= 2 (calc "2")))
)

(deftest calcition-via-comma
	(is (= 3 (calc "1,2")))
	(is (= 7 (calc "5,2")))
	(is (= 18 (calc "15,2,1")))
)

(deftest calc-with-newlines
	(is (= 3 (calc "1\n2")))
	(is (= 8 (calc "1\n7")))
)
