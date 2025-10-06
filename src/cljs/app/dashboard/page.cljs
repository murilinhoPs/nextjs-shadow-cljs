(ns app.dashboard.page
  (:require [helix.core :refer [defnc]]
            [helix.dom :as d]))

(defnc DashboardPage [props]
  (d/div
   [:h1 "Dashboard Page (from CLJS)"]))

(def ^:export default DashboardPage)
