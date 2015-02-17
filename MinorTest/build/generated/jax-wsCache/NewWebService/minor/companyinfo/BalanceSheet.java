
package minor.companyinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balanceSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balanceSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountsPayable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accumulatedAmortization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalSurplus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashAndCashEquivalents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredLongTermAssetCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredLongTermLiabilityCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodwill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intangibleAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inventory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longTermDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longTermInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorityInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscStocksOptionsWarrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negativeGoodwill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netReceivables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netTangibleAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherStockholderEquity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyPlantandEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redeemablePreferredStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retainedEarnings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortTermInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_CurrentLongTermDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalLiabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalStockholderEquity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treasuryStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceSheet", propOrder = {
    "accountsPayable",
    "accumulatedAmortization",
    "capitalSurplus",
    "cashAndCashEquivalents",
    "commonStock",
    "deferredLongTermAssetCharges",
    "deferredLongTermLiabilityCharges",
    "goodwill",
    "intangibleAssets",
    "inventory",
    "longTermDebt",
    "longTermInvestments",
    "minorityInterest",
    "miscStocksOptionsWarrants",
    "negativeGoodwill",
    "netReceivables",
    "netTangibleAssets",
    "otherAssets",
    "otherCurrentAssets",
    "otherCurrentLiabilities",
    "otherLiabilities",
    "otherStockholderEquity",
    "period",
    "preferredStock",
    "propertyPlantandEquipment",
    "redeemablePreferredStock",
    "retainedEarnings",
    "shortTermInvestments",
    "shortCurrentLongTermDebt",
    "symbol",
    "timeframe",
    "totalAssets",
    "totalCurrentAssets",
    "totalCurrentLiabilities",
    "totalLiabilities",
    "totalStockholderEquity",
    "treasuryStock"
})
public class BalanceSheet {

    protected String accountsPayable;
    protected String accumulatedAmortization;
    protected String capitalSurplus;
    protected String cashAndCashEquivalents;
    protected String commonStock;
    protected String deferredLongTermAssetCharges;
    protected String deferredLongTermLiabilityCharges;
    protected String goodwill;
    protected String intangibleAssets;
    protected String inventory;
    protected String longTermDebt;
    protected String longTermInvestments;
    protected String minorityInterest;
    protected String miscStocksOptionsWarrants;
    protected String negativeGoodwill;
    protected String netReceivables;
    protected String netTangibleAssets;
    protected String otherAssets;
    protected String otherCurrentAssets;
    protected String otherCurrentLiabilities;
    protected String otherLiabilities;
    protected String otherStockholderEquity;
    protected String period;
    protected String preferredStock;
    protected String propertyPlantandEquipment;
    protected String redeemablePreferredStock;
    protected String retainedEarnings;
    protected String shortTermInvestments;
    @XmlElement(name = "short_CurrentLongTermDebt")
    protected String shortCurrentLongTermDebt;
    protected String symbol;
    protected String timeframe;
    protected String totalAssets;
    protected String totalCurrentAssets;
    protected String totalCurrentLiabilities;
    protected String totalLiabilities;
    protected String totalStockholderEquity;
    protected String treasuryStock;

    /**
     * Gets the value of the accountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountsPayable() {
        return accountsPayable;
    }

    /**
     * Sets the value of the accountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountsPayable(String value) {
        this.accountsPayable = value;
    }

    /**
     * Gets the value of the accumulatedAmortization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatedAmortization() {
        return accumulatedAmortization;
    }

    /**
     * Sets the value of the accumulatedAmortization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatedAmortization(String value) {
        this.accumulatedAmortization = value;
    }

    /**
     * Gets the value of the capitalSurplus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalSurplus() {
        return capitalSurplus;
    }

    /**
     * Sets the value of the capitalSurplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalSurplus(String value) {
        this.capitalSurplus = value;
    }

    /**
     * Gets the value of the cashAndCashEquivalents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAndCashEquivalents() {
        return cashAndCashEquivalents;
    }

    /**
     * Sets the value of the cashAndCashEquivalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAndCashEquivalents(String value) {
        this.cashAndCashEquivalents = value;
    }

    /**
     * Gets the value of the commonStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonStock() {
        return commonStock;
    }

    /**
     * Sets the value of the commonStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonStock(String value) {
        this.commonStock = value;
    }

    /**
     * Gets the value of the deferredLongTermAssetCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredLongTermAssetCharges() {
        return deferredLongTermAssetCharges;
    }

    /**
     * Sets the value of the deferredLongTermAssetCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredLongTermAssetCharges(String value) {
        this.deferredLongTermAssetCharges = value;
    }

    /**
     * Gets the value of the deferredLongTermLiabilityCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredLongTermLiabilityCharges() {
        return deferredLongTermLiabilityCharges;
    }

    /**
     * Sets the value of the deferredLongTermLiabilityCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredLongTermLiabilityCharges(String value) {
        this.deferredLongTermLiabilityCharges = value;
    }

    /**
     * Gets the value of the goodwill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodwill() {
        return goodwill;
    }

    /**
     * Sets the value of the goodwill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodwill(String value) {
        this.goodwill = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntangibleAssets(String value) {
        this.intangibleAssets = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventory(String value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the longTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongTermDebt() {
        return longTermDebt;
    }

    /**
     * Sets the value of the longTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongTermDebt(String value) {
        this.longTermDebt = value;
    }

    /**
     * Gets the value of the longTermInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongTermInvestments() {
        return longTermInvestments;
    }

    /**
     * Sets the value of the longTermInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongTermInvestments(String value) {
        this.longTermInvestments = value;
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
     * Gets the value of the miscStocksOptionsWarrants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscStocksOptionsWarrants() {
        return miscStocksOptionsWarrants;
    }

    /**
     * Sets the value of the miscStocksOptionsWarrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscStocksOptionsWarrants(String value) {
        this.miscStocksOptionsWarrants = value;
    }

    /**
     * Gets the value of the negativeGoodwill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeGoodwill() {
        return negativeGoodwill;
    }

    /**
     * Sets the value of the negativeGoodwill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeGoodwill(String value) {
        this.negativeGoodwill = value;
    }

    /**
     * Gets the value of the netReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReceivables() {
        return netReceivables;
    }

    /**
     * Sets the value of the netReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReceivables(String value) {
        this.netReceivables = value;
    }

    /**
     * Gets the value of the netTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetTangibleAssets() {
        return netTangibleAssets;
    }

    /**
     * Sets the value of the netTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetTangibleAssets(String value) {
        this.netTangibleAssets = value;
    }

    /**
     * Gets the value of the otherAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAssets() {
        return otherAssets;
    }

    /**
     * Sets the value of the otherAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAssets(String value) {
        this.otherAssets = value;
    }

    /**
     * Gets the value of the otherCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    /**
     * Sets the value of the otherCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCurrentAssets(String value) {
        this.otherCurrentAssets = value;
    }

    /**
     * Gets the value of the otherCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCurrentLiabilities() {
        return otherCurrentLiabilities;
    }

    /**
     * Sets the value of the otherCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCurrentLiabilities(String value) {
        this.otherCurrentLiabilities = value;
    }

    /**
     * Gets the value of the otherLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLiabilities() {
        return otherLiabilities;
    }

    /**
     * Sets the value of the otherLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLiabilities(String value) {
        this.otherLiabilities = value;
    }

    /**
     * Gets the value of the otherStockholderEquity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStockholderEquity() {
        return otherStockholderEquity;
    }

    /**
     * Sets the value of the otherStockholderEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStockholderEquity(String value) {
        this.otherStockholderEquity = value;
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
     * Gets the value of the preferredStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredStock() {
        return preferredStock;
    }

    /**
     * Sets the value of the preferredStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredStock(String value) {
        this.preferredStock = value;
    }

    /**
     * Gets the value of the propertyPlantandEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyPlantandEquipment() {
        return propertyPlantandEquipment;
    }

    /**
     * Sets the value of the propertyPlantandEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyPlantandEquipment(String value) {
        this.propertyPlantandEquipment = value;
    }

    /**
     * Gets the value of the redeemablePreferredStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemablePreferredStock() {
        return redeemablePreferredStock;
    }

    /**
     * Sets the value of the redeemablePreferredStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemablePreferredStock(String value) {
        this.redeemablePreferredStock = value;
    }

    /**
     * Gets the value of the retainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainedEarnings() {
        return retainedEarnings;
    }

    /**
     * Sets the value of the retainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainedEarnings(String value) {
        this.retainedEarnings = value;
    }

    /**
     * Gets the value of the shortTermInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortTermInvestments() {
        return shortTermInvestments;
    }

    /**
     * Sets the value of the shortTermInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortTermInvestments(String value) {
        this.shortTermInvestments = value;
    }

    /**
     * Gets the value of the shortCurrentLongTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCurrentLongTermDebt() {
        return shortCurrentLongTermDebt;
    }

    /**
     * Sets the value of the shortCurrentLongTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCurrentLongTermDebt(String value) {
        this.shortCurrentLongTermDebt = value;
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
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAssets(String value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCurrentAssets(String value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCurrentLiabilities(String value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLiabilities(String value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the totalStockholderEquity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalStockholderEquity() {
        return totalStockholderEquity;
    }

    /**
     * Sets the value of the totalStockholderEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalStockholderEquity(String value) {
        this.totalStockholderEquity = value;
    }

    /**
     * Gets the value of the treasuryStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreasuryStock() {
        return treasuryStock;
    }

    /**
     * Sets the value of the treasuryStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreasuryStock(String value) {
        this.treasuryStock = value;
    }

}
