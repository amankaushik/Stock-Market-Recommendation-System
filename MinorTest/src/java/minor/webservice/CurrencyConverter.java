/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.webservice;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import net.webservicex.Currency;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author chanakya
 */
public class CurrencyConverter{
    String changeFrom, changeTo, amount;
    double value;
    double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getChangeFrom() {
        return changeFrom;
    }

    public void setChangeFrom(String changeFrom) {
        this.changeFrom = changeFrom;
    }

    public String getChangeTo() {
        return changeTo;
    }

    public void setChangeTo(String changeTo) {
        this.changeTo = changeTo;
    }

    private static double conversionRate(net.webservicex.Currency fromCurrency, net.webservicex.Currency toCurrency) {
        net.webservicex.CurrencyConvertor service = new net.webservicex.CurrencyConvertor();
        net.webservicex.CurrencyConvertorSoap port = service.getCurrencyConvertorSoap();
        return port.conversionRate(fromCurrency, toCurrency);
    }

    
    public String execute(){
        setRate((conversionRate(Currency.fromValue(getChangeFrom()), Currency.fromValue(getChangeTo()))));
        setValue(rate * Double.parseDouble(getAmount()));
            return "success";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }
}
