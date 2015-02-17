<%-- 
    Document   : currencyconverter
    Created on : 6 May, 2014, 4:05:25 AM
    Author     : chanakya
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script language="javascript" type="text/javascript">
            $(document).ready(function() {
                var timeframe = <s:property value="timeframe"></s:property>
                if (timeframe.toString() === "2") {
                    $('#quaterly').show();
                    $('#annual').hide();
                } else {
                    $('#quaterly').hide();
                    $('#annual').show();
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
                    <h4>Cash Flow</h4>
                </div>

                <hr>
                <div id="quaterly" style="margin: 10px;">
                    <h6>Quaterly Results<sup>All figures in Millions(USD)</sup></h6>
                    <table width="100%" style="margin: 10px;">
                        <tr><td><b>Period Ending</b></td>
                            <td><b><s:property value="one.period"></s:property></b></td>
                        <td><b><s:property value="two.period"></s:property></b></td>
                        <td><b><s:property value="three.period"></s:property></b></td>
                        <td><b><s:property value="four.period"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Assets</b></td></tr>

                        <tr><td><b>Net Income</b></td>

                            <td><s:property value="%{(one.NetIncome)/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.NetIncome/1000000.0}"></s:property></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Operating Activities, Cash Flows Provided By or Used In</b></td></tr>
                        <tr><td>Depreciation</td>
                            <td><s:property value="%{one.Depreciation/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Depreciation/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Depreciation/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.Depreciation/1000000.0}"></s:property></td></tr>
                        <tr><td>Adjustments To Net Income</td>
                            <td><s:property value="%{one.AdjustmentsToNetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.AdjustmentsToNetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.AdjustmentsToNetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.AdjustmentsToNetIncome/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Accounts Receivables</td>
                            <td><s:property value="%{one.ChangesInAccountsReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInAccountsReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInAccountsReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ChangesInAccountsReceivables/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Liabilities</td>
                            <td><s:property value="%{one.ChangesInLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ChangesInLiabilities/1000000.0}"></s:property></td></tr>

                        <tr><td>Changes In Inventories</td>
                            <td><s:property value="%{one.ChangesInInventories/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInInventories/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInInventories/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ChangesInInventories/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Other Operating Activities</td>
                            <td><s:property value="%{one.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>    
                        <tr><td>Total Cash Flow From operating Activities</td>
                            <td><b><s:property value="%{one.ChangesInLiabilities/1000000.0+one.ChangesInAccountsReceivables/1000000.0+one.AdjustmentsToNetIncome/1000000.0
                                    +one.Depreciation/1000000.0+one.NetIncome/1000000.0+
                                    one.ChangesInInventories/1000000.0+one.ChangesInOtherOperatingActivities/1000000.0+
                                    one.TotalCashFlowFromOperatingActivities/1000000.0+one.CapitalExpenditures/1000000.0+(one.TotalCashFlowsFromInvestingActivities+0.0)/1000000.0+
                                    one.OtherCashflowsfromInvestingActivities/1000000.0+(one.Investments+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.ChangesInLiabilities/1000000.0+two.ChangesInAccountsReceivables/1000000.0+two.AdjustmentsToNetIncome/1000000.0
                                    +two.Depreciation/1000000.0+two.NetIncome/1000000.0+
                                    two.ChangesInInventories/1000000.0+two.ChangesInOtherOperatingActivities/1000000.0+
                                    two.TotalCashFlowFromOperatingActivities/1000000.0+two.CapitalExpenditures/1000000.0+(two.TotalCashFlowsFromInvestingActivities+0.0)/1000000.0+
                                    two.OtherCashflowsfromInvestingActivities/1000000.0+(two.Investments+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.ChangesInLiabilities/1000000.0+three.ChangesInAccountsReceivables/1000000.0+three.AdjustmentsToNetIncome/1000000.0
                                    +three.Depreciation/1000000.0+three.NetIncome/1000000.0+
                                    three.ChangesInInventories/1000000.0+three.ChangesInOtherOperatingActivities/1000000.0+
                                    three.TotalCashFlowFromOperatingActivities/1000000.0+three.CapitalExpenditures/1000000.0+(three.Investments+0.0)/1000000.0+
                                    three.OtherCashflowsfromInvestingActivities/1000000.0+(three.TotalCashFlowsFromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.ChangesInLiabilities/1000000.0+four.ChangesInAccountsReceivables/1000000.0+four.AdjustmentsToNetIncome/1000000.0
                                    +four.Depreciation/1000000.0+four.NetIncome/1000000.0+
                                    four.ChangesInInventories/1000000.0+four.ChangesInOtherOperatingActivities/1000000.0+
                                    four.TotalCashFlowFromOperatingActivities/1000000.0+four.CapitalExpenditures/1000000.0+(four.Investments+0.0)/1000000.0+
                                    four.OtherCashflowsfromInvestingActivities/1000000.0+(four.TotalCashFlowsFromInvestingActivities+0.0)/1000000.0}"></s:property></b></td></tr>

                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Investing Activities, Cash Flows Provided By or Used In</b></td></tr>


                        <tr><td>Capital Expenditures</td>

                            <td><s:property value="%{one.CapitalExpenditures/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.CapitalExpenditures/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.CapitalExpenditures/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.CapitalExpenditures/1000000.0}"></s:property></td></tr>
                        <tr><td>Investments</td>
                            <td><s:property value="%{one.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.Investments/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Cash flows from Investing Activities</td>
                            <td><s:property value="%{one.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Cash Flows From Investing Activities</b></td>
                            <td><b><s:property value="%{(one.CapitalExpenditures+0.0)/1000000.0+(one.Investments+0.0)/1000000.0+
                                    (one.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.CapitalExpenditures+0.0)/1000000.0+(two.Investments+0.0)/1000000.0+
                                    (two.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.CapitalExpenditures+0.0)/1000000.0+(three.Investments+0.0)/1000000.0+
                                    (three.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(four.CapitalExpenditures+0.0)/1000000.0+(four.Investments+0.0)/1000000.0+
                                    (four.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td></tr>


                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Financing Activities, Cash Flows Provided By or Used In</b></td></tr>


                        <tr><td>Dividends Paid</td>
                            <td><s:property value="%{one.DividendsPaid/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.DividendsPaid/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.DividendsPaid/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.DividendsPaid/1000000.0}"></s:property></td></tr>

                        <tr><td>Sale Purchase of Stock</td>
                            <td><s:property value="%{one.SalePurchaseofStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.SalePurchaseofStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.SalePurchaseofStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.SalePurchaseofStock/1000000.0}"></s:property></td></tr>

                        <tr><td>Net Borrowings</td>
                            <td><s:property value="%{one.NetBorrowings/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetBorrowings/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetBorrowings/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.NetBorrowings/1000000.0}"></s:property></td></tr>

                        <tr><td>Other Cash Flows from Financing Activities</td>
                            <td><s:property value="%{one.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>

                        <tr><td><b>Total cash flow from financing Activities</b></td>

                        <td><b><s:property value="%{(one.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td>
                    <td><b><s:property value="%{(two.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td>
                    <td><b><s:property value="%{(three.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td>
                    <td><b><s:property value="%{(four.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td></tr>

                        <tr><td>Effect Of Exchange Rate Changes</td>

                        <td><s:property value="%{one.EffectOfExchangeRateChanges/1000000.0}"></s:property></td>
                    <td><s:property value="%{two.EffectOfExchangeRateChanges/1000000.0}"></s:property></td>
                    <td><s:property value="%{three.EffectOfExchangeRateChanges/1000000.0}"></s:property></td>
                    <td><s:property value="%{four.EffectOfExchangeRateChanges/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Change In Cash and Cash Equivalents</b></td>
                            <td><s:property value="%{one.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td></tr>
                </table>
            </div>
                <div id="annual" style="margin: 10px;">
                    <h6>Annual Results<sup>All figures in Millions(USD)</sup></h6>
                    <table width="100%" style="margin: 10px;">
                        <tr><td><b>Period Ending</b></td>
                            <td><b><s:property value="one.period"></s:property></b></td>
                        <td><b><s:property value="two.period"></s:property></b></td>
                        <td><b><s:property value="three.period"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Assets</b></td></tr>

                        <tr><td><b>Net Income</b></td>

                            <td><s:property value="%{(one.NetIncome)/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncome/1000000.0}"></s:property></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Operating Activities, Cash Flows Provided By or Used In</b></td></tr>
                        <tr><td>Depreciation</td>
                            <td><s:property value="%{one.Depreciation/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Depreciation/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Depreciation/1000000.0}"></s:property></td></tr>
                        <tr><td>Adjustments To Net Income</td>
                            <td><s:property value="%{one.AdjustmentsToNetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.AdjustmentsToNetIncome/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.AdjustmentsToNetIncome/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Accounts Receivables</td>
                            <td><s:property value="%{one.ChangesInAccountsReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInAccountsReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInAccountsReceivables/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Liabilities</td>
                            <td><s:property value="%{one.ChangesInLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInLiabilities/1000000.0}"></s:property></td></tr>

                        <tr><td>Changes In Inventories</td>
                            <td><s:property value="%{one.ChangesInInventories/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInInventories/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInInventories/1000000.0}"></s:property></td></tr>
                        <tr><td>Changes In Other Operating Activities</td>
                            <td><s:property value="%{one.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangesInOtherOperatingActivities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>    
                        <tr><td>Total Cash Flow From operating Activities</td>
                            <td><b><s:property value="%{one.ChangesInLiabilities/1000000.0+one.ChangesInAccountsReceivables/1000000.0+one.AdjustmentsToNetIncome/1000000.0
                                    +one.Depreciation/1000000.0+one.NetIncome/1000000.0+
                                    one.ChangesInInventories/1000000.0+one.ChangesInOtherOperatingActivities/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.ChangesInLiabilities/1000000.0+two.ChangesInAccountsReceivables/1000000.0+two.AdjustmentsToNetIncome/1000000.0
                                    +two.Depreciation/1000000.0+two.NetIncome/1000000.0+
                                    two.ChangesInInventories/1000000.0+two.ChangesInOtherOperatingActivities/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.ChangesInLiabilities/1000000.0+three.ChangesInAccountsReceivables/1000000.0+three.AdjustmentsToNetIncome/1000000.0
                                    +three.Depreciation/1000000.0+three.NetIncome/1000000.0+
                                    three.ChangesInInventories/1000000.0+three.ChangesInOtherOperatingActivities/1000000.0}"></s:property></b></td></tr>

                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Investing Activities, Cash Flows Provided By or Used In</b></td></tr>


                        <tr><td>Capital Expenditures</td>

                            <td><s:property value="%{one.CapitalExpenditures/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.CapitalExpenditures/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.CapitalExpenditures/1000000.0}"></s:property></td></tr>
                        <tr><td>Investments</td>
                            <td><s:property value="%{one.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Investments/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.Investments/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Cash flows from Investing Activities</td>
                            <td><s:property value="%{one.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.OtherCashflowsfromInvestingActivities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Cash Flows From Investing Activities</b></td>
                            <td><b><s:property value="%{(one.CapitalExpenditures+0.0)/1000000.0+(one.Investments+0.0)/1000000.0+
                                    (one.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.CapitalExpenditures+0.0)/1000000.0+(two.Investments+0.0)/1000000.0+
                                    (two.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.CapitalExpenditures+0.0)/1000000.0+(three.Investments+0.0)/1000000.0+
                                    (three.OtherCashflowsfromInvestingActivities+0.0)/1000000.0}"></s:property></b></td></tr>


                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Financing Activities, Cash Flows Provided By or Used In</b></td></tr>


                        <tr><td>Dividends Paid</td>
                            <td><s:property value="%{one.DividendsPaid/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.DividendsPaid/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.DividendsPaid/1000000.0}"></s:property></td></tr>

                        <tr><td>Sale Purchase of Stock</td>
                            <td><s:property value="%{one.SalePurchaseofStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.SalePurchaseofStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.SalePurchaseofStock/1000000.0}"></s:property></td></tr>

                        <tr><td>Net Borrowings</td>
                            <td><s:property value="%{one.NetBorrowings/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetBorrowings/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetBorrowings/1000000.0}"></s:property></td></tr>

                        <tr><td>Other Cash Flows from Financing Activities</td>
                            <td><s:property value="%{one.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.OtherCashFlowsfromFinancingActivities/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>

                        <tr><td><b>Total cash flow from financing Activities</b></td>

                        <td><b><s:property value="%{(one.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td>
                    <td><b><s:property value="%{(two.TotalCashFlowsFromFinancingActivities+0.0)/1000000.0}"></s:property></b></td>
                    <td><b><s:property value="%{(three.TotalCashFlowsFromFinancingActivities+0.0)/1000000}"></s:property></b></td></tr>

                        <tr><td>Effect Of Exchange Rate Changes</td>

                        <td><s:property value="%{one.EffectOfExchangeRateChanges/1000000.0}"></s:property></td>
                    <td><s:property value="%{two.EffectOfExchangeRateChanges/1000000.0}"></s:property></td>
                    <td><s:property value="%{three.EffectOfExchangeRateChanges/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Change In Cash and Cash Equivalents</b></td>
                            <td><s:property value="%{one.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ChangeInCashandCashEquivalents/1000000.0}"></s:property></td></tr>
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
