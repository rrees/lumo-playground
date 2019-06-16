(ns playground.json)

(def data {
		:a 1
		:message "Hello world"
	})

(println (.stringify js/JSON (clj->js data)))