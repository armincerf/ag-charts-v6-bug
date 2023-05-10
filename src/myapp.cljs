(ns myapp
  (:require
   ["ag-charts-react" :refer [AgChartsReact]]
   ["react-dom/client" :refer [createRoot]]
   ["react" :as react]))

(defonce root
  (createRoot (js/document.getElementById "root")))

(defn init []
  (.render root (.createElement 
                  react
                  AgChartsReact
                  #js {:options #js {:data #js []}})))
