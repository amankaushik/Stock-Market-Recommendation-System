<%-- 
    Document   : companyfinancials
    Created on : 6 May, 2014, 5:52:58 AM
    Author     : chanakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:iterator value="fdl" var="f">
            <s:property value="#f.type"></s:property>
            <s:property value="#f.name"></s:property>
            <s:property value="#f.unit"></s:property>
            <s:property value="#f.description"></s:property>
            <s:property value="#f.valueType"></s:property>
        </s:iterator>
    </body>
</html>
