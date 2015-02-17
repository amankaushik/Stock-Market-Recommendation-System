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
        <script language="javascript" type="text/javascript">
            $(document).ready(function() {
                //document.getElementById("arp").style.display="none"; 
                var labels = document.getElementsByTagName('label'), l = labels.length, label, i;
                for (i = 0; i < l; i++) {
                    label = labels[i];
                    if (label.htmlFor == "webservice4_a_amt" || label.htmlFor == "webservice4_a_cost" ||
                            label.htmlFor == "webservice4_a_rate" || label.htmlFor == "webservice4_a_mnth") {
                        label.style.display = 'none';
                    }
                    if (label.htmlFor == "webservice4_le_amt" || label.htmlFor == "webservice4_le_cost" ||
                            label.htmlFor == "webservice4_le_rate" || label.htmlFor == "webservice4_le_mnth") {
                        label.style.display = 'none';
                    }
                    if (label.htmlFor == "webservice4_l_amt" ||
                            label.htmlFor == "webservice4_l_rate" || label.htmlFor == "webservice4_l_mnth") {
                        label.style.display = 'none';
                    }
                    if (label.htmlFor == "webservice4_m_amt" ||
                            label.htmlFor == "webservice4_m_rate" || label.htmlFor == "webservice4_m_mnth") {
                        label.style.display = 'none';
                    }

                }
                $('#webservice2_day').hide();

                $('#webservice4_a_amt').hide();
                $('#webservice4_a_cost').hide();
                $('#webservice4_a_rate').hide();
                $('#webservice4_a_mnth').hide();

                $('#webservice4_le_amt').hide();
                $('#webservice4_le_cost').hide();
                $('#webservice4_le_rate').hide();
                $('#webservice4_le_mnth').hide();

                $('#webservice4_l_amt').hide();
                $('#webservice4_l_rate').hide();
                $('#webservice4_l_mnth').hide();

                $('#webservice4_m_amt').hide();
                $('#webservice4_m_rate').hide();
                $('#webservice4_m_mnth').hide();

                $('#indexBy').change(function() {
                    if ($('#indexBy option:selected').text() == "Week") {
                        $('#webservice2_day').show();
                    }
                    else {
                        $('#webservice2_day').hide();
                    }
                });


                $('#all').change(function() {
                    if ($('#all option:selected').text() == "APR") {
                        for (i = 0; i < l; i++) {
                            label = labels[i];
                            if (label.htmlFor == "webservice4_a_amt" || label.htmlFor == "webservice4_a_cost" ||
                                    label.htmlFor == "webservice4_a_rate" || label.htmlFor == "webservice4_a_mnth") {
                                label.style.display = '';
                            }
                            if (label.htmlFor == "webservice4_le_amt" || label.htmlFor == "webservice4_le_cost" ||
                                    label.htmlFor == "webservice4_le_rate" || label.htmlFor == "webservice4_le_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_l_amt" ||
                                    label.htmlFor == "webservice4_l_rate" || label.htmlFor == "webservice4_l_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_m_amt" ||
                                    label.htmlFor == "webservice4_m_rate" || label.htmlFor == "webservice4_m_mnth") {
                                label.style.display = 'none';
                            }

                        }
                        $('#webservice4_a_amt').show();
                        $('#webservice4_a_cost').show();
                        $('#webservice4_a_rate').show();
                        $('#webservice4_a_mnth').show();

                        $('#webservice4_le_amt').hide();
                        $('#webservice4_le_cost').hide();
                        $('#webservice4_le_rate').hide();
                        $('#webservice4_le_mnth').hide();

                        $('#webservice4_l_amt').hide();
                        $('#webservice4_l_rate').hide();
                        $('#webservice4_l_mnth').hide();

                        $('#webservice4_m_amt').hide();
                        $('#webservice4_m_rate').hide();
                        $('#webservice4_m_mnth').hide();

                    }
                    else if ($('#all option:selected').text() == "Lease Monthly Payment") {
                        for (i = 0; i < l; i++) {
                            label = labels[i];
                            if (label.htmlFor == "webservice4_a_amt" || label.htmlFor == "webservice4_a_cost" ||
                                    label.htmlFor == "webservice4_a_rate" || label.htmlFor == "webservice4_a_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_le_amt" || label.htmlFor == "webservice4_le_cost" ||
                                    label.htmlFor == "webservice4_le_rate" || label.htmlFor == "webservice4_le_mnth") {
                                label.style.display = '';
                            }
                            if (label.htmlFor == "webservice4_l_amt" ||
                                    label.htmlFor == "webservice4_l_rate" || label.htmlFor == "webservice4_l_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_m_amt" ||
                                    label.htmlFor == "webservice4_m_rate" || label.htmlFor == "webservice4_m_mnth") {
                                label.style.display = 'none';
                            }

                        }
                        $('#webservice4_le_amt').show();
                        $('#webservice4_le_cost').show();
                        $('#webservice4_le_rate').show();
                        $('#webservice4_le_mnth').show();

                        $('#webservice4_l_amt').hide();
                        $('#webservice4_l_rate').hide();
                        $('#webservice4_l_mnth').hide();

                        $('#webservice4_m_amt').hide();
                        $('#webservice4_m_rate').hide();
                        $('#webservice4_m_mnth').hide();

                        $('#webservice4_a_amt').hide();
                        $('#webservice4_a_cost').hide();
                        $('#webservice4_a_rate').hide();
                        $('#webservice4_a_mnth').hide();
                    }
                    else if ($('#all option:selected').text() == "Loan Monthly Payment") {
                        for (i = 0; i < l; i++) {
                            label = labels[i];
                            if (label.htmlFor == "webservice4_a_amt" || label.htmlFor == "webservice4_a_cost" ||
                                    label.htmlFor == "webservice4_a_rate" || label.htmlFor == "webservice4_a_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_le_amt" || label.htmlFor == "webservice4_le_cost" ||
                                    label.htmlFor == "webservice4_le_rate" || label.htmlFor == "webservice4_le_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_l_amt" ||
                                    label.htmlFor == "webservice4_l_rate" || label.htmlFor == "webservice4_l_mnth") {
                                label.style.display = '';
                            }
                            if (label.htmlFor == "webservice4_m_amt" ||
                                    label.htmlFor == "webservice4_m_rate" || label.htmlFor == "webservice4_m_mnth") {
                                label.style.display = 'none';
                            }

                        }
                        $('#webservice4_l_amt').show();
                        $('#webservice4_l_rate').show();
                        $('#webservice4_l_mnth').show();
                        $('#webservice4_a_amt').hide();
                        $('#webservice4_a_cost').hide();
                        $('#webservice4_a_rate').hide();
                        $('#webservice4_a_mnth').hide();

                        $('#webservice4_le_amt').hide();
                        $('#webservice4_le_cost').hide();
                        $('#webservice4_le_rate').hide();
                        $('#webservice4_le_mnth').hide();
                        $('#webservice4_m_amt').hide();
                        $('#webservice4_m_rate').hide();
                        $('#webservice4_m_mnth').hide();
                    }
                    else {
                        for (i = 0; i < l; i++) {
                            label = labels[i];
                            if (label.htmlFor == "webservice4_a_amt" || label.htmlFor == "webservice4_a_cost" ||
                                    label.htmlFor == "webservice4_a_rate" || label.htmlFor == "webservice4_a_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_le_amt" || label.htmlFor == "webservice4_le_cost" ||
                                    label.htmlFor == "webservice4_le_rate" || label.htmlFor == "webservice4_le_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_l_amt" ||
                                    label.htmlFor == "webservice4_l_rate" || label.htmlFor == "webservice4_l_mnth") {
                                label.style.display = 'none';
                            }
                            if (label.htmlFor == "webservice4_m_amt" ||
                                    label.htmlFor == "webservice4_m_rate" || label.htmlFor == "webservice4_m_mnth") {
                                label.style.display = '';
                            }

                        }
                        $('#webservice4_a_amt').hide();
                        $('#webservice4_a_cost').hide();
                        $('#webservice4_a_rate').hide();
                        $('#webservice4_a_mnth').hide();

                        $('#webservice4_le_amt').hide();
                        $('#webservice4_le_cost').hide();
                        $('#webservice4_le_rate').hide();
                        $('#webservice4_le_mnth').hide();

                        $('#webservice4_l_amt').hide();
                        $('#webservice4_l_rate').hide();
                        $('#webservice4_l_mnth').hide();
                        $('#webservice4_m_amt').show();
                        $('#webservice4_m_rate').show();
                        $('#webservice4_m_mnth').show();
                    }
                });
            });</script>

        <!--<script language="javascript" type="text/javascript">
            function setHiddenValue(){
                var codeValue= $("#indexBy option:selected").text();
                var codeKey= $("#indexBy").val();
                $("#day").val(codevalue);
            }
        </script>!-->
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
            <div>
                <h4>Currency Converter</h4>
                <!--
                <form name="cc" method="post" action="currencyConverter">
                    <table>
                    <tr><td>Change From:</td><td><select name="ChangeFrom">
                        <option value="AUD">Australian Dollar</option>
                        <option value="GBP">British Pound</option>
                        <option value="CAD">Canadian Dollar</option>
                        <option value="CNY">Chinese Yuan</option>
                        <option value="EUR">Euro</option>
                        <option value="INR">Indian Rupee</option>
                        <option value="JPY">Japanese Yen</option>
                        <option value="NPR">Nepalese Rupee</option>
                        <option value="NZD">New Zealand Dollar</option>
                        <option value="RUB">Russian Rouble</option>
                        <option value="USD">U.S Dollar</option>
                    </select></td></tr>
                    <tr><td>Change To:</td><td><select name="ChangeTo">
                        <option value="AUD">Australian Dollar</option>
                        <option value="GBP">British Pound</option>
                        <option value="CAD">Canadian Dollar</option>
                        <option value="CNY">Chinese Yuan</option>
                        <option value="EUR">Euro</option>
                        <option value="INR">Indian Rupee</option>
                        <option value="JPY">Japanese Yen</option>
                        <option value="NPR">Nepalese Rupee</option>
                        <option value="NZD">New Zealand Dollar</option>
                        <option value="RUB">Russian Rouble</option>
                        <option value="USD">U.S Dollar</option>
                    </select></td></tr>
                    <tr><td>Amount :</td><td><input name="amt" type="text"/></td></tr>
                    <tr><td></td><td><input type="submit" value="Convert"></td></tr>
                    </table>
                </form>
                !-->
                <s:form method="post" action="webservice1">
                    <s:select label="Change From" headerKey="" headerValue="Select Currency"
                              emptyOption="false"
                              list="#@java.util.LinkedHashMap@{'AUD':'Australian Dollar',
                              'GBP':'British Pound',
                              'CAD':'Canadian Dollar',
                              'CNY':'Chinese Yuan',
                              'EUR':'Euro',
                              'INR':'Indian Rupee',
                              'JPY':'Japanese Yen',
                              'NPR':'Nepalese Rupee',
                              'NZD':'New Zealand Dollar',
                              'RUB':'Russian Rouble',
                              'USD':'US Dollar'}"
                              name="changeFrom" 
                              value="changeFrom" />
                    <s:select label="Change To" headerKey="" headerValue="Select Currency"
                              emptyOption="false"
                              list="#@java.util.LinkedHashMap@{'AUD':'Australian Dollar',
                              'GBP':'British Pound',
                              'CAD':'Canadian Dollar',
                              'CNY':'Chinese Yuan',
                              'EUR':'Euro',
                              'INR':'Indian Rupee',
                              'JPY':'Japanese Yen',
                              'NPR':'Nepalese Rupee',
                              'NZD':'New Zealand Dollar',
                              'RUB':'Russian Rouble',
                              'USD':'US Dollar'}"
                              name="changeTo" 
                              value="changeTo" />
                    <s:textfield name="amount" label="Amount"></s:textfield>
                    <s:submit value="Convert"/>       
                </s:form>
            </div>
            <hr>
            <div>
                <h4>Mortgage Index</h4>
                <s:form action="webservice2" method="post">
                    <s:select label="Mortage Index By" headerKey="" headerValue="Select Time Period"
                              emptyOption="false"
                              list="#@java.util.LinkedHashMap@{'1':'Week',
                              '2':'Month'}"
                              name="indexBy" 
                              value="indexBy" 
                              id="indexBy"/>

                    <%--    <s:select label="Day" headerKey="" headerValue="Select Day"
                                  list="#@java.util.LinkedHashMap@{'1':'Monday',
                                  '2':'Tuesday',
                                  '3':'Wednesday',
                                  '4':'Thursday',
                                  '5':'Friday',
                                  '6':'Saturday',
                                  '7':'Sunday'}"
                                  name="day" 
                                  value="day"/>
                    <s:select label="Month" headerKey="" headerValue="Select Month"
                              list="#@java.util.LinkedHashMap@{'1':'January',
                              '2':'Feburary',
                              '3':'March',
                              '4':'April',
                              '5':'May',
                              '6':'June',
                              '7':'July',
                              '8':'August',
                              '9':'September',
                              '10':'October',
                              '11':'November',
                              '12':'December'}"
                              name="month" 
                              value="month"/>
                    <s:textfield label="Year" name="year"></s:textfield> --%>
                    <s:submit value="Search"/>
                </s:form>
            </div>
            <hr>
            <div>
                <h4>Mortgage Calculator</h4>
                <s:form action="webservice3" method="post">
                    <s:textfield name="years" label="Years"></s:textfield>
                    <s:textfield name="interest" label="Interest Rate"></s:textfield>
                    <s:textfield name="loanamt" label="Loan Amount"></s:textfield>
                    <s:textfield name="anntax" label="Annual Tax"></s:textfield>
                    <s:textfield name="annins" label="Annual Insurance"></s:textfield>
                    <s:submit value="Calculate"></s:submit>
                </s:form>
            </div>
            <hr>
            <div>
                <h4>APR-Loan-Lease</h4>
                <s:form action="webservice4" method="post">
                    <s:select label="Services" headerKey="" headerValue="Select Service"
                              list="#@java.util.LinkedHashMap@{'1':'APR',
                              '2':'Lease Monthly Payment',
                              '3':'Loan Monthly Payment',
                              '4':'Loan Number of Payments'}"
                              name="all"
                              value="all"
                              id="all"/>

                    <s:textfield name="a_amt" label="Loan Amount"></s:textfield>
                    <s:textfield name="a_cost" label="Extra Cost"></s:textfield>
                    <s:textfield name="a_rate" label="Interest Rate"></s:textfield>
                    <s:textfield name="a_mnth" label="Months"></s:textfield>

                    <s:textfield name="le_amt" label="Loan Amount"></s:textfield>
                    <s:textfield name="le_cost" label="Residual Value"></s:textfield>
                    <s:textfield name="le_rate" label="Interest Rate"></s:textfield>
                    <s:textfield name="le_mnth" label="Months"></s:textfield>

                    <s:textfield name="l_amt" label="Loan Amount"></s:textfield>
                    <s:textfield name="l_rate" label="Interest Rate"></s:textfield>
                    <s:textfield name="l_mnth" label="Months"></s:textfield>

                    <s:textfield name="m_amt" label="Loan Amount"></s:textfield>
                    <s:textfield name="m_rate" label="Interest Rate"></s:textfield>
                    <s:textfield name="m_mnth" label="Monthly Payment"></s:textfield>
                    <s:submit value="Calculate"></s:submit>
                </s:form>
            </div>
            <hr>
            
            <div>
                <h4>Company Balance Sheet</h4>
                <s:form action="webservice5" method="post">
                    <s:textfield name="ticker" label="Company Ticker"></s:textfield>
                    <s:select label="Timeframe" headerKey="" headerValue="Select Timeframe"
                              list="#@java.util.LinkedHashMap@{'1':'Annual',
                              '2':'Quaterly'}"
                              name="timeframe"
                              value="timeframe"
                              id="timeframe"/>

                    <s:submit value="Get Info"></s:submit>
                </s:form>
            </div>
            <hr>
            
            <div>
                <h4>Company Income Statement</h4>
                <s:form action="webservice6" method="post">
                    <s:textfield name="ticker" label="Company Ticker"></s:textfield>
                    <s:select label="Timeframe" headerKey="" headerValue="Select Timeframe"
                              list="#@java.util.LinkedHashMap@{'1':'Annual',
                              '2':'Quaterly'}"
                              name="timeframe"
                              value="timeframe"
                              id="timeframe"/>

                    <s:submit value="Get Info"></s:submit>
                </s:form>
            </div>
            <hr>
            
            <div>
                <h4>Company Cash Flow</h4>
                <s:form action="webservice7" method="post">
                    <s:textfield name="ticker" label="Company Ticker"></s:textfield>
                    <s:select label="Timeframe" headerKey="" headerValue="Select Timeframe"
                              list="#@java.util.LinkedHashMap@{'1':'Annual',
                              '2':'Quaterly'}"
                              name="timeframe"
                              value="timeframe"
                              id="timeframe"/>

                    <s:submit value="Get Info"></s:submit>
                </s:form>
            </div>
        </div>

        <div class="bottomsection"></div>
        <script type="text/javascript" src="js/webflow.js"></script>
    </body>
</html>
