<%-- 
    Document   : logout_success
    Created on : 3 Apr, 2014, 4:31:57 AM
    Author     : chanakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <SCRIPT type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</SCRIPT>
      
        <title>Logout Success</title>
    </head>
    <body onload="noBack();"
    onpageshow="if (event.persisted) noBack();" onunload="" >
        <h1>Logout Success</h1>
        <a href="login.jsp">Login</a> Again.
        Go to <a href="home.jsp">Home </a> Page.
    </body>
</html>
