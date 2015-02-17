
package minor.companyinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the minor.companyinfo package. 
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

    private final static QName _GetCashFlow_QNAME = new QName("http://companyInfo.minor/", "getCashFlow");
    private final static QName _GetIncomeStatement_QNAME = new QName("http://companyInfo.minor/", "getIncomeStatement");
    private final static QName _GetIncomeStatementResponse_QNAME = new QName("http://companyInfo.minor/", "getIncomeStatementResponse");
    private final static QName _GetCashFlowResponse_QNAME = new QName("http://companyInfo.minor/", "getCashFlowResponse");
    private final static QName _GetCompanyInfo_QNAME = new QName("http://companyInfo.minor/", "getCompanyInfo");
    private final static QName _GetCompanyInfoResponse_QNAME = new QName("http://companyInfo.minor/", "getCompanyInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: minor.companyinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCashFlow }
     * 
     */
    public GetCashFlow createGetCashFlow() {
        return new GetCashFlow();
    }

    /**
     * Create an instance of {@link GetIncomeStatementResponse }
     * 
     */
    public GetIncomeStatementResponse createGetIncomeStatementResponse() {
        return new GetIncomeStatementResponse();
    }

    /**
     * Create an instance of {@link GetIncomeStatement }
     * 
     */
    public GetIncomeStatement createGetIncomeStatement() {
        return new GetIncomeStatement();
    }

    /**
     * Create an instance of {@link GetCashFlowResponse }
     * 
     */
    public GetCashFlowResponse createGetCashFlowResponse() {
        return new GetCashFlowResponse();
    }

    /**
     * Create an instance of {@link GetCompanyInfoResponse }
     * 
     */
    public GetCompanyInfoResponse createGetCompanyInfoResponse() {
        return new GetCompanyInfoResponse();
    }

    /**
     * Create an instance of {@link GetCompanyInfo }
     * 
     */
    public GetCompanyInfo createGetCompanyInfo() {
        return new GetCompanyInfo();
    }

    /**
     * Create an instance of {@link BalanceSheet }
     * 
     */
    public BalanceSheet createBalanceSheet() {
        return new BalanceSheet();
    }

    /**
     * Create an instance of {@link IncomeStatement }
     * 
     */
    public IncomeStatement createIncomeStatement() {
        return new IncomeStatement();
    }

    /**
     * Create an instance of {@link CashFlow }
     * 
     */
    public CashFlow createCashFlow() {
        return new CashFlow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCashFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getCashFlow")
    public JAXBElement<GetCashFlow> createGetCashFlow(GetCashFlow value) {
        return new JAXBElement<GetCashFlow>(_GetCashFlow_QNAME, GetCashFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncomeStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getIncomeStatement")
    public JAXBElement<GetIncomeStatement> createGetIncomeStatement(GetIncomeStatement value) {
        return new JAXBElement<GetIncomeStatement>(_GetIncomeStatement_QNAME, GetIncomeStatement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncomeStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getIncomeStatementResponse")
    public JAXBElement<GetIncomeStatementResponse> createGetIncomeStatementResponse(GetIncomeStatementResponse value) {
        return new JAXBElement<GetIncomeStatementResponse>(_GetIncomeStatementResponse_QNAME, GetIncomeStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCashFlowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getCashFlowResponse")
    public JAXBElement<GetCashFlowResponse> createGetCashFlowResponse(GetCashFlowResponse value) {
        return new JAXBElement<GetCashFlowResponse>(_GetCashFlowResponse_QNAME, GetCashFlowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getCompanyInfo")
    public JAXBElement<GetCompanyInfo> createGetCompanyInfo(GetCompanyInfo value) {
        return new JAXBElement<GetCompanyInfo>(_GetCompanyInfo_QNAME, GetCompanyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://companyInfo.minor/", name = "getCompanyInfoResponse")
    public JAXBElement<GetCompanyInfoResponse> createGetCompanyInfoResponse(GetCompanyInfoResponse value) {
        return new JAXBElement<GetCompanyInfoResponse>(_GetCompanyInfoResponse_QNAME, GetCompanyInfoResponse.class, null, value);
    }

}
