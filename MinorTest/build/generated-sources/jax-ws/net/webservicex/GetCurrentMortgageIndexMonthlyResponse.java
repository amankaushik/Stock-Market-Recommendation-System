
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCurrentMortgageIndexMonthlyResult" type="{http://www.webserviceX.NET/}MonthlyIndex"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCurrentMortgageIndexMonthlyResult"
})
@XmlRootElement(name = "GetCurrentMortgageIndexMonthlyResponse")
public class GetCurrentMortgageIndexMonthlyResponse {

    @XmlElement(name = "GetCurrentMortgageIndexMonthlyResult", required = true)
    protected MonthlyIndex getCurrentMortgageIndexMonthlyResult;

    /**
     * Gets the value of the getCurrentMortgageIndexMonthlyResult property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyIndex }
     *     
     */
    public MonthlyIndex getGetCurrentMortgageIndexMonthlyResult() {
        return getCurrentMortgageIndexMonthlyResult;
    }

    /**
     * Sets the value of the getCurrentMortgageIndexMonthlyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyIndex }
     *     
     */
    public void setGetCurrentMortgageIndexMonthlyResult(MonthlyIndex value) {
        this.getCurrentMortgageIndexMonthlyResult = value;
    }

}
