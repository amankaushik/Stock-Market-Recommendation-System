/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.eft;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import minor.ejb.CommodityDetails;
import minor.ejb.ETFDetails;
import minor.session.ETFDetailsFacade;
import minor.session.ETFDetailsFacadeLocal;
import minor.session.ETFlookupFacadeLocal;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;

/**
 *
 * @author chanakya
 */
public class ETFQuote  extends ActionSupport {
    ETFDetailsFacadeLocal eTFDetailsFacade = lookupETFDetailsFacadeLocal();
    ETFDetails sd;

    public ETFDetails getSd() {
        return sd;
    }

    public void setSd(ETFDetails sd) {
        this.sd = sd;
    }
    private String cticker;

    public String getCticker() {
        return cticker;
    }

    public void setCticker(String cticker) {
        this.cticker = cticker;
    }
    @Override
    public void validate(){
        if(StringUtils.isEmpty(getCticker())){
            addFieldError("cticker", "Commodity Quote cannot be blank");
        }
        if(StringUtils.isNumeric(getCticker())){
            addFieldError("cticker", "Commodity Quote cannot be numeric");
        }
        if(StringUtils.length(getCticker())>12){
            addFieldError("cticker", "Invalid Ticker length");
        }
    }
    
    @Override
    public String execute(){
        
        System.out.println("Ticker in Commodity Quote: "+getCticker());
        System.out.println("Checking");
        //List<CommodityDetails> sd2 = cdf.getCommodityData(getCticker());
        //System.out.println("Size of return Value: "+sd2.size());
        /*
        for(CommodityDetails cd : sd2){
            cdf.create(cd);
        }*/
        JSONObject quote = eTFDetailsFacade.getETFData(getCticker());
        System.out.println("Array List: "+ quote.toJSONString());
        //System.out.println("CDF String: "+cdf.toString());
        //System.out.println("Checking again");
        
        Set<String> st = quote.keySet();
        try{
                    for(String s: st){
                        if(quote.get(s) == null){
                            System.out.println("IN IF");
                            //quote.remove(s);
                            quote.put(s, "NA");
                        }
                    }
        }catch(Exception e){
            System.out.println(e);
        }            
        ETFDetails cd = new ETFDetails(quote);
        System.out.println(cd.getPERatio());
        System.out.println(cd.getEBITDA());
        System.out.println(cd.getPreviousClose());
        System.out.println(cd.getDaysHigh());
        System.out.println(cd.getVolume());
        setSd(cd);
        //setSd(sd.add(cd));
        if(true){
            return "success";
        }
        else{
            System.out.println("Checking again again");
            return "error";
        }
    }

    private ETFDetailsFacadeLocal lookupETFDetailsFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (ETFDetailsFacadeLocal) c.lookup("java:global/MinorTest/ETFDetailsFacade!minor.session.ETFDetailsFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
}
