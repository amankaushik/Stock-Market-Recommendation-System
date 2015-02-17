<%-- 
    Document   : currencyconverter
    Created on : 6 May, 2014, 4:05:25 AM
    Author     : chanakya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  <link rel="shortcut icon" type="image/x-icon" href="https://y7v4p6k4.ssl.hwcdn.net/placeholder/favicon.ico">
</head>
<body>
    <%@ taglib uri="/struts-tags" prefix="s" %>
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
          <h4> Converted Currency</h4>
      </div>
      <hr>
      <div>
          <table>
              <tr><td>From Currency: </td><td><s:property value="changeFrom"></s:property></td></tr>
          <tr><td>To Currency: </td><td><s:property value="changeTo"></s:property></td></tr>
          <tr><td>Amount: </td><td><s:property value="amount"></s:property></td></tr>
          <tr><td>Conversion rate is: </td><td><s:property value="rate"></s:property></td></tr>
          <tr><td>Your Converted Amount is: </td><td><s:property value="value"></s:property></td></tr>
          </table>
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
