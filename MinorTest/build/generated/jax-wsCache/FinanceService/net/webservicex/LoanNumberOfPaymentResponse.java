
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
 *         &lt;element name="LoanNumberOfPaymentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanNumberOfPaymentResult"
})
@XmlRootElement(name = "LoanNumberOfPaymentResponse")
public class LoanNumberOfPaymentResponse {

    @XmlElement(name = "LoanNumberOfPaymentResult")
    protected double loanNumberOfPaymentResult;

    /**
     * Gets the value of the loanNumberOfPaymentResult property.
     * 
     */
    public double getLoanNumberOfPaymentResult() {
        return loanNumberOfPaymentResult;
    }

    /**
     * Sets the value of the loanNumberOfPaymentResult property.
     * 
     */
    public void setLoanNumberOfPaymentResult(double value) {
        this.loanNumberOfPaymentResult = value;
    }

}
