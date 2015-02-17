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
                <h4>Your Monthly Mortgage Payment</h4>
            </div>
            <div>
        <s:iterator value="mr" var="m">
            <table>
                <tr><td>Monthly Principal And Interest </td><td><s:property value="#m.monthlyPrincipalAndInterest"></s:property></td></tr>
                <tr><td>Monthly Tax </td><td><s:property value="#m.monthlyTax"></s:property></td></tr>
                <tr><td>monthly Insurance </td><td><s:property value="#m.monthlyInsurance"></s:property></td></tr>
                <tr><td>Total Payment </td><td><s:property value="#m.totalPayment"></s:property></td></tr>
            </table>
        </s:iterator>
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
