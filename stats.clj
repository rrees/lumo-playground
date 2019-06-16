(ns playground.stats)

(defn die [] (inc(rand-int 6)))

(defn die-rolls [] (repeatedly die))

(defn scores [rolls]
	(-> 
			(take 4 rolls)
			reverse))

(defn attribute []
	(let [
		rolls (scores (die-rolls))
		score (reduce + (take 3 rolls))]
			{:rolls rolls :score score}))

(println (attribute))

