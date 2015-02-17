
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
 *         &lt;element name="Years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AnnualTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AnnualInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "years",
    "interest",
    "loanAmount",
    "annualTax",
    "annualInsurance"
})
@XmlRootElement(name = "GetMortgagePayment")
public class GetMortgagePayment {

    @XmlElement(name = "Years")
    protected int years;
    @XmlElement(name = "Interest")
    protected double interest;
    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "AnnualTax")
    protected double annualTax;
    @XmlElement(name = "AnnualInsurance")
    protected double annualInsurance;

    /**
     * Gets the value of the years property.
     * 
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     */
    public void setYears(int value) {
        this.years = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     */
    public double getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     */
    public void setInterest(double value) {
        this.interest = value;
    }

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
     * Gets the value of the annualTax property.
     * 
     */
    public double getAnnualTax() {
        return annualTax;
    }

    /**
     * Sets the value of the annualTax property.
     * 
     */
    public void setAnnualTax(double value) {
        this.annualTax = value;
    }

    /**
     * Gets the value of the annualInsurance property.
     * 
     */
    public double getAnnualInsurance() {
        return annualInsurance;
    }

    /**
     * Sets the value of the annualInsurance property.
     * 
     */
    public void setAnnualInsurance(double value) {
        this.annualInsurance = value;
    }

}
