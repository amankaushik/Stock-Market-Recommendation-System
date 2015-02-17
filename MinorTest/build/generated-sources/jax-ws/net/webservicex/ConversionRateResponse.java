
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
 *         &lt;element name="ConversionRateResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "conversionRateResult"
})
@XmlRootElement(name = "ConversionRateResponse")
public class ConversionRateResponse {

    @XmlElement(name = "ConversionRateResult")
    protected double conversionRateResult;

    /**
     * Gets the value of the conversionRateResult property.
     * 
     */
    public double getConversionRateResult() {
        return conversionRateResult;
    }

    /**
     * Sets the value of the conversionRateResult property.
     * 
     */
    public void setConversionRateResult(double value) {
        this.conversionRateResult = value;
    }

}
