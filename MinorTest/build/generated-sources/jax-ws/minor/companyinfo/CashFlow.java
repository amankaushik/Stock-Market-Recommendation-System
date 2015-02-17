
package minor.companyinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cashFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cashFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustmentsToNetIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalExpenditures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeInCashandCashEquivalents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changesInAccountsReceivables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changesInInventories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changesInLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changesInOtherOperatingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depreciation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dividendsPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectOfExchangeRateChanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netBorrowings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCashFlowsfromFinancingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCashflowsfromInvestingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salePurchaseofStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCashFlowFromOperatingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCashFlowsFromFinancingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCashFlowsFromInvestingActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cashFlow", propOrder = {
    "adjustmentsToNetIncome",
    "capitalExpenditures",
    "changeInCashandCashEquivalents",
    "changesInAccountsReceivables",
    "changesInInventories",
    "changesInLiabilities",
    "changesInOtherOperatingActivities",
    "depreciation",
    "dividendsPaid",
    "effectOfExchangeRateChanges",
    "investments",
    "netBorrowings",
    "netIncome",
    "otherCashFlowsfromFinancingActivities",
    "otherCashflowsfromInvestingActivities",
    "period",
    "salePurchaseofStock",
    "symbol",
    "timeframe",
    "totalCashFlowFromOperatingActivities",
    "totalCashFlowsFromFinancingActivities",
    "totalCashFlowsFromInvestingActivities"
})
public class CashFlow {

    protected String adjustmentsToNetIncome;
    protected String capitalExpenditures;
    protected String changeInCashandCashEquivalents;
    protected String changesInAccountsReceivables;
    protected String changesInInventories;
    protected String changesInLiabilities;
    protected String changesInOtherOperatingActivities;
    protected String depreciation;
    protected String dividendsPaid;
    protected String effectOfExchangeRateChanges;
    protected String investments;
    protected String netBorrowings;
    protected String netIncome;
    protected String otherCashFlowsfromFinancingActivities;
    protected String otherCashflowsfromInvestingActivities;
    protected String period;
    protected String salePurchaseofStock;
    protected String symbol;
    protected String timeframe;
    protected String totalCashFlowFromOperatingActivities;
    protected String totalCashFlowsFromFinancingActivities;
    protected String totalCashFlowsFromInvestingActivities;

    /**
     * Gets the value of the adjustmentsToNetIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentsToNetIncome() {
        return adjustmentsToNetIncome;
    }

    /**
     * Sets the value of the adjustmentsToNetIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentsToNetIncome(String value) {
        this.adjustmentsToNetIncome = value;
    }

    /**
     * Gets the value of the capitalExpenditures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalExpenditures() {
        return capitalExpenditures;
    }

    /**
     * Sets the value of the capitalExpenditures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalExpenditures(String value) {
        this.capitalExpenditures = value;
    }

    /**
     * Gets the value of the changeInCashandCashEquivalents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeInCashandCashEquivalents() {
        return changeInCashandCashEquivalents;
    }

    /**
     * Sets the value of the changeInCashandCashEquivalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeInCashandCashEquivalents(String value) {
        this.changeInCashandCashEquivalents = value;
    }

    /**
     * Gets the value of the changesInAccountsReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesInAccountsReceivables() {
        return changesInAccountsReceivables;
    }

    /**
     * Sets the value of the changesInAccountsReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesInAccountsReceivables(String value) {
        this.changesInAccountsReceivables = value;
    }

    /**
     * Gets the value of the changesInInventories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesInInventories() {
        return changesInInventories;
    }

    /**
     * Sets the value of the changesInInventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesInInventories(String value) {
        this.changesInInventories = value;
    }

    /**
     * Gets the value of the changesInLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesInLiabilities() {
        return changesInLiabilities;
    }

    /**
     * Sets the value of the changesInLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesInLiabilities(String value) {
        this.changesInLiabilities = value;
    }

    /**
     * Gets the value of the changesInOtherOperatingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesInOtherOperatingActivities() {
        return changesInOtherOperatingActivities;
    }

    /**
     * Sets the value of the changesInOtherOperatingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesInOtherOperatingActivities(String value) {
        this.changesInOtherOperatingActivities = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepreciation(String value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the dividendsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendsPaid() {
        return dividendsPaid;
    }

    /**
     * Sets the value of the dividendsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendsPaid(String value) {
        this.dividendsPaid = value;
    }

    /**
     * Gets the value of the effectOfExchangeRateChanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectOfExchangeRateChanges() {
        return effectOfExchangeRateChanges;
    }

    /**
     * Sets the value of the effectOfExchangeRateChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectOfExchangeRateChanges(String value) {
        this.effectOfExchangeRateChanges = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestments(String value) {
        this.investments = value;
    }

    /**
     * Gets the value of the netBorrowings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetBorrowings() {
        return netBorrowings;
    }

    /**
     * Sets the value of the netBorrowings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetBorrowings(String value) {
        this.netBorrowings = value;
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
     * Gets the value of the otherCashFlowsfromFinancingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCashFlowsfromFinancingActivities() {
        return otherCashFlowsfromFinancingActivities;
    }

    /**
     * Sets the value of the otherCashFlowsfromFinancingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCashFlowsfromFinancingActivities(String value) {
        this.otherCashFlowsfromFinancingActivities = value;
    }

    /**
     * Gets the value of the otherCashflowsfromInvestingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCashflowsfromInvestingActivities() {
        return otherCashflowsfromInvestingActivities;
    }

    /**
     * Sets the value of the otherCashflowsfromInvestingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCashflowsfromInvestingActivities(String value) {
        this.otherCashflowsfromInvestingActivities = value;
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
     * Gets the value of the salePurchaseofStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePurchaseofStock() {
        return salePurchaseofStock;
    }

    /**
     * Sets the value of the salePurchaseofStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePurchaseofStock(String value) {
        this.salePurchaseofStock = value;
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
     * Gets the value of the totalCashFlowFromOperatingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCashFlowFromOperatingActivities() {
        return totalCashFlowFromOperatingActivities;
    }

    /**
     * Sets the value of the totalCashFlowFromOperatingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCashFlowFromOperatingActivities(String value) {
        this.totalCashFlowFromOperatingActivities = value;
    }

    /**
     * Gets the value of the totalCashFlowsFromFinancingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCashFlowsFromFinancingActivities() {
        return totalCashFlowsFromFinancingActivities;
    }

    /**
     * Sets the value of the totalCashFlowsFromFinancingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCashFlowsFromFinancingActivities(String value) {
        this.totalCashFlowsFromFinancingActivities = value;
    }

    /**
     * Gets the value of the totalCashFlowsFromInvestingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCashFlowsFromInvestingActivities() {
        return totalCashFlowsFromInvestingActivities;
    }

    /**
     * Sets the value of the totalCashFlowsFromInvestingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCashFlowsFromInvestingActivities(String value) {
        this.totalCashFlowsFromInvestingActivities = value;
    }

}
