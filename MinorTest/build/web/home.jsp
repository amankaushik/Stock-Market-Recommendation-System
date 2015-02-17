<%-- 
    Document   : home
    Created on : 16 Mar, 2014, 3:58:39 AM
    Author     : chanakya
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- This site was created in Webflow. http://www.webflow.com-->
<!-- Last Published: Sat Mar 22 2014 16:04:46 GMT+0000 (UTC) -->
<html data-wf-site="532d97a7f8a1091d7c000479">
<head>
  <meta charset="utf-8">
  <title>MinorProject</title>
  <meta http-equiv="refresh" content="900">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="css/normalize.css">
  <link rel="stylesheet" type="text/css" href="css/webflow.css">
  <link rel="stylesheet" type="text/css" href="css/minorproject.webflow.css">
  <script type="text/javascript" src="js/modernizr.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="https://y7v4p6k4.ssl.hwcdn.net/placeholder/favicon.ico">
</head>
<body>
  <div class="topsection">
    <div class="w-row">
        <div class="w-col w-col-3">
            <div style="float: left">
                <a href="webservice.jsp">Web Services</a><br>
                <a href="commodity.jsp">Commodities</a><br>
                <a href="etf.jsp">Exchange Trade Funds</a>
            </div>
        </div>
      <div class="w-col w-col-6">
          <h1><a href="home.jsp">Investing Strategy</a></h1>
      </div>
      <div class="w-col w-col-3">
        <div class="w-container">
          <div>
            <div class="w-row">
              <div class="w-col w-col-6"><a href="login.jsp">Login</a>
              </div>
              <div class="w-col w-col-6"><a href="register.jsp">Register</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="w-container outercontainer">
      <div class="firstdiv">
        <script type="text/javascript" src="http://forexminute.com/forexminutetools/fxticker.js" ></script><div class="tciker_scroll" align="center" id="forex-widget" data-width="900" data-height="30" data-speed="1" ></div>
      </div>
    <div class="middlediv">
      <div class="w-row middledivcolumn">
        <div class="w-col w-col-8">
            <div class="middleinnerdiv">
                <h5><u>Leading Stocks</u></h5>
            <iframe frameborder="0" scrolling="no" height="192" width="559" allowtransparency="true" marginwidth="0" marginheight="0" src="http://eqrates.investing.com/index.php?pairs_ids=277;347;6408;243;282;346;396;&header-text-color=%23FFFFFF&curr-name-color=%230059b0&inner-text-color=%23000000&green-text-color=%232A8215&green-background=%23B7F4C2&red-text-color=%23DC0001&red-background=%23FFE2E2&inner-border-color=%23CBCBCB&border-color=%23cbcbcb&bg1=%23F6F6F6&bg2=%23ffffff&last_update=hide"></iframe><div style="width:559px;"><span><span style="font-size: 11px;color: #333333;text-decoration: none;"></span></div>
            </div>
            <br>
          <div class="middleinnerdiv">
            <div class="w-row">
                <div class="w-col w-col-7">
                    <h5><u>Market Quotes</u></h5>
                    <iframe frameborder="0" scrolling="no" height="287" width="300" allowtransparency="true" marginwidth="0" marginheight="0" src="http://tools.investing.com/market_quotes.php?tab_1=1,2,3,5,7,9&tab_2=169,166,20,172,27,178&tab_3=8830,8849,8836,8862,8831,8988&tab_4=8880,8907,8900,8899,8886,8895&select_color=000000&default_color=0059B0"> </iframe><br /><div style="width:300px"><span style="font-size: 11px;color: #333333;text-decoration: none;"></span></div>
                </div>
                <div class="w-col w-col-5">
                    <s:form action="stockQuote" method="get">
                        <s:textfield label="Stock Quote" key="StockQuote"></s:textfield>
                        <s:submit></s:submit>
                    </s:form>
                </div>
            </div>
          </div>
            <br>
            <h5><u>Business News</u></h5>
          <div class="middleinnerdiv">
              <script src="http://www.reddit.com/r/businessnews/top/.embed?limit=10&t=week" type="text/javascript"></script></div>
          </div>
          <div class="w-col w-col-4">
            <div class="middleinnerdiv">
                <h5><u>Market Indices</u></h5>
                <iframe src="http://tsw.forexprostools.com?&forex=1,2,3,5,7,9,10&commodities=8830,8836,8831,8849,8833,8862,8832&indices=169,20,166,172,27,167,178&stocks=6408,6369,243,267,7888,284,8090&tabs=1,2,3,4" width="295" height="460"></iframe><div class="poweredBy"><span style="font-size: 8px;color: #333333;text-decoration: none;"></span></div>
            </div>
            <br>
            <div class="middleinnerdiv">
                <h5><u>Market Sentiment</u></h5>
                <a class="twitter-timeline" href="https://twitter.com/amankaushik104/financetweets" data-widget-id="447065025228718080">Tweets from https://twitter.com/amankaushik104/financetweets</a>
                <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
            </div>
            <br>
            <div class="middleinnerdiv">
                <h5><u>What People Feel</u></h5>
                <a class="twitter-timeline" href="https://twitter.com/search?q=%23apple+OR+%23microsoft+OR+%23google+OR+%23yahoo" width="300" height="300" data-widget-id="445310648423952384">Tweets about "#apple OR #microsoft OR #google OR #yahoo"</a>
                <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
            </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bottomsection"></div>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
  <script type="text/javascript" src="js/webflow.js"></script>
</body>
</html>