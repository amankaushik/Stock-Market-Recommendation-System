<%-- 
    Document   : portfolio
    Created on : 3 Apr, 2014, 4:24:15 AM
    Author     : chanakya
--%>

<jsp:include page="index.jsp"></jsp:include>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/webflow.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
        <script src="themes/grid.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/webflow.js"></script>
        <style type="text/css">
            html,body { height: 100%; margin: 0px; padding: 0px; }
            #full { height: 100%;
                    alignment-adjust: central;
            }
        </style>
        <SCRIPT type="text/javascript">
    //window.history.forward();
    //function noBack() { window.history.forward(); }
</SCRIPT>
        <title>Login Success</title>
    </head>
    <body onload="noBack();"
    onpageshow="if (event.persisted) noBack();" onunload="">
        <div class="w-container outercontainer" id="full">
        <h1>Welcome, <s:property value="username"></s:property> ! </h1>
        <div>
            <s:form action="portfolio">
                <tr><td> View Your Portfolio : </td><td><s:submit value="View"></s:submit></td></tr>
            </s:form>
        <%--    
            <s:form action="profile">
                View Your Porfile : <s:submit value="View"></s:submit>
            </s:form>
        --%>
        </div>
        </div>
    </body>
</html>
