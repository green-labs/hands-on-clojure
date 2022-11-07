(ns solution)
(comment
  ;; #14 functions
  8
  ;; #16 hello world
  (fn [name] (str "Hello, " name "!"))
  ;; #17 map
  '(6 7 8)
  ;; #23 reverse a sequence
  (fn [sx] (reduce conj '() sx))
  ;; #24 sum it all up
  (fn [sx] (apply + sx))
  ;; #27 palindrom detector
  (fn [v] (= (vec v) (reverse (vec v))))
  ;; #32 duplicate a sequence
  (fn [v] (apply concat (map vector v v)))
  ;; #44 rotate sequence
  (fn [offset v]
    (let [length (count v)]
      (->> (cycle v)
           (drop (mod offset length))
           (take length))))
  ;; #59 juxtaposition
  (fn [& fs]
    (fn [& args]
      (map (fn [v] (apply v args)) fs)))
  ;; #70 word sorting
  (fn [s]
    (->> (clojure.string/split s #" ")
         (sort-by (fn [v] (.toUpperCase v)))
         (map (fn [s] (clojure.string/replace s #"[,.?!;:]" "")))))
  (println "Welcome to clojure world!"))



