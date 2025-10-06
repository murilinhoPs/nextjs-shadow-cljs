(ns hello-world.core
  (:require [helix.core :refer [$ defnc]]
            [helix.dom :as d]
            ["react-dom/client" :as rdomc]))

(defnc HelloWorld [{:keys [name]}]
  (d/div
    "Hello from ClojureScript, " name "!"))

(defnc ^:export HelloWorldComponent [{:keys [name]}]
  (d/div
   "Hello from ClojureScript+helix, " name "!"))

(defn ^:export init! []
  (let [root-el (.getElementById js/document "cljs-root")]
    (-> (rdomc/createRoot root-el)
        (.render ($ HelloWorld {:name "Murilo"})))))
