<%-- 
    Document   : webservice
    Created on : 6 May, 2014, 2:34:14 AM
    Author     : chanakya
--%>

<!DOCTYPE html>
<!-- This site was created in Webflow. http://www.webflow.com-->
<!-- Last Published: Sat Mar 22 2014 16:04:46 GMT+0000 (UTC) -->
<html data-wf-site="532d97a7f8a1091d7c000479">
    <head>
        <meta charset="utf-8">
        <title>MinorProject</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/webflow.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
        <script type="text/javascript" src="js/modernizr.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="https://y7v4p6k4.ssl.hwcdn.net/placeholder/favicon.ico">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script language="javascript" type="text/javascript"></script>
    </head>
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>
        <div class="topsection">
            <div class="w-row">
                <div class="w-col w-col-3"></div>
                <div class="w-col w-col-6">
                    <a href="home.jsp"><h1>Investing Strategy</h1></a>
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
            <h4>Search for Commodities</h4>
            <s:form action="c_display" method="post">
                <s:textfield name="cticker" label="Commodity Ticker"/>
                <s:submit value="Search"></s:submit>
            </s:form>
            <hr>
            <form action="c_check" method="post">
                Commodity Name: <input type="text" name="cname" /><br>
                <input type="hidden" name="viewid" value="commodity.jsp"/>
                Commodity Ticker: <input type="text" name="ticker"disabled="true" value="${requestScope.ccheck}"/>
                <input type="submit" value="Check"/>
            </form>
        </div>
        
    <div class="bottomsection"></div>
    </body>
</html>
