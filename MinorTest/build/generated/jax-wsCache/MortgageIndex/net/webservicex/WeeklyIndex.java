
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeeklyIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeeklyIndex">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyIndex", propOrder = {
    "indexDate",
    "oneYearConstantMaturityTreasury",
    "threeYearConstantMaturityTreasury",
    "fiveYearConstantMaturityTreasury",
    "threeMonthTreasuryBill",
    "sixMonthTreasuryBill",
    "threeMonthSecondaryMarketCD"
})
public class WeeklyIndex {

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

}
