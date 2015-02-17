<%-- 
    Document   : stockQuote
    Created on : 16 Mar, 2014, 4:49:09 PM
    Author     : chanakya
--%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="grey">
        <h1><s:property value="StockQuote"/></h1>
        <s:iterator value="sd" var="s"> 
            <div>
                <ul>
                    <li>Change: <s:property value="#s.Change"/></li> 
                    <li>Name: <s:property value="#s.Name"/></li>
                    <li>Opening Price: <s:property value="#s.Open"/> </li>
                    <li>Volume: <s:property value="#s.Volume"/></li>
                </ul>
            </div>
        </s:iterator> 
        <%
            String ticker = request.getAttribute("StockQuote").toString();
            //out.println("----------------------------------------------"+ticker);
            %>
        <div>
           <!-- 
            <script src="http://charts.wikinvest.com/wikinvest/wikichart/javascript/scripts.php" type="text/javascript"></script><div id="wikichartContainer_AEDC48FC-B079-A85A-3F0E-CC5907CFD2B4"><div style="width: 100%; text-align: center; vertical-align: center; margin-top: 100px;"><a href="http://get.adobe.com/flashplayer/"><img src="http://cdn.wikinvest.com/wikinvest/images/adobe_flash_logo.gif" alt="Flash" style="border-width: 0px;"/><br/>Flash Player 9 or higher is required to view the chart<br/><strong>Click here to download Flash Player now</strong></a></div></div><script type="text/javascript">if (typeof(embedWikichart) != "undefined") {embedWikichart("http://charts.wikinvest.com/WikiChartMini.swf","wikichartContainer_AEDC48FC-B079-A85A-3F0E-CC5907CFD2B4","570","365",{"ticker":tick,"startDate":"17-09-2013","liveQuote":"true","embedCodeDate":"2014-3-17","endDate":"17-03-2014","showAnnotations":"true"},{});}</script><div style="font-size:9px;text-align:right;width:100%;font-family:Verdana"><a href="http://www.wikinvest.com/chart/"+tick style="text-decoration:underline; color:#0000ee;"></div>
           -->
        </div>
            <div>
                <script language="javascript" type="text/javascript">
                    var tick="<%=ticker%>"; 
                </script>
                <script src="http://charts.wikinvest.com/wikinvest/wikichart/javascript/scripts.php" type="text/javascript"></script><div id="wikichartContainer_F18B3537-1437-020D-6050-CC9F799FE1CB"><div style="width: 700px; text-align: center; vertical-align: center; margin-top: 150px;"><a href="http://get.adobe.com/flashplayer/"><img src="http://cdn.wikinvest.com/wikinvest/images/adobe_flash_logo.gif" alt="Flash" style="border-width: 0px;"/><br/>Flash Player 9 or higher is required to view the chart<br/><strong>Click here to download Flash Player now</strong></a></div></div><script type="text/javascript">if (typeof(embedWikichart) != "undefined") {embedWikichart("http://charts.wikinvest.com/WikiChartMini.swf","wikichartContainer_F18B3537-1437-020D-6050-CC9F799FE1CB","700","500",{"embedCodeDate":"2014-3-17","ticker":tick,"showAnnotations":"true","rollingDate":"1 day","liveQuote":"true"},{});}</script><div style="font-size:9px;text-align:right;width:700px;font-family:Verdana"><a href="http://www.wikinvest.com/chart/"+tick style="text-decoration:underline; color:#0000ee;"></div>
            </div>
    </body>
</html>
