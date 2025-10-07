(ns app.hello-world.core
  (:require [helix.core :refer [defnc $]]
            [helix.dom :as d]
            ["react-dom/client" :as rdomc]))

(defnc ^:export HelloWorld [{:keys [name]}]
  (d/div
   "Hello from ClojureScript, " (or name "Next.js") "!"))

;; Exporta o componente como 'default' para o Next.js
(def ^:export default HelloWorld)

(defn ^:export init! []
  (let [root-el (.getElementById js/document "cljs-root")]
    (-> (rdomc/createRoot root-el)
        (.render ($ HelloWorld {:name "Murilo"})))))
