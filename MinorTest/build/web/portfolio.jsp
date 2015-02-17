<%-- 
    Document   : portfolio
    Created on : 4 Apr, 2014, 5:24:01 PM
    Author     : chanakya
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portfolio</title>
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/webflow.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="themes/grid.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/webflow.js"></script>
        <style type="text/css">
            html,body { height: 100%; margin: 0px; padding: 0px; }
            #full { height: 100%;
                    alignment-adjust: central;
            }
        </style>
    </head>
    <body>
        <%
            String hasP = request.getAttribute("hasPortfolio").toString();
        %>

        <script language="javascript" type="text/javascript">
            var hasPortfolio = "<%=hasP%>";
            //alert(hasPortfolio);
            $(document).ready(function() {
                if (hasPortfolio == "1") {
                    var divOne = document.getElementById('2');
                    divOne.style.display = 'none';
                }
                else {
                    var divOne = document.getElementById('1');
                    divOne.style.display = 'none';
                }
            });
        </script>
        <div class="w-container outercontainer" id="full">
            <div id="1">
                <h3>Your Stocks</h3>
                
                <hr>
                <div>
                    <table border="1">
                        <tr>
                            <th>Ticker</th><th>Quantity</th><th>Buy Price</th><th>Action</th>
                        </tr>
                    <s:iterator value="all_values" var="val">
                        <tr>
                        <td><s:property value="#val.ticker"></s:property></td> 
                        <td><s:property value="#val.quantity"></s:property></td>    
                        <td><s:property value="#val.buy_price"></s:property></td>
                        <td><s:form action="delFromPortfolio" method="get">
                                <s:hidden name="ticker"  id="ticker" value="%{#val.ticker}"/>
                                <s:hidden name="quantity"  id="quantity" value="%{#val.quantity}"/>
                                <s:hidden name="buy_price"  id="buy_price" value="%{#val.buy_price}"/>
                            <s:submit value="Remove"></s:submit>
                        </s:form></td>
                        </tr>
                        
                    </s:iterator>
                        </table>
                </div>
                <hr>
                <div>
                    <h5>Search Stocks below and add to your Portfolio</h5>
                    <s:form action="lstockQuote" method="get">
                        <s:textfield label="Stock Quote" key="StockQuote"></s:textfield>
                        <s:submit></s:submit>
                    </s:form>
                </div>
            </div>
            <div id="2">
                <h3 align="center">Portfolio Empty!</h3>
                <div>
                    <h5>Search Stocks below and add to your Portfolio</h5>
                    <s:form action="lstockQuote" method="get">
                        <s:textfield label="Stock Quote" key="StockQuote"></s:textfield>
                        <s:submit></s:submit>
                    </s:form>
                </div>
            </div>
        </div>    
    </body>
</html>
