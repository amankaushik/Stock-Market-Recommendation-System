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
                    var time = <s:property value="all"></s:property>
                    if (time == "1"){
                        $('#month').hide();
                        $('#loan').hide();
                        $('#lease').hide();
                    } 
                    else if(time == "2"){
                        $('#month').hide();
                        $('#loan').hide();
                        $('#arp').hide();
                    }
                    else if(time == "3"){
                        $('#month').hide();
                        $('#arp').hide();
                        $('#lease').hide();
                    }
                    else{
                        $('#arp').hide();
                        $('#loan').hide();
                        $('#lease').hide();
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
                <h4>APR-Loan-Lease</h4>
            </div>
            <hr>
            <div>
                               <%
                        String apr = request.getAttribute("apr").toString();
                        String lease = request.getAttribute("lease").toString();
                        
                        String loan = request.getAttribute("loan").toString();
                        String month = request.getAttribute("month").toString();
                        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
                        //String.format("0.2f", apr);
                      //out.println("----------------------------------------------"+ticker);
                        %>
                    <div id="arp">
                        <h4>APR</h4>
                        <table>
                            <tr><td>Annual Percentage Rate: </td><td><%=df.format(Double.parseDouble(apr))%></td></tr>
                                                       </table>
                    </div>
                <div id="lease">
                    <h1>Monthly Lease</h1>
                        <table>
                            <tr><td>Monthly Lease Payment: </td><td><%=df.format(Double.parseDouble(lease))%> Dollars</td></tr>
                            </table>
                </div>
                <div id="loan">
                    <h1>Monthly Loan</h1>
                        <table>
                            <tr><td>Monthly Loan Payment: </td><td><%=df.format(Double.parseDouble(loan))%> Dollars</td></tr>
                            </table>
                </div>
                <div id="month">
                    <h1>Months</h1>
                        <table>
                            <tr><td>Number of Months: </td><td><%=df.format(Double.parseDouble(month))%> Months</td></tr>
                            </table>
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
