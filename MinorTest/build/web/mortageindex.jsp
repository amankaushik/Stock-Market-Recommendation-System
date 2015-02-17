<%-- 
    Document   : currencyconverter
    Created on : 6 May, 2014, 4:05:25 AM
    Author     : chanakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html data-wf-site="532d97a7f8a1091d7c000479">
    <head>
        <meta charset="utf-8">
        <title>MinorProject</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/webflow.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
        <script type="text/javascript" src="js/modernizr.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="https://y7v4p6k4.ssl.hwcdn.net/placeholder/favicon.ico">
        <script language="javascript" type="text/javascript">

                            $(document).ready(function () {
                    var time = <s:property value="indexBy"></s:property>
                    if (time == "1"){
                    $('#month').hide();
                    } else{
                    $('#week').hide();
                    }
                    });                    
                </script>
    </head>
    <body>

        <div class="topsection">
            <div class="w-row">
                <div class="w-col w-col-3"></div>
                <div class="w-col w-col-6">
                    <h1>Investing Strategy</h1>
                </div>
                <div class="w-col w-col-3">
                    <div class="w-container">
                        <div>
                            <!--
                          <div class="w-row">
                            <div class="w-col w-col-6"><a href="#">Login</a>
                            </div>
                            <div class="w-col w-col-6"><a href="#">Register</a>
                            </div>
                          </div>
                            !-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="w-container outercontainer">
            <div>
                <h4>Mortage Index</h4>
            </div>
            <hr>
            <div>
                               
                    <div id="week">
                        <h4>Current Mortage Index by Week</h4>
                    <s:iterator value="wi_cur" var="wc">
                        <table>
                            <tr><td>Index Date: </td><td><s:property value="#wc.indexDate"></s:property></td></tr>
                            <tr><td>One Year Constant Maturity Treasury: </td><td><s:property value="#wc.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Three Year Constant Maturity Treasury </td><td><s:property value="#wc.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Five Year Constant Maturity Treasury: </td><td><s:property value="#wc.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Six Month Treasury Bill: </td><td><s:property value="#wc.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Three Month Secondary Market CD </td><td><s:property value="#wc.threeMonthSecondaryMarketCD"></s:property></td></tr>
                            </table>
                    </s:iterator>
                </div>
                <div id="month">
                    <h1>Current Mortage Index by Month</h1>
                    <s:iterator value="mi_cur" var="mi">
                        <table>
                            <tr><td>Index Date: </td><td><s:property value="#mi.indexDate"></s:property></td></tr>
                            <tr><td>One Year Constant Maturity Treasury: </td><td><s:property value="#mi.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Three Year Constant Maturity Treasury </td><td><s:property value="#mi.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Five Year Constant Maturity Treasury: </td><td><s:property value="#mi.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Six Month Treasury Bill: </td><td><s:property value="#mi.sixMonthTreasuryBill"></s:property></td></tr>
                            <tr><td>Three Month Secondary Market CD </td><td><s:property value="#mi.threeMonthSecondaryMarketCD"></s:property></td></tr>
                            <tr><td>Six Month Secondary Market CD: </td><td><s:property value="#mi.sixMonthSecondaryMarketCD"></s:property></td></tr>
                            <tr><td>Eleventh District COFI: </td><td><s:property value="#mi.eleventhDistrictCOFI"></s:property></td></tr>
                            <tr><td>Cost Of Savings Index: </td><td><s:property value="#mi.costOfSavingsIndex"></s:property></td></tr>
                            <tr><td>One Month LIBOR: </td><td><s:property value="#mi.oneMonthLIBOR"></s:property></td></tr>
                            <tr><td>Three Month LIBOR: </td><td><s:property value="#mi.threeMonthLIBOR"></s:property></td></tr>
                            <tr><td>Six Month LIBOR: </td><td><s:property value="#mi.sixMonthLIBOR"></s:property></td></tr>
                            <tr><td>One Year LIBOR: </td><td><s:property value="#mi.oneYearLIBOR"></s:property></td></tr>
                            <tr><td>Cost Of Deposits Index: </td><td><s:property value="#mi.costOfDepositsIndex"></s:property></td></tr>
                            <tr><td>Twelve Month Treasury Average: </td><td><s:property value="#mi.twelveMonthTreasuryAverage"></s:property></td></tr>
                            </table>
                    </s:iterator>
                </div>
            </div>
            <hr>
            <div>
                <tr><td><a href="webservice.jsp">Go Back</a></td></tr>
            </div>
        </div>
        <div class="bottomsection"></div>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script type="text/javascript" src="js/webflow.js"></script>
    </body>
</html>
