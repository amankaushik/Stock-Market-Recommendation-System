<%-- 
    Document   : stockQuote
    Created on : 16 Mar, 2014, 4:49:09 PM
    Author     : chanakya
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- This site was created in Webflow. http://www.webflow.com-->
<!-- Last Published: Sat Mar 22 2014 17:26:45 GMT+0000 (UTC) -->
<html data-wf-site="532d97a7f8a1091d7c000479">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="refresh" content="900">
        <title>MinorProject - stockQuote</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/normalize2.css">
        <link rel="stylesheet" type="text/css" href="css/webflow2.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow2.css">
        <script type="text/javascript" src="js/modernizr2.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="https://y7v4p6k4.ssl.hwcdn.net/placeholder/favicon.ico">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script type="text/javascript" src="js/highstock.js"></script>
        <script src="http://code.highcharts.com/stock/modules/exporting.js"></script>
        <script src="themes/grid.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/webflow.js"></script>
        <style type="text/css">
            table.details {
            }
            table.details td {
                padding-left: 50px;
                padding-right: 40px;
            }
        </style>    
                                
    </head>
    <body>
        <div class="topsection">
            <div class="w-row">
                <div class="w-col w-col-3"></div>
                <div class="w-col w-col-6">
                    <h1><a href="home.jsp">Investing Strategy</a></h1>
                </div>
                <div class="w-col w-col-3">
                    <div class="w-container">
                        <div>
                            <div class="w-row">
                                <div class="w-col w-col-6"><a href="login.jsp">Login</a>
                                </div>
                                <div class="w-col w-col-6"><a href="register.jsp">Register</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="w-container outercontainer">
            <div>
                <div class="topdiv">
                    
                </div>
                <div class="middlediv">
                    <div class="w-row">
                        <s:iterator value="sd" var="s">
                            <script language="javascript" type="text/javascript">
                                        
                                        $( document ).ready(function () {
                                            var change = <s:property value="#s.Change"></s:property>
                                            var dlow = <s:property value="#s.DaysLow"></s:property>
                                            var pchange = ((change/dlow)*100).toFixed(2);
                                            var result1, result2;
                                            if(Number(change) > 0){
                                                result1 = ('+'+String(change)).fontcolor("green");
                                                result2 = ('+'+String(pchange)+'%').fontcolor("green");
                                                }
                                            else{
                                                result1 = (String(change)).fontcolor("red");
                                                result2 = (String(pchange)+'%').fontcolor("red");
                                            }
                                            document.getElementById("res1").innerHTML=result1;
                                            document.getElementById("res2").innerHTML=result2;
                                        });
                            </script>
                            <div class="w-col">
                                <h1><s:property value="#s.Name"></s:property></h1>
                                <hr>
                                <span><h2><span style="padding-left:40px"><s:property value="#s.Ask"></s:property></span> <span id="res1"></span>(<span id="res2"></span>)</h2><span>
                                <hr>
                            </div>
                            <div class="w-col w-col-6 middledivcolumn">
                                <table cellpadding="0" cellspacing="0" class="details">
                                    <tr><td>Symbol: </td><td><span style="float:right"><b><s:property value="#s.Symbol"/></b></span></td></tr> 
                                    <td colspan="2"><hr></td>
                                    <tr><td>Open: </td><td><span style="float:right"><b><s:property value="#s.Open"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Ask: </td><td><span style="float:right"><b><s:property value="#s.Ask"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Change: </td><td><span style="float:right"><b><s:property value="#s.Change"/></b></span></td></tr> 
                                    <td colspan="2"><hr></td>
                                    <tr><td>Day's Low: </td><td><span style="float:right"><b><s:property value="#s.DaysLow"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Day's High: </td><td><span style="float:right"><b><s:property value="#s.DaysHigh"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>P/E Ratio: </td><td><span style="float:right"><b><s:property value="#s.PERaito"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Day's Range: </td><td><span style="float:right"><b><s:property value="#s.DaysRange"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Volume: </td><td><span style="float:right"><b><s:property value="#s.Volume"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Average Daily Volume: </td><td><span style="float:right"><b><s:property value="#s.AverageDailyVolume"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>    
                                </table>
                            </div>
                            <div class="w-col w-col-6 middledivcolumn">
                                <table cellpadding="0" cellspacing="0" align="right" class="details">
                                    <tr><td>Last Trade Price: </td><td><span style="float:right"><b><s:property value="#s.LastTradePriceOnly"/></b></span></td></tr> 
                                    <td colspan="2"><hr></td>
                                    <tr><td>Last Trade Date: </td><td><span style="float:right"><b><s:property value="#s.LastTradeDate"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Percent Change: </td><td><span style="float:right"><b><s:property value="#s.PercentChange"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Fifty day Moving Average: </td><td><span style="float:right"><b><s:property value="#s.FiftydayMovingAverage"/></b></span></td></tr> 
                                    <td colspan="2"><hr></td>
                                    <tr><td>Previous Close: </td><td><span style="float:right"><b><s:property value="#s.PreviousClose"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Change in Percent: </td><td><span style="float:right"><b><s:property value="#s.ChangeinPercent"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>PEG Ratio: </td><td><span style="float:right"><b><s:property value="#s.PEGRatio"/></b></span></td></tr> 
                                    <td colspan="2"><hr></td>
                                    <tr><td>Year Range: </td><td><span style="float:right"><b><s:property value="#s.YearRange"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Days Value Change: </td><td><span style="float:right"><b><s:property value="#s.DaysValueChange"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>
                                    <tr><td>Stock Exchange: </td><td><span style="float:right"><b><s:property value="#s.StockExchange"/></b></span></td></tr>
                                    <td colspan="2"><hr></td>                
                               </table>
                            </div>
                        </s:iterator> 
                    </div>
                </div>
                <hr>
                <div class="middlediv">
                    <%
                        String ticker = request.getAttribute("StockQuote").toString();
                      //out.println("----------------------------------------------"+ticker);
%>
                    <div class="w-row middledivcolumn">
                        <div class="w-col w-col-9" id="container">
                            <script language="javascript" type="text/javascript">
                                        var tick = "<%=ticker%>";
                                        $( document ).ready(function () {
                                                $.getJSON('http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.historicaldata%20where%20symbol%20%3D%20%22'+tick.toString().toUpperCase()+'%22%20and%20startDate%20%3D%20%222013-01-26%22%20and%20endDate%20%3D%20%222014-03-27%22%0A%09%09&format=json&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=', function (data) {

                                                var ohlc = [],
                                                        volume = [],
                                                        dataLength = data.query.count;
                                                        for (i = 0; i < dataLength; i++) {
                                                var milliTime = new Date(data.query.results.quote[i].Date);
                                                        milliTime = milliTime.getTime();
                                                        ohlc.push([
                                                                milliTime, // the date
                                                                parseFloat(data.query.results.quote[i].Open), // open
                                                                parseFloat(data.query.results.quote[i].High), // high
                                                                parseFloat(data.query.results.quote[i].Low), // low
                                                                parseFloat(data.query.results.quote[i].Close) // close
                                                        ]);
                                                        volume.push([
                                                                milliTime, // the date
                                                                parseFloat(data.query.results.quote[i].Volume) // the volume
                                                        ]);
                                                }
                                                ohlc = ohlc.reverse();
                                                        volume = volume.reverse();
                                                        var groupingUnits = [
                                                                [
                                                                        'week', // unit name
                                                                        [1] // allowed multiples
                                                                ],
                                                                [
                                                                        'month', [1, 2, 3, 4, 6]]
                                                        ];
                                                        $('#container').highcharts('StockChart', {

                                                rangeSelector: {
                                                inputEnabled: $('#container').width() > 480,
                                                        selected: 1
                                                },
                                                        title: {
                                                        text: ' ' + tick.toString().toUpperCase() + ' Historical'
                                                        },
                                                        yAxis: [{
                                                        title: {
                                                        text: 'OHLC'
                                                        },
                                                                height: 160,
                                                                lineWidth: 2
                                                        }, {
                                                        title: {
                                                        text: 'Volume'
                                                        },
                                                                top: 248,
                                                                height: 60,
                                                                offset: 0,
                                                                lineWidth: 2
                                                        }],
                                                        series: [{
                                                        type: 'candlestick',
                                                                name: tick.toString().toUpperCase(),
                                                                data: ohlc,
                                                                dataGrouping: {
                                                                units: groupingUnits
                                                                }
                                                        }, {
                                                        type: 'column',
                                                                name: 'Volume',
                                                                data: volume,
                                                                yAxis: 1,
                                                                dataGrouping: {
                                                                units: groupingUnits
                                                                }
                                                        }]
                                                });
                                                });
                                                });
                            </script>
                            <!--<script src="http://charts.wikinvest.com/wikinvest/wikichart/javascript/scripts.php" type="text/javascript"></script><div id="wikichartContainer_F18B3537-1437-020D-6050-CC9F799FE1CB"><div style="width: 700px; text-align: center; vertical-align: center; margin-top: 150px;"><a href="http://get.adobe.com/flashplayer/"><img src="http://cdn.wikinvest.com/wikinvest/images/adobe_flash_logo.gif" alt="Flash" style="border-width: 0px;"/><br/>Flash Player 9 or higher is required to view the chart<br/><strong>Click here to download Flash Player now</strong></a></div></div><script type="text/javascript">if (typeof(embedWikichart) != "undefined") {embedWikichart("http://charts.wikinvest.com/WikiChartMini.swf","wikichartContainer_F18B3537-1437-020D-6050-CC9F799FE1CB","700","500",{"embedCodeDate":"2014-3-17","ticker":tick,"showAnnotations":"true","rollingDate":"1 day","liveQuote":"true"},{});}</script><div style="font-size:9px;text-align:right;width:700px;font-family:Verdana"><a href="http://www.wikinvest.com/chart/"+tick style="text-decoration:underline; color:#0000ee;"></div>-->
                        </div>
                        <div class="w-col w-col-3">
                            <s:form action="stockQuote" method="get">
                                <s:textfield label="Stock Quote" key="StockQuote"></s:textfield>
                                <s:submit></s:submit>
                            </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="bottomsection"></div>

    </body>
</html>