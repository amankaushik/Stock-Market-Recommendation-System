
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgageResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgageResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonthlyPrincipalAndInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MonthlyTax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MonthlyInsurance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalPayment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgageResults", propOrder = {
    "monthlyPrincipalAndInterest",
    "monthlyTax",
    "monthlyInsurance",
    "totalPayment"
})
public class MortgageResults {

    @XmlElement(name = "MonthlyPrincipalAndInterest")
    protected double monthlyPrincipalAndInterest;
    @XmlElement(name = "MonthlyTax")
    protected double monthlyTax;
    @XmlElement(name = "MonthlyInsurance")
    protected double monthlyInsurance;
    @XmlElement(name = "TotalPayment")
    protected double totalPayment;

    /**
     * Gets the value of the monthlyPrincipalAndInterest property.
     * 
     */
    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    /**
     * Sets the value of the monthlyPrincipalAndInterest property.
     * 
     */
    public void setMonthlyPrincipalAndInterest(double value) {
        this.monthlyPrincipalAndInterest = value;
    }

    /**
     * Gets the value of the monthlyTax property.
     * 
     */
    public double getMonthlyTax() {
        return monthlyTax;
    }

    /**
     * Sets the value of the monthlyTax property.
     * 
     */
    public void setMonthlyTax(double value) {
        this.monthlyTax = value;
    }

    /**
     * Gets the value of the monthlyInsurance property.
     * 
     */
    public double getMonthlyInsurance() {
        return monthlyInsurance;
    }

    /**
     * Sets the value of the monthlyInsurance property.
     * 
     */
    public void setMonthlyInsurance(double value) {
        this.monthlyInsurance = value;
    }

    /**
     * Gets the value of the totalPayment property.
     * 
     */
    public double getTotalPayment() {
        return totalPayment;
    }

    /**
     * Sets the value of the totalPayment property.
     * 
     */
    public void setTotalPayment(double value) {
        this.totalPayment = value;
    }

}
