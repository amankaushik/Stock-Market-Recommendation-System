
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
 *         &lt;element name="GetCurrentMortgageIndexByWeeklyResult" type="{http://www.webserviceX.NET/}WeeklyIndex"/>
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
    "getCurrentMortgageIndexByWeeklyResult"
})
@XmlRootElement(name = "GetCurrentMortgageIndexByWeeklyResponse")
public class GetCurrentMortgageIndexByWeeklyResponse {

    @XmlElement(name = "GetCurrentMortgageIndexByWeeklyResult", required = true)
    protected WeeklyIndex getCurrentMortgageIndexByWeeklyResult;

    /**
     * Gets the value of the getCurrentMortgageIndexByWeeklyResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyIndex }
     *     
     */
    public WeeklyIndex getGetCurrentMortgageIndexByWeeklyResult() {
        return getCurrentMortgageIndexByWeeklyResult;
    }

    /**
     * Sets the value of the getCurrentMortgageIndexByWeeklyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyIndex }
     *     
     */
    public void setGetCurrentMortgageIndexByWeeklyResult(WeeklyIndex value) {
        this.getCurrentMortgageIndexByWeeklyResult = value;
    }

}
