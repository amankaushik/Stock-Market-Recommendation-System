
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndexDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OneYearConstantMaturityTreasury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeYearConstantMaturityTreasury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiveYearConstantMaturityTreasury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeMonthTreasuryBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SixMonthTreasuryBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeMonthSecondaryMarketCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SixMonthSecondaryMarketCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EleventhDistrictCOFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostOfSavingsIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OneMonthLIBOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeMonthLIBOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SixMonthLIBOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OneYearLIBOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostOfDepositsIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TwelveMonthTreasuryAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyIndex", propOrder = {
    "indexDate",
    "oneYearConstantMaturityTreasury",
    "threeYearConstantMaturityTreasury",
    "fiveYearConstantMaturityTreasury",
    "threeMonthTreasuryBill",
    "sixMonthTreasuryBill",
    "threeMonthSecondaryMarketCD",
    "sixMonthSecondaryMarketCD",
    "eleventhDistrictCOFI",
    "costOfSavingsIndex",
    "oneMonthLIBOR",
    "threeMonthLIBOR",
    "sixMonthLIBOR",
    "oneYearLIBOR",
    "costOfDepositsIndex",
    "twelveMonthTreasuryAverage"
})
public class MonthlyIndex {

    @XmlElement(name = "IndexDate")
    protected String indexDate;
    @XmlElement(name = "OneYearConstantMaturityTreasury")
    protected String oneYearConstantMaturityTreasury;
    @XmlElement(name = "ThreeYearConstantMaturityTreasury")
    protected String threeYearConstantMaturityTreasury;
    @XmlElement(name = "FiveYearConstantMaturityTreasury")
    protected String fiveYearConstantMaturityTreasury;
    @XmlElement(name = "ThreeMonthTreasuryBill")
    protected String threeMonthTreasuryBill;
    @XmlElement(name = "SixMonthTreasuryBill")
    protected String sixMonthTreasuryBill;
    @XmlElement(name = "ThreeMonthSecondaryMarketCD")
    protected String threeMonthSecondaryMarketCD;
    @XmlElement(name = "SixMonthSecondaryMarketCD")
    protected String sixMonthSecondaryMarketCD;
    @XmlElement(name = "EleventhDistrictCOFI")
    protected String eleventhDistrictCOFI;
    @XmlElement(name = "CostOfSavingsIndex")
    protected String costOfSavingsIndex;
    @XmlElement(name = "OneMonthLIBOR")
    protected String oneMonthLIBOR;
    @XmlElement(name = "ThreeMonthLIBOR")
    protected String threeMonthLIBOR;
    @XmlElement(name = "SixMonthLIBOR")
    protected String sixMonthLIBOR;
    @XmlElement(name = "OneYearLIBOR")
    protected String oneYearLIBOR;
    @XmlElement(name = "CostOfDepositsIndex")
    protected String costOfDepositsIndex;
    @XmlElement(name = "TwelveMonthTreasuryAverage")
    protected String twelveMonthTreasuryAverage;

    /**
     * Gets the value of the indexDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexDate() {
        return indexDate;
    }

    /**
     * Sets the value of the indexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexDate(String value) {
        this.indexDate = value;
    }

    /**
     * Gets the value of the oneYearConstantMaturityTreasury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneYearConstantMaturityTreasury() {
        return oneYearConstantMaturityTreasury;
    }

    /**
     * Sets the value of the oneYearConstantMaturityTreasury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneYearConstantMaturityTreasury(String value) {
        this.oneYearConstantMaturityTreasury = value;
    }

    /**
     * Gets the value of the threeYearConstantMaturityTreasury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeYearConstantMaturityTreasury() {
        return threeYearConstantMaturityTreasury;
    }

    /**
     * Sets the value of the threeYearConstantMaturityTreasury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeYearConstantMaturityTreasury(String value) {
        this.threeYearConstantMaturityTreasury = value;
    }

    /**
     * Gets the value of the fiveYearConstantMaturityTreasury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiveYearConstantMaturityTreasury() {
        return fiveYearConstantMaturityTreasury;
    }

    /**
     * Sets the value of the fiveYearConstantMaturityTreasury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiveYearConstantMaturityTreasury(String value) {
        this.fiveYearConstantMaturityTreasury = value;
    }

    /**
     * Gets the value of the threeMonthTreasuryBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeMonthTreasuryBill() {
        return threeMonthTreasuryBill;
    }

    /**
     * Sets the value of the threeMonthTreasuryBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeMonthTreasuryBill(String value) {
        this.threeMonthTreasuryBill = value;
    }

    /**
     * Gets the value of the sixMonthTreasuryBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixMonthTreasuryBill() {
        return sixMonthTreasuryBill;
    }

    /**
     * Sets the value of the sixMonthTreasuryBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixMonthTreasuryBill(String value) {
        this.sixMonthTreasuryBill = value;
    }

    /**
     * Gets the value of the threeMonthSecondaryMarketCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeMonthSecondaryMarketCD() {
        return threeMonthSecondaryMarketCD;
    }

    /**
     * Sets the value of the threeMonthSecondaryMarketCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeMonthSecondaryMarketCD(String value) {
        this.threeMonthSecondaryMarketCD = value;
    }

    /**
     * Gets the value of the sixMonthSecondaryMarketCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixMonthSecondaryMarketCD() {
        return sixMonthSecondaryMarketCD;
    }

    /**
     * Sets the value of the sixMonthSecondaryMarketCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixMonthSecondaryMarketCD(String value) {
        this.sixMonthSecondaryMarketCD = value;
    }

    /**
     * Gets the value of the eleventhDistrictCOFI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEleventhDistrictCOFI() {
        return eleventhDistrictCOFI;
    }

    /**
     * Sets the value of the eleventhDistrictCOFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEleventhDistrictCOFI(String value) {
        this.eleventhDistrictCOFI = value;
    }

    /**
     * Gets the value of the costOfSavingsIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostOfSavingsIndex() {
        return costOfSavingsIndex;
    }

    /**
     * Sets the value of the costOfSavingsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostOfSavingsIndex(String value) {
        this.costOfSavingsIndex = value;
    }

    /**
     * Gets the value of the oneMonthLIBOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneMonthLIBOR() {
        return oneMonthLIBOR;
    }

    /**
     * Sets the value of the oneMonthLIBOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneMonthLIBOR(String value) {
        this.oneMonthLIBOR = value;
    }

    /**
     * Gets the value of the threeMonthLIBOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeMonthLIBOR() {
        return threeMonthLIBOR;
    }

    /**
     * Sets the value of the threeMonthLIBOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeMonthLIBOR(String value) {
        this.threeMonthLIBOR = value;
    }

    /**
     * Gets the value of the sixMonthLIBOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixMonthLIBOR() {
        return sixMonthLIBOR;
    }

    /**
     * Sets the value of the sixMonthLIBOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixMonthLIBOR(String value) {
        this.sixMonthLIBOR = value;
    }

    /**
     * Gets the value of the oneYearLIBOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneYearLIBOR() {
        return oneYearLIBOR;
    }

    /**
     * Sets the value of the oneYearLIBOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneYearLIBOR(String value) {
        this.oneYearLIBOR = value;
    }

    /**
     * Gets the value of the costOfDepositsIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostOfDepositsIndex() {
        return costOfDepositsIndex;
    }

    /**
     * Sets the value of the costOfDepositsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostOfDepositsIndex(String value) {
        this.costOfDepositsIndex = value;
    }

    /**
     * Gets the value of the twelveMonthTreasuryAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveMonthTreasuryAverage() {
        return twelveMonthTreasuryAverage;
    }

    /**
     * Sets the value of the twelveMonthTreasuryAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveMonthTreasuryAverage(String value) {
        this.twelveMonthTreasuryAverage = value;
    }

}
