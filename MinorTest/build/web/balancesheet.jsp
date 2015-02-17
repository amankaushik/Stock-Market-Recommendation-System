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
                    <h4>Balance Sheet</h4>
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
                        <tr><td><b>Current Assets</td></tr>
                        <tr><td style="padding-left:4em">Cash And Cash Equivalents</td>
                            
                            <td><s:property value="%{(one.cashAndCashEquivalents)/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.cashAndCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.cashAndCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.cashAndCashEquivalents/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Short Term Investments</td>
                            <td><s:property value="%{one.shortTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.shortTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.shortTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.shortTermInvestments/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Net Receivables</td>
                            <td><s:property value="%{one.netReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.netReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.netReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.netReceivables/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Inventory</td>
                            <td><s:property value="%{one.inventory/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.inventory/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.inventory/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.inventory/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Other Current Assets</td>
                            <td><s:property value="%{one.otherCurrentAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherCurrentAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherCurrentAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherCurrentAssets/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Current Assets</b></td>
                            <td><b><s:property value="%{one.otherCurrentAssets/1000000.0+one.inventory/1000000.0+one.netReceivables/1000000.0
                                    +one.shortTermInvestments/1000000.0+one.cashAndCashEquivalents/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.otherCurrentAssets/1000000.0+two.inventory/1000000.0+two.netReceivables/1000000.0
                                    +two.shortTermInvestments/1000000.0+two.cashAndCashEquivalents/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.otherCurrentAssets/1000000.0+three.inventory/1000000.0+three.netReceivables/1000000.0
                                    +three.shortTermInvestments/1000000.0+three.cashAndCashEquivalents/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.otherCurrentAssets/1000000.0+four.inventory/1000000.0+four.netReceivables/1000000.0
                                    +four.shortTermInvestments/1000000.0+four.cashAndCashEquivalents/1000000.0}"></s:property></b></td></tr>
                        <tr><td>Long Term Investments</td>
                            <td><s:property value="%{one.longTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.longTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.longTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.longTermInvestments/1000000.0}"></s:property></td></tr>
                        <tr><td>Property Plant and Equipment</td>
                            <td><s:property value="%{one.propertyPlantandEquipment/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.propertyPlantandEquipment/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.propertyPlantandEquipment/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.propertyPlantandEquipment/1000000.0}"></s:property></td></tr>
                        <tr><td>Goodwill</td>
                            <td><s:property value="%{one.goodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.goodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.goodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.goodwill/1000000.0}"></s:property></td></tr>
                        <tr><td>Intangible Assets</td>
                            <td><s:property value="%{one.intangibleAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.intangibleAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.intangibleAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.intangibleAssets/1000000.0}"></s:property></td></tr>
                        <tr><td>Accumulated Amortization</td>
                            <td><s:property value="%{one.accumulatedAmortization/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.accumulatedAmortization/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.accumulatedAmortization/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.accumulatedAmortization/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Assets</td>
                            <td><s:property value="%{one.otherAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherAssets/1000000.0}"></s:property></td></tr>
                        <tr><td>Deferred Long Term Asset Charges</td>
                            <td><s:property value="%{one.deferredLongTermAssetCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.deferredLongTermAssetCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.deferredLongTermAssetCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.deferredLongTermAssetCharges/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Assets</b></td>
                            <td><b><s:property value="%{one.otherCurrentAssets/1000000.0+one.inventory/1000000.0+one.netReceivables/1000000.0
                                    +one.shortTermInvestments/1000000.0+one.cashAndCashEquivalents/1000000.0+
                                    one.longTermInvestments/1000000.0+one.propertyPlantandEquipment/1000000.0+
                                    one.goodwill/1000000.0+one.intangibleAssets/1000000.0+(one.deferredLongTermAssetCharges+0.0)/1000000.0+
                                    one.otherAssets/1000000.0+(one.accumulatedAmortization+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.otherCurrentAssets/1000000.0+two.inventory/1000000.0+two.netReceivables/1000000.0
                                    +two.shortTermInvestments/1000000.0+two.cashAndCashEquivalents/1000000.0+
                                    two.longTermInvestments/1000000.0+two.propertyPlantandEquipment/1000000.0+
                                    two.goodwill/1000000.0+two.intangibleAssets/1000000.0+(two.deferredLongTermAssetCharges+0.0)/1000000.0+
                                    two.otherAssets/1000000.0+(two.accumulatedAmortization+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.otherCurrentAssets/1000000.0+three.inventory/1000000.0+three.netReceivables/1000000.0
                                    +three.shortTermInvestments/1000000.0+three.cashAndCashEquivalents/1000000.0+
                                    three.longTermInvestments/1000000.0+three.propertyPlantandEquipment/1000000.0+
                                    three.goodwill/1000000.0+three.intangibleAssets/1000000.0+(three.accumulatedAmortization+0.0)/1000000.0+
                                    three.otherAssets/1000000.0+(three.deferredLongTermAssetCharges+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.otherCurrentAssets/1000000.0+four.inventory/1000000.0+four.netReceivables/1000000.0
                                    +four.shortTermInvestments/1000000.0+four.cashAndCashEquivalents/1000000.0+
                                    four.longTermInvestments/1000000.0+four.propertyPlantandEquipment/1000000.0+
                                    four.goodwill/1000000.0+four.intangibleAssets/1000000.0+(four.accumulatedAmortization+0.0)/1000000.0+
                                    four.otherAssets/1000000.0+(four.deferredLongTermAssetCharges+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Liabilities</b></td></tr>
                        <tr><td><b>Current Liabilities</td></tr>
                        <tr><td style="padding-left:4em">Accounts Payable</td>
                            <td><s:property value="%{(one.accountsPayable)/1000000.0}"></s:property></td>
                        <td><s:property value="%{(two.accountsPayable)/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.accountsPayable/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.accountsPayable/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Short/Current Long Term Debt</td>
                            <td><s:property value="%{one.shortCurrentLongTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.shortCurrentLongTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.shortCurrentLongTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.shortCurrentLongTermDebt/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Other Current Liabilities</td>
                            <td><s:property value="%{one.otherCurrentLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherCurrentLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherCurrentLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherCurrentLiabilities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Current Liabilities</b></td>	
                            <td><b><s:property value="%{(one.accountsPayable+0.0)/1000000.0+(one.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (one.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.accountsPayable+0.0)/1000000.0+(two.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (two.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.accountsPayable+0.0)/1000000.0+(three.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (three.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(four.accountsPayable+0.0)/1000000.0+(four.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (four.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td>Long Term Debt</td>
                            <td><s:property value="%{one.longTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.longTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.longTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.longTermDebt/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Liabilities</td>
                            <td><s:property value="%{one.otherLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherLiabilities/1000000.0}"></s:property></td></tr>
                        <tr><td>Deferred Long Term Liability Charges</td>
                            <td><s:property value="%{one.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td></tr>
                        <tr><td>Minority Interest</td>
                            <td><s:property value="%{one.minorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.minorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.minorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.minorityInterest/1000000.0}"></s:property></td></tr>
                        <tr><td>Negative Goodwill</td>
                            <td><s:property value="%{one.negativeGoodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.negativeGoodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.negativeGoodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.negativeGoodwill/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Liabilities</b></td>
                            <td><b><s:property value="%{(one.accountsPayable+0.0)/1000000.0+(one.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (one.otherCurrentLiabilities+0.0)/1000000.0
                                    +(one.longTermDebt+0.0)/1000000.0+(one.otherLiabilities+0.0)/1000000.0+
                                    (one.deferredLongTermLiabilityCharges+0.0)/1000000.0+(one.minorityInterest+0.0)/1000000.0+
                                    (one.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.accountsPayable+0.0)/1000000.0+(two.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (two.otherCurrentLiabilities+0.0)/1000000.0
                                    +(two.longTermDebt+0.0)/1000000.0+(two.otherLiabilities+0.0)/1000000.0+
                                    (two.deferredLongTermLiabilityCharges+0.0)/1000000.0+(two.minorityInterest+0.0)/1000000.0+
                                    (two.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.accountsPayable+0.0)/1000000.0+(three.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (three.otherCurrentLiabilities+0.0)/1000000.0
                                    +(three.longTermDebt+0.0)/1000000.0+(three.otherLiabilities+0.0)/1000000.0+
                                    (three.deferredLongTermLiabilityCharges+0.0)/1000000.0+(three.minorityInterest+0.0)/1000000.0+
                                    (three.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(four.accountsPayable+0.0)/1000000.0+(four.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (four.otherCurrentLiabilities+0.0)/1000000.0
                                    +(four.longTermDebt+0.0)/1000000.0+(four.otherLiabilities+0.0)/1000000.0+
                                    (four.deferredLongTermLiabilityCharges+0.0)/1000000.0+(four.minorityInterest+0.0)/1000000.0+
                                    (four.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Stockholders' Equity</b></td></tr>
                        <tr><td>Misc Stocks Options Warrants</td>
                            <td><s:property value="%{one.miscStocksOptionsWarrants/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.miscStocksOptionsWarrants/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.miscStocksOptionsWarrants/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.miscStocksOptionsWarrants/1000000.0}"></s:property></td></tr>
                        <tr><td>Redeemable Preferred Stock</td>
                            <td><s:property value="%{one.redeemablePreferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.redeemablePreferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.redeemablePreferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.redeemablePreferredStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Preferred Stock</td>
                            <td><s:property value="%{one.preferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.preferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.preferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.preferredStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Common Stock</td>
                            <td><s:property value="%{one.commonStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.commonStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.commonStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.commonStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Retained Earnings</td>
                            <td><s:property value="%{one.retainedEarnings/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.retainedEarnings/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.retainedEarnings/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.retainedEarnings/1000000.0}"></s:property></td></tr>
                        <tr><td>Treasury Stock</td>
                            <td><s:property value="%{one.treasuryStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.treasuryStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.treasuryStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.treasuryStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Capital Surplus</td>
                            <td><s:property value="%{one.capitalSurplus/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.capitalSurplus/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.capitalSurplus/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.capitalSurplus/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Stockholder Equity</td>
                            <td><s:property value="%{one.otherStockholderEquity/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherStockholderEquity/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherStockholderEquity/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherStockholderEquity/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Stockholder Equity</b></td>
                            <td><b><s:property value="%{(one.miscStocksOptionsWarrants+0.0)/1000000.0+(one.redeemablePreferredStock+0.0)/1000000.0+
                                    (one.preferredStock+0.0)/1000000.0
                                    +(one.commonStock+0.0)/1000000.0+(one.retainedEarnings+0.0)/1000000.0+
                                    (one.treasuryStock+0.0)/1000000.0+(one.capitalSurplus+0.0)/1000000.0+
                                    (one.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.miscStocksOptionsWarrants+0.0)/1000000.0+(two.redeemablePreferredStock+0.0)/1000000.0+
                                    (two.preferredStock+0.0)/1000000.0
                                    +(two.commonStock+0.0)/1000000.0+(two.retainedEarnings+0.0)/1000000.0+
                                    (two.treasuryStock+0.0)/1000000.0+(two.capitalSurplus+0.0)/1000000.0+
                                    (two.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.miscStocksOptionsWarrants+0.0)/1000000.0+(three.redeemablePreferredStock+0.0)/1000000.0+
                                    (three.preferredStock+0.0)/1000000.0
                                    +(three.commonStock+0.0)/1000000.0+(three.retainedEarnings+0.0)/1000000.0+
                                    (three.treasuryStock+0.0)/1000000.0+(three.capitalSurplus+0.0)/1000000.0+
                                    (three.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(four.miscStocksOptionsWarrants+0.0)/1000000.0+(four.redeemablePreferredStock+0.0)/1000000.0+
                                    (four.preferredStock+0.0)/1000000.0
                                    +(four.commonStock+0.0)/1000000.0+(four.retainedEarnings+0.0)/1000000.0+
                                    (four.treasuryStock+0.0)/1000000.0+(four.capitalSurplus+0.0)/1000000.0+
                                    (four.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Tangible Assets</b></td>
                            <td><b><s:property value="%{one.netTangibleAssets/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.netTangibleAssets/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.netTangibleAssets/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.netTangibleAssets/1000000.0}"></s:property></b></td></tr>
                    </table>
                </div>
                <div id="annual">
                    <h6>Annual Results<sup>All figures in Millions(USD)</sup></h6>
                    <table width="100%" style="margin: 10px;">
                        <tr><td><b>Period Ending</b></td>
                            <td><b><s:property value="one.period"></s:property></b></td>
                        <td><b><s:property value="two.period"></s:property></b></td>
                        <td><b><s:property value="three.period"></s:property></b></td>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Assets</b></td></tr>
                        <tr><td><b>Current Assets</td></tr>
                        <tr><td style="padding-left:4em">Cash And Cash Equivalents</td>
                            <td><s:property value="%{(one.cashAndCashEquivalents*1.0)/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.cashAndCashEquivalents/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.cashAndCashEquivalents/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Short Term Investments</td>
                            <td><s:property value="%{one.shortTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.shortTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.shortTermInvestments/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Net Receivables</td>
                            <td><s:property value="%{one.netReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.netReceivables/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.netReceivables/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Inventory</td>
                            <td><s:property value="%{one.inventory/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.inventory/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.inventory/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Other Current Assets</td>
                            <td><s:property value="%{one.otherCurrentAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherCurrentAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherCurrentAssets/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Current Assets</b></td>
                            <td><b><s:property value="%{one.otherCurrentAssets/1000000.0+one.inventory/1000000.0+one.netReceivables/1000000.0
                                    +one.shortTermInvestments/1000000.0+one.cashAndCashEquivalents/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.otherCurrentAssets/1000000.0+two.inventory/1000000.0+two.netReceivables/1000000.0
                                    +two.shortTermInvestments/1000000.0+two.cashAndCashEquivalents/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.otherCurrentAssets/1000000.0+three.inventory/1000000.0+three.netReceivables/1000000.0
                                    +three.shortTermInvestments/1000000.0+three.cashAndCashEquivalents/1000000.0}"></s:property></b></td></tr>
                        <tr><td>Long Term Investments</td>
                            <td><s:property value="%{one.longTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.longTermInvestments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.longTermInvestments/1000000.0}"></s:property></td>
                        <tr><td>Property Plant and Equipment</td>
                            <td><s:property value="%{one.propertyPlantandEquipment/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.propertyPlantandEquipment/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.propertyPlantandEquipment/1000000.0}"></s:property></td></tr>
                        <tr><td>Goodwill</td>
                            <td><s:property value="%{one.goodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.goodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.goodwill/1000000.0}"></s:property></td></tr>
                        <tr><td>Intangible Assets</td>
                            <td><s:property value="%{one.intangibleAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.intangibleAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.intangibleAssets/1000000.0}"></s:property></td></tr>
                        <tr><td>Accumulated Amortization</td>
                            <td><s:property value="%{one.accumulatedAmortization/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.accumulatedAmortization/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.accumulatedAmortization/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Assets</td>
                            <td><s:property value="%{one.otherAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherAssets/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherAssets/1000000.0}"></s:property></td></tr>
                        <tr><td>Deferred Long Term Asset Charges</td>
                            <td><s:property value="%{one.deferredLongTermAssetCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.deferredLongTermAssetCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.deferredLongTermAssetCharges/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Assets</b></td>
                            <td><b><s:property value="%{one.otherCurrentAssets/1000000.0+one.inventory/1000000.0+one.netReceivables/1000000.0
                                    +one.shortTermInvestments/1000000.0+one.cashAndCashEquivalents/1000000.0+
                                    one.longTermInvestments/1000000.0+one.propertyPlantandEquipment/1000000.0+
                                    one.goodwill/1000000.0+one.intangibleAssets/1000000.0+(one.deferredLongTermAssetCharges+0.0)/1000000.0+
                                    one.otherAssets/1000000.0+(one.accumulatedAmortization+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.otherCurrentAssets/1000000.0+two.inventory/1000000.0+two.netReceivables/1000000.0
                                    +two.shortTermInvestments/1000000.0+two.cashAndCashEquivalents/1000000.0+
                                    two.longTermInvestments/1000000.0+two.propertyPlantandEquipment/1000000.0+
                                    two.goodwill/1000000.0+two.intangibleAssets/1000000.0+(two.deferredLongTermAssetCharges+0.0)/1000000.0+
                                    two.otherAssets/1000000.0+(two.accumulatedAmortization+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.otherCurrentAssets/1000000.0+three.inventory/1000000.0+three.netReceivables/1000000.0
                                    +three.shortTermInvestments/1000000.0+three.cashAndCashEquivalents/1000000.0+
                                    three.longTermInvestments/1000000.0+three.propertyPlantandEquipment/1000000.0+
                                    three.goodwill/1000000.0+three.intangibleAssets/1000000.0+(three.accumulatedAmortization+0.0)/1000000.0+
                                    three.otherAssets/1000000.0+(three.deferredLongTermAssetCharges+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Liabilities</b></td></tr>
                        <tr><td><b>Current Liabilities</td></tr>
                        <tr><td style="padding-left:4em">Accounts Payable</td>
                            <td><s:property value="%{(one.accountsPayable)/1000000.0}"></s:property></td>
                        <td><s:property value="%{(two.accountsPayable)/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.accountsPayable/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Short/Current Long Term Debt</td>
                            <td><s:property value="%{one.shortCurrentLongTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.shortCurrentLongTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.shortCurrentLongTermDebt/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Other Current Liabilities</td>
                            <td><s:property value="%{one.otherCurrentLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherCurrentLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherCurrentLiabilities/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Current Liabilities</b></td>	
                            <td><b><s:property value="%{(one.accountsPayable+0.0)/1000000.0+(one.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (one.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.accountsPayable+0.0)/1000000.0+(two.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (two.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.accountsPayable+0.0)/1000000.0+(three.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (three.otherCurrentLiabilities+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td>Long Term Debt</td>
                            <td><s:property value="%{one.longTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.longTermDebt/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.longTermDebt/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Liabilities</td>
                            <td><s:property value="%{one.otherLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherLiabilities/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherLiabilities/1000000.0}"></s:property></td></tr>
                        <tr><td>Deferred Long Term Liability Charges</td>
                            <td><s:property value="%{one.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.deferredLongTermLiabilityCharges/1000000.0}"></s:property></td></tr>
                        <tr><td>Minority Interest</td>
                            <td><s:property value="%{one.minorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.minorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.minorityInterest/1000000.0}"></s:property></td></tr>
                        <tr><td>Negative Goodwill</td>
                            <td><s:property value="%{one.negativeGoodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.negativeGoodwill/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.negativeGoodwill/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Liabilities</b></td>
                            <td><b><s:property value="%{(one.accountsPayable+0.0)/1000000.0+(one.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (one.otherCurrentLiabilities+0.0)/1000000.0
                                    +(one.longTermDebt+0.0)/1000000.0+(one.otherLiabilities+0.0)/1000000.0+
                                    (one.deferredLongTermLiabilityCharges+0.0)/1000000.0+(one.minorityInterest+0.0)/1000000.0+
                                    (one.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.accountsPayable+0.0)/1000000.0+(two.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (two.otherCurrentLiabilities+0.0)/1000000.0
                                    +(two.longTermDebt+0.0)/1000000.0+(two.otherLiabilities+0.0)/1000000.0+
                                    (two.deferredLongTermLiabilityCharges+0.0)/1000000.0+(two.minorityInterest+0.0)/1000000.0+
                                    (two.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.accountsPayable+0.0)/1000000.0+(three.shortCurrentLongTermDebt+0.0)/1000000.0+
                                    (three.otherCurrentLiabilities+0.0)/1000000.0
                                    +(three.longTermDebt+0.0)/1000000.0+(three.otherLiabilities+0.0)/1000000.0+
                                    (three.deferredLongTermLiabilityCharges+0.0)/1000000.0+(three.minorityInterest+0.0)/1000000.0+
                                    (three.negativeGoodwill+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey" colspan="5"><b>Stockholders' Equity</b></td></tr>
                        <tr><td>Misc Stocks Options Warrants</td>
                            <td><s:property value="%{one.miscStocksOptionsWarrants/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.miscStocksOptionsWarrants/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.miscStocksOptionsWarrants/1000000.0}"></s:property></td></tr>
                        <tr><td>Redeemable Preferred Stock</td>
                            <td><s:property value="%{one.redeemablePreferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.redeemablePreferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.redeemablePreferredStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Preferred Stock</td>
                            <td><s:property value="%{one.preferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.preferredStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.preferredStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Common Stock</td>
                            <td><s:property value="%{one.commonStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.commonStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.commonStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Retained Earnings</td>
                            <td><s:property value="%{one.retainedEarnings/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.retainedEarnings/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.retainedEarnings/1000000.0}"></s:property></td></tr>
                        <tr><td>Treasury Stock</td>
                            <td><s:property value="%{one.treasuryStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.treasuryStock/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.treasuryStock/1000000.0}"></s:property></td></tr>
                        <tr><td>Capital Surplus</td>
                            <td><s:property value="%{one.capitalSurplus/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.capitalSurplus/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.capitalSurplus/1000000.0}"></s:property></td></tr>
                        <tr><td>Other Stockholder Equity</td>
                            <td><s:property value="%{one.otherStockholderEquity/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherStockholderEquity/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherStockholderEquity/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Total Stockholder Equity</b></td>
                            <td><b><s:property value="%{(one.miscStocksOptionsWarrants+0.0)/1000000.0+(one.redeemablePreferredStock+0.0)/1000000.0+
                                    (one.preferredStock+0.0)/1000000.0
                                    +(one.commonStock+0.0)/1000000.0+(one.retainedEarnings+0.0)/1000000.0+
                                    (one.treasuryStock+0.0)/1000000.0+(one.capitalSurplus+0.0)/1000000.0+
                                    (one.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(two.miscStocksOptionsWarrants+0.0)/1000000.0+(two.redeemablePreferredStock+0.0)/1000000.0+
                                    (two.preferredStock+0.0)/1000000.0
                                    +(two.commonStock+0.0)/1000000.0+(two.retainedEarnings+0.0)/1000000.0+
                                    (two.treasuryStock+0.0)/1000000.0+(two.capitalSurplus+0.0)/1000000.0+
                                    (two.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{(three.miscStocksOptionsWarrants+0.0)/1000000.0+(three.redeemablePreferredStock+0.0)/1000000.0+
                                    (three.preferredStock+0.0)/1000000.0
                                    +(three.commonStock+0.0)/1000000.0+(three.retainedEarnings+0.0)/1000000.0+
                                    (three.treasuryStock+0.0)/1000000.0+(three.capitalSurplus+0.0)/1000000.0+
                                    (three.otherStockholderEquity+0.0)/1000000.0}"></s:property></b></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Tangible Assets</b></td>
                            <td><b><s:property value="%{one.netTangibleAssets/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.netTangibleAssets/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.netTangibleAssets/1000000.0}"></s:property></b></td></tr>
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
