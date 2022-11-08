(ns forclojure.stage3)

; answer을 정확하게 고쳐봅니다.

; Rotate Sequence
; https://4clojure.oxal.org/#/problem/44

(comment
  ;; cycle, drop, take
  (defn answer44
    [index nums]
    nil)

  (= (answer44 2 [1 2 3 4 5]) '(3 4 5 1 2))
  (= (answer44 -2 [1 2 3 4 5]) '(4 5 1 2 3))
  (= (answer44 6 [1 2 3 4 5]) '(2 3 4 5 1))
  (= (answer44 1 '(:a :b :c)) '(:b :c :a))
  (= (answer44 -4 '(:a :b :c)) '(:c :a :b)))

; Juxtaposition
; https://4clojure.oxal.org/#/problem/59

(comment
  (defn answer59
    [& funcs]
    funcs)

  (= [21 6 1] ((answer59 + max min) 2 3 5 1 6 4))
  (= ["HELLO" 5] ((answer59 #(.toUpperCase %) count) "hello"))
  (= [2 6 4] ((answer59 :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))) 
 
; Word Sorting
; https://4clojure.oxal.org/#/problem/70

(comment
  ;; sort-by
  (defn answer70
    [text]
    [])

  (= (answer70  "Have a nice day.")
     ["a" "day" "Have" "nice"])
  (= (answer70  "Clojure is a fun language!")
     ["a" "Clojure" "fun" "is" "language"])
  (= (answer70  "Fools fall for foolish follies.")
     ["fall" "follies" "foolish" "Fools" "for"]))
