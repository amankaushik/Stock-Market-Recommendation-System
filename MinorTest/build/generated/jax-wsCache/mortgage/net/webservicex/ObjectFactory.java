
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

    private final static QName _MortgageResults_QNAME = new QName("http://www.webserviceX.NET/", "MortgageResults");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MortgageResults }
     * 
     */
    public MortgageResults createMortgageResults() {
        return new MortgageResults();
    }

    /**
     * Create an instance of {@link GetMortgagePayment }
     * 
     */
    public GetMortgagePayment createGetMortgagePayment() {
        return new GetMortgagePayment();
    }

    /**
     * Create an instance of {@link GetMortgagePaymentResponse }
     * 
     */
    public GetMortgagePaymentResponse createGetMortgagePaymentResponse() {
        return new GetMortgagePaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MortgageResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET/", name = "MortgageResults")
    public JAXBElement<MortgageResults> createMortgageResults(MortgageResults value) {
        return new JAXBElement<MortgageResults>(_MortgageResults_QNAME, MortgageResults.class, null, value);
    }

}
