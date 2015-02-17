<%-- 
    Document   : register
    Created on : 3 Apr, 2014, 3:07:11 AM
    Author     : chanakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-wf-site="532d97a7f8a1091d7c000479">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Register</title>
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/webflow.css">
        <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
        <style type="text/css">

            html,body { height: 100%; margin: 0px; padding: 0px; }
            #full { height: 100%;
                    alignment-adjust: central;
            }
           

        </style>
    </head>
    <body>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
        <div class="w-container outercontainer" id="full">
            <s:form action="register">  
                <s:textfield name="uname" label="UserName"></s:textfield>
                <s:textfield name="name" label="Name"></s:textfield>
                <s:password name="password" label="Password"></s:password>
                <s:password name="cpassword" label="Confirm Password"></s:password>
                <s:textfield name="email" label="Email"></s:textfield>  
                <s:submit value="Register"></s:submit>  
            </s:form>
        </div>    
    </body>
</html>
