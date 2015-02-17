
package minor.companyinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCompanyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCompanyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeframe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompanyInfo", propOrder = {
    "ticker",
    "timeframe"
})
public class GetCompanyInfo {

    protected String ticker;
    protected String timeframe;

    /**
     * Gets the value of the ticker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicker() {
        return ticker;
    }

    /**
     * Sets the value of the ticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicker(String value) {
        this.ticker = value;
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

}
