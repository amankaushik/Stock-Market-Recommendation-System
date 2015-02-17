
package net.webservicex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.webservicex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Double_QNAME = new QName("http://www.webserviceX.NET/", "double");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link APR }
     * 
     */
    public APR createAPR() {
        return new APR();
    }

    /**
     * Create an instance of {@link APRResponse }
     * 
     */
    public APRResponse createAPRResponse() {
        return new APRResponse();
    }

    /**
     * Create an instance of {@link LeaseMonthlyPaymentResponse }
     * 
     */
    public LeaseMonthlyPaymentResponse createLeaseMonthlyPaymentResponse() {
        return new LeaseMonthlyPaymentResponse();
    }

    /**
     * Create an instance of {@link LoanMonthlyPaymentResponse }
     * 
     */
    public LoanMonthlyPaymentResponse createLoanMonthlyPaymentResponse() {
        return new LoanMonthlyPaymentResponse();
    }

    /**
     * Create an instance of {@link LoanMonthlyPayment }
     * 
     */
    public LoanMonthlyPayment createLoanMonthlyPayment() {
        return new LoanMonthlyPayment();
    }

    /**
     * Create an instance of {@link LeaseMonthlyPayment }
     * 
     */
    public LeaseMonthlyPayment createLeaseMonthlyPayment() {
        return new LeaseMonthlyPayment();
    }

    /**
     * Create an instance of {@link LoanNumberOfPayment }
     * 
     */
    public LoanNumberOfPayment createLoanNumberOfPayment() {
        return new LoanNumberOfPayment();
    }

    /**
     * Create an instance of {@link LoanNumberOfPaymentResponse }
     * 
     */
    public LoanNumberOfPaymentResponse createLoanNumberOfPaymentResponse() {
        return new LoanNumberOfPaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

}
