(ns app.dashboard.page
  (:require [helix.core :refer [defnc]]
            [helix.dom :as d]))

(defnc DashboardPage []
  (d/div
   [:h1 "Dashboard Page (from CLJS)"]))

(def ^:export default DashboardPage)
