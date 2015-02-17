
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
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanAmount",
    "interestRate",
    "monthlyPayment"
})
@XmlRootElement(name = "LoanNumberOfPayment")
public class LoanNumberOfPayment {

    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "InterestRate")
    protected double interestRate;
    @XmlElement(name = "MonthlyPayment")
    protected double monthlyPayment;

    /**
     * Gets the value of the loanAmount property.
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     */
    public void setInterestRate(double value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the monthlyPayment property.
     * 
     */
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Sets the value of the monthlyPayment property.
     * 
     */
    public void setMonthlyPayment(double value) {
        this.monthlyPayment = value;
    }

}
