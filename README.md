# ag-charts-v6-bug

Simply mounting the charts component throws the following error in production:

```
react-dom.production.min.js:128 Uncaught ReferenceError: changeCb is not defined
    at f.set_visible [as visible] (eval at <anonymous> (changeDetectable.js:51:22), <anonymous>:13:25)
    at f [as constructor] (node.js:124:9)
    at new f (group.js:74:28)
    at n.S [as constructor] (chart.js:142:28)
    at new n (cartesianChart.js:102:28)
    at B.createChartInstance (agChartV2.js:354:20)
    at B.createOrUpdate (agChartV2.js:233:37)
    at B.create (agChartV2.js:128:32)
    at r.componentDidMount (agChartsReact.js:27:53)
    at pj (react-dom.production.min.js:262:217)
 ```
 
 Everything works as expected in development, and everything works as expected in a normal javascript project compiled with Vite.
