(ns forclojure.stage2)

; answer을 정확하게 고쳐봅니다.

; Reverse a Sequence
; https://4clojure.oxal.org/#/problem/23

(comment
  (defn answer23
    [nums]
    nums)

  (= (answer23 [1 2 3 4 5]) [5 4 3 2 1])
  (= (answer23 (sorted-set 5 7 2 7)) '(7 5 2))
  (= (answer23 [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))

; Sum It All Up
; https://4clojure.oxal.org/#/problem/24

(comment
  (defn answer24
    [nums]
    nums)

  (= (answer24 [1 2 3]) 6)
  (= (answer24 (list 0 -2 5 5)) 8)
  (= (answer24 #{4 2 1}) 7)
  (= (answer24 '(0 0 -1)) -1)
  (= (answer24 '(1 10 3)) 14))

; Palindrome Detector
; https://4clojure.oxal.org/#/problem/27

(comment
  (defn answer27
    [words]
    words)

  (false? (answer27 '(1 2 3 4 5)))
  (true? (answer27 "racecar"))
  (true? (answer27 [:foo :bar :foo]))
  (true? (answer27 '(1 1 3 3 1 1)))
  (false? (answer27 '(:a :b :c))))

; Duplicate a Sequence
; https://4clojure.oxal.org/#/problem/32

(comment
  (defn answer32
    [elements]
    elements)

  (= (answer32 [1 2 3]) '(1 1 2 2 3 3))
  (= (answer32 [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
  (= (answer32 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
  (= (answer32 [44 33]) [44 44 33 33]))
