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
                    <h4>Income Statement</h4>
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
                        <tr><td><b>Total Revenue</b></td>

                            <td><b><s:property value="%{one.totalRevenue/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.totalRevenue/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.totalRevenue/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.totalRevenue/1000000.0}"></s:property></b></td></tr>

                        <tr><td>Cost of Revenue</td>
                            <td><s:property value="%{one.CostofRevenue/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.CostofRevenue/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.CostofRevenue/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.CostofRevenue/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>

                        <tr><td><b>Gross Profit</b></td>
                            <td><b><s:property value="%{one.GrossProfit/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.GrossProfit/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.GrossProfit/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.GrossProfit/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Operating Expenses</b></td></tr>

                        <tr><td style="padding-left:4em">Research Development</td>
                            <td><s:property value="%{one.ResearchDevelopment/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ResearchDevelopment/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ResearchDevelopment/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ResearchDevelopment/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Selling General and Administrative</td>
                            <td><s:property value="%{one.SellingGeneralandAdministrative/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.SellingGeneralandAdministrative/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.SellingGeneralandAdministrative/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.SellingGeneralandAdministrative/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Non Recurring</td>
                            <td><s:property value="%{one.NonRecurring/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NonRecurring/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NonRecurring/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.NonRecurring/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Others</td>
                            <td><s:property value="%{one.Others/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Others/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Others/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.Others/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em" colspan="5"><b><hr></b><td></tr>
                        <tr><td style="padding-left:4em">Total operating Expenses</td>
                            <td><s:property value="%{one.TotalOperatingExpenses/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.TotalOperatingExpenses/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.TotalOperatingExpenses/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.TotalOperatingExpenses/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Operating Income or Loss</b></td>
                            <td><b><s:property value="%{one.OperatingIncomeorLoss/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.OperatingIncomeorLoss/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.OperatingIncomeorLoss/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.OperatingIncomeorLoss/1000000.0}"></s:property></b></td></tr>

                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Income from Continuing Operations</b></td></tr>


                        <tr><td style="padding-left:4em">Total Other Income_Expenses Net</td>

                            <td><s:property value="%{one.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Earnings Before  Interest And Taxes</td>
                            <td><s:property value="%{one.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Interest Expense</td>
                            <td><s:property value="%{one.InterestExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.InterestExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.InterestExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.InterestExpense/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Income Before Tax</td>
                            <td><s:property value="%{one.IncomeBeforeTax/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.IncomeBeforeTax/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.IncomeBeforeTax/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.IncomeBeforeTax/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Income Tax Expense</td>
                            <td><s:property value="%{one.incomeTaxExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.incomeTaxExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.incomeTaxExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.incomeTaxExpense/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Minority Interest</td>
                            <td><s:property value="%{one.MinorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.MinorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.MinorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.MinorityInterest/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em" colspan="4"><hr><td></tr>

                        <tr><td style="padding-left:4em">Net Income From Continuing Ops</td>
                            <td><s:property value="%{one.NetIncomeFromContinuingOps/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncomeFromContinuingOps/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncomeFromContinuingOps/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.NetIncomeFromContinuingOps/1000000.0}"></s:property></td></tr>
                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Non-recurring Events</b></td></tr>

                        <tr><td style="padding-left:4em">Discontinued Operations</td>
                            <td><s:property value="%{one.DiscontinuedOperations/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.DiscontinuedOperations/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.DiscontinuedOperations/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.DiscontinuedOperations/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Extraordinary Items</td>
                            <td><s:property value="%{one.ExtraordinaryItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ExtraordinaryItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ExtraordinaryItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.ExtraordinaryItems/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Effect Of Accounting Changes</td>
                            <td><s:property value="%{one.EffectOfAccountingChanges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.EffectOfAccountingChanges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.EffectOfAccountingChanges/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.EffectOfAccountingChanges/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Other Items</td>
                            <td><s:property value="%{one.otherItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.otherItems/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Income</b></td>
                            <td><b><s:property value="%{one.NetIncome/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.NetIncome/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.NetIncome/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{four.NetIncome/1000000.0}"></s:property></b></td></tr>

                        <tr><td>Preferred Stock And Other Adjustments</td>
                            <td><s:property value="%{one.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Income Applicable To Common Shares</b></td>
                            <td><s:property value="%{one.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td>
                        <td><s:property value="%{four.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td></tr>



                    </table>
                </div>
                <div id="annual" style="margin: 10px;">
                    <h6>Annual Results<sup>All figures in Millions(USD)</sup></h6>
                    <table width="100%" style="margin: 10px;">
                        <tr><td><b>Period Ending</b></td>
                            <td><b><s:property value="one.period"></s:property></b></td>
                        <td><b><s:property value="two.period"></s:property></b></td>
                        <td><b><s:property value="three.period"></s:property></b></td></tr>
                        <tr><td><b>Total Revenue</b></td>

                            <td><b><s:property value="%{one.totalRevenue/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.totalRevenue/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.totalRevenue/1000000.0}"></s:property></b></td></tr>

                        <tr><td>Cost of Revenue</td>
                            <td><s:property value="%{one.CostofRevenue/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.CostofRevenue/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.CostofRevenue/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>

                        <tr><td><b>Gross Profit</b></td>
                            <td><b><s:property value="%{one.GrossProfit/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.GrossProfit/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.GrossProfit/1000000.0}"></s:property></b></td></tr>
                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Operating Expenses</b></td></tr>

                        <tr><td style="padding-left:4em">Research Development</td>
                            <td><s:property value="%{one.ResearchDevelopment/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ResearchDevelopment/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ResearchDevelopment/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Selling General and Administrative</td>
                            <td><s:property value="%{one.SellingGeneralandAdministrative/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.SellingGeneralandAdministrative/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.SellingGeneralandAdministrative/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Non Recurring</td>
                            <td><s:property value="%{one.NonRecurring/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NonRecurring/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NonRecurring/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Others</td>
                            <td><s:property value="%{one.Others/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.Others/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.Others/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em" colspan="5"><b><hr></b><td></tr>
                        <tr><td style="padding-left:4em">Total operating Expenses</td>
                            <td><s:property value="%{one.TotalOperatingExpenses/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.TotalOperatingExpenses/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.TotalOperatingExpenses/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Operating Income or Loss</b></td>
                            <td><b><s:property value="%{one.OperatingIncomeorLoss/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.OperatingIncomeorLoss/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.OperatingIncomeorLoss/1000000.0}"></s:property></b></td></tr>

                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Income from Continuing Operations</b></td></tr>


                        <tr><td style="padding-left:4em">Total Other Income_Expenses Net</td>

                            <td><s:property value="%{one.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.TotalOtherIncome_ExpensesNet/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Earnings Before  Interest And Taxes</td>
                            <td><s:property value="%{one.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.EarningsBeforeInterestAndTaxes/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Interest Expense</td>
                            <td><s:property value="%{one.InterestExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.InterestExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.InterestExpense/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Income Before Tax</td>
                            <td><s:property value="%{one.IncomeBeforeTax/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.IncomeBeforeTax/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.IncomeBeforeTax/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Income Tax Expense</td>
                            <td><s:property value="%{one.incomeTaxExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.incomeTaxExpense/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.incomeTaxExpense/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em">Minority Interest</td>
                            <td><s:property value="%{one.MinorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.MinorityInterest/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.MinorityInterest/1000000.0}"></s:property></td></tr>
                        <tr><td style="padding-left:4em" colspan="4"><hr><td></tr>

                        <tr><td style="padding-left:4em">Net Income From Continuing Ops</td>
                            <td><s:property value="%{one.NetIncomeFromContinuingOps/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncomeFromContinuingOps/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncomeFromContinuingOps/1000000.0}"></s:property></td></tr>
                        <tr><td style="color: black; background-color: grey; padding-left:4em" colspan="5"><b>Non-recurring Events</b></td></tr>

                        <tr><td style="padding-left:4em">Discontinued Operations</td>
                            <td><s:property value="%{one.DiscontinuedOperations/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.DiscontinuedOperations/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.DiscontinuedOperations/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Extraordinary Items</td>
                            <td><s:property value="%{one.ExtraordinaryItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.ExtraordinaryItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.ExtraordinaryItems/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Effect Of Accounting Changes</td>
                            <td><s:property value="%{one.EffectOfAccountingChanges/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.EffectOfAccountingChanges/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.EffectOfAccountingChanges/1000000.0}"></s:property></td></tr>

                        <tr><td style="padding-left:4em">Other Items</td>
                            <td><s:property value="%{one.otherItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.otherItems/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.otherItems/1000000.0}"></s:property></td></tr>

                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Income</b></td>
                            <td><b><s:property value="%{one.NetIncome/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{two.NetIncome/1000000.0}"></s:property></b></td>
                        <td><b><s:property value="%{three.NetIncome/1000000.0}"></s:property></b></td></tr>

                        <tr><td>Preferred Stock And Other Adjustments</td>
                            <td><s:property value="%{one.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.PreferredStockAndOtherAdjustments/1000000.0}"></s:property></td></tr>
                        <tr><td colspan="5"><hr><td></tr>
                        <tr><td><b>Net Income Applicable To Common Shares</b></td>
                            <td><s:property value="%{one.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td>
                        <td><s:property value="%{two.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td>
                        <td><s:property value="%{three.NetIncomeApplicableToCommonShares/1000000.0}"></s:property></td></tr>
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
