
package minor.companyinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for incomeStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="incomeStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costofRevenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discontinuedOperations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earningsBeforeInterestAndTaxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectOfAccountingChanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraordinaryItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeBeforeTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeTaxExpense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestExpense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorityInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netIncomeApplicableToCommonShares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netIncomeFromContinuingOps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonRecurring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingIncomeorLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="others" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredStockAndOtherAdjustments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="researchDevelopment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingGeneralandAdministrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalOperatingExpenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalOtherIncome_ExpensesNet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRevenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incomeStatement", propOrder = {
    "costofRevenue",
    "discontinuedOperations",
    "earningsBeforeInterestAndTaxes",
    "effectOfAccountingChanges",
    "extraordinaryItems",
    "grossProfit",
    "incomeBeforeTax",
    "incomeTaxExpense",
    "interestExpense",
    "minorityInterest",
    "netIncome",
    "netIncomeApplicableToCommonShares",
    "netIncomeFromContinuingOps",
    "nonRecurring",
    "operatingIncomeorLoss",
    "otherItems",
    "others",
    "period",
    "preferredStockAndOtherAdjustments",
    "researchDevelopment",
    "sellingGeneralandAdministrative",
    "symbol",
    "timeframe",
    "totalOperatingExpenses",
    "totalOtherIncomeExpensesNet",
    "totalRevenue"
})
public class IncomeStatement {

    protected String costofRevenue;
    protected String discontinuedOperations;
    protected String earningsBeforeInterestAndTaxes;
    protected String effectOfAccountingChanges;
    protected String extraordinaryItems;
    protected String grossProfit;
    protected String incomeBeforeTax;
    protected String incomeTaxExpense;
    protected String interestExpense;
    protected String minorityInterest;
    protected String netIncome;
    protected String netIncomeApplicableToCommonShares;
    protected String netIncomeFromContinuingOps;
    protected String nonRecurring;
    protected String operatingIncomeorLoss;
    protected String otherItems;
    protected String others;
    protected String period;
    protected String preferredStockAndOtherAdjustments;
    protected String researchDevelopment;
    protected String sellingGeneralandAdministrative;
    protected String symbol;
    protected String timeframe;
    protected String totalOperatingExpenses;
    @XmlElement(name = "totalOtherIncome_ExpensesNet")
    protected String totalOtherIncomeExpensesNet;
    protected String totalRevenue;

    /**
     * Gets the value of the costofRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostofRevenue() {
        return costofRevenue;
    }

    /**
     * Sets the value of the costofRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostofRevenue(String value) {
        this.costofRevenue = value;
    }

    /**
     * Gets the value of the discontinuedOperations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    /**
     * Sets the value of the discontinuedOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscontinuedOperations(String value) {
        this.discontinuedOperations = value;
    }

    /**
     * Gets the value of the earningsBeforeInterestAndTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningsBeforeInterestAndTaxes() {
        return earningsBeforeInterestAndTaxes;
    }

    /**
     * Sets the value of the earningsBeforeInterestAndTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningsBeforeInterestAndTaxes(String value) {
        this.earningsBeforeInterestAndTaxes = value;
    }

    /**
     * Gets the value of the effectOfAccountingChanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectOfAccountingChanges() {
        return effectOfAccountingChanges;
    }

    /**
     * Sets the value of the effectOfAccountingChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectOfAccountingChanges(String value) {
        this.effectOfAccountingChanges = value;
    }

    /**
     * Gets the value of the extraordinaryItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraordinaryItems() {
        return extraordinaryItems;
    }

    /**
     * Sets the value of the extraordinaryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraordinaryItems(String value) {
        this.extraordinaryItems = value;
    }

    /**
     * Gets the value of the grossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossProfit(String value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the incomeBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    /**
     * Sets the value of the incomeBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeBeforeTax(String value) {
        this.incomeBeforeTax = value;
    }

    /**
     * Gets the value of the incomeTaxExpense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    /**
     * Sets the value of the incomeTaxExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeTaxExpense(String value) {
        this.incomeTaxExpense = value;
    }

    /**
     * Gets the value of the interestExpense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestExpense() {
        return interestExpense;
    }

    /**
     * Sets the value of the interestExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestExpense(String value) {
        this.interestExpense = value;
    }

    /**
     * Gets the value of the minorityInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorityInterest() {
        return minorityInterest;
    }

    /**
     * Sets the value of the minorityInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorityInterest(String value) {
        this.minorityInterest = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetIncome(String value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the netIncomeApplicableToCommonShares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetIncomeApplicableToCommonShares() {
        return netIncomeApplicableToCommonShares;
    }

    /**
     * Sets the value of the netIncomeApplicableToCommonShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetIncomeApplicableToCommonShares(String value) {
        this.netIncomeApplicableToCommonShares = value;
    }

    /**
     * Gets the value of the netIncomeFromContinuingOps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetIncomeFromContinuingOps() {
        return netIncomeFromContinuingOps;
    }

    /**
     * Sets the value of the netIncomeFromContinuingOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetIncomeFromContinuingOps(String value) {
        this.netIncomeFromContinuingOps = value;
    }

    /**
     * Gets the value of the nonRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRecurring() {
        return nonRecurring;
    }

    /**
     * Sets the value of the nonRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRecurring(String value) {
        this.nonRecurring = value;
    }

    /**
     * Gets the value of the operatingIncomeorLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingIncomeorLoss() {
        return operatingIncomeorLoss;
    }

    /**
     * Sets the value of the operatingIncomeorLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingIncomeorLoss(String value) {
        this.operatingIncomeorLoss = value;
    }

    /**
     * Gets the value of the otherItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherItems() {
        return otherItems;
    }

    /**
     * Sets the value of the otherItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherItems(String value) {
        this.otherItems = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthers(String value) {
        this.others = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the preferredStockAndOtherAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredStockAndOtherAdjustments() {
        return preferredStockAndOtherAdjustments;
    }

    /**
     * Sets the value of the preferredStockAndOtherAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredStockAndOtherAdjustments(String value) {
        this.preferredStockAndOtherAdjustments = value;
    }

    /**
     * Gets the value of the researchDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearchDevelopment() {
        return researchDevelopment;
    }

    /**
     * Sets the value of the researchDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearchDevelopment(String value) {
        this.researchDevelopment = value;
    }

    /**
     * Gets the value of the sellingGeneralandAdministrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingGeneralandAdministrative() {
        return sellingGeneralandAdministrative;
    }

    /**
     * Sets the value of the sellingGeneralandAdministrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingGeneralandAdministrative(String value) {
        this.sellingGeneralandAdministrative = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the timeframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeframe() {
        return timeframe;
    }

    /**
     * Sets the value of the timeframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeframe(String value) {
        this.timeframe = value;
    }

    /**
     * Gets the value of the totalOperatingExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    /**
     * Sets the value of the totalOperatingExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOperatingExpenses(String value) {
        this.totalOperatingExpenses = value;
    }

    /**
     * Gets the value of the totalOtherIncomeExpensesNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOtherIncomeExpensesNet() {
        return totalOtherIncomeExpensesNet;
    }

    /**
     * Sets the value of the totalOtherIncomeExpensesNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOtherIncomeExpensesNet(String value) {
        this.totalOtherIncomeExpensesNet = value;
    }

    /**
     * Gets the value of the totalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Sets the value of the totalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRevenue(String value) {
        this.totalRevenue = value;
    }

}
