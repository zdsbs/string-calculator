(ns calc 
(:require [clojure.contrib.str-utils2 :as s]))

(defn parse-int [s] 
	(Integer/valueOf s))

(defn add-on-delimeter [s re]
    (apply + (map parse-int (s/split s (re-pattern re)))))


(defn calc [s]
  (if (s/contains? s "\n")
	(add-on-delimeter s "\n") 
 (if (s/blank? s) 
    0 
	(add-on-delimeter s ","))))
