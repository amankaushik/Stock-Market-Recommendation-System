
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

    private final static QName _WeeklyIndex_QNAME = new QName("http://www.webserviceX.NET/", "WeeklyIndex");
    private final static QName _MonthlyIndex_QNAME = new QName("http://www.webserviceX.NET/", "MonthlyIndex");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrentMortgageIndexMonthlyResponse }
     * 
     */
    public GetCurrentMortgageIndexMonthlyResponse createGetCurrentMortgageIndexMonthlyResponse() {
        return new GetCurrentMortgageIndexMonthlyResponse();
    }

    /**
     * Create an instance of {@link MonthlyIndex }
     * 
     */
    public MonthlyIndex createMonthlyIndex() {
        return new MonthlyIndex();
    }

    /**
     * Create an instance of {@link GetMortgageIndexByWeekResponse }
     * 
     */
    public GetMortgageIndexByWeekResponse createGetMortgageIndexByWeekResponse() {
        return new GetMortgageIndexByWeekResponse();
    }

    /**
     * Create an instance of {@link WeeklyIndex }
     * 
     */
    public WeeklyIndex createWeeklyIndex() {
        return new WeeklyIndex();
    }

    /**
     * Create an instance of {@link GetCurrentMortgageIndexMonthly }
     * 
     */
    public GetCurrentMortgageIndexMonthly createGetCurrentMortgageIndexMonthly() {
        return new GetCurrentMortgageIndexMonthly();
    }

    /**
     * Create an instance of {@link GetMortgageIndexByWeek }
     * 
     */
    public GetMortgageIndexByWeek createGetMortgageIndexByWeek() {
        return new GetMortgageIndexByWeek();
    }

    /**
     * Create an instance of {@link GetMortgageIndexByMonth }
     * 
     */
    public GetMortgageIndexByMonth createGetMortgageIndexByMonth() {
        return new GetMortgageIndexByMonth();
    }

    /**
     * Create an instance of {@link GetCurrentMortgageIndexByWeekly }
     * 
     */
    public GetCurrentMortgageIndexByWeekly createGetCurrentMortgageIndexByWeekly() {
        return new GetCurrentMortgageIndexByWeekly();
    }

    /**
     * Create an instance of {@link GetCurrentMortgageIndexByWeeklyResponse }
     * 
     */
    public GetCurrentMortgageIndexByWeeklyResponse createGetCurrentMortgageIndexByWeeklyResponse() {
        return new GetCurrentMortgageIndexByWeeklyResponse();
    }

    /**
     * Create an instance of {@link GetMortgageIndexByMonthResponse }
     * 
     */
    public GetMortgageIndexByMonthResponse createGetMortgageIndexByMonthResponse() {
        return new GetMortgageIndexByMonthResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeeklyIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET/", name = "WeeklyIndex")
    public JAXBElement<WeeklyIndex> createWeeklyIndex(WeeklyIndex value) {
        return new JAXBElement<WeeklyIndex>(_WeeklyIndex_QNAME, WeeklyIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthlyIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserviceX.NET/", name = "MonthlyIndex")
    public JAXBElement<MonthlyIndex> createMonthlyIndex(MonthlyIndex value) {
        return new JAXBElement<MonthlyIndex>(_MonthlyIndex_QNAME, MonthlyIndex.class, null, value);
    }

}
