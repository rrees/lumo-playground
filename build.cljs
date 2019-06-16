(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'playground.json
   :output-to "json.js"
   :optimizations :advanced
   :target :nodejs})	