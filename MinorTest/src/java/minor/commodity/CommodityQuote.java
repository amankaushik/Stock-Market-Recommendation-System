/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.commodity;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import minor.ejb.CommodityDetails;
import minor.session.CommodityDetailsFacadeLocal;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
/**
 *
 * @author chanakya
 */
public class CommodityQuote  extends ActionSupport{
    CommodityDetailsFacadeLocal commodityDetailsFacade = lookupCommodityDetailsFacadeLocal();
    //CommodityDetailsFacadeLocal commodityDetailsFacade;
    CommodityDetails sd;

    public CommodityDetails getSd() {
        return sd;
    }

    public void setSd(CommodityDetails sd) {
        this.sd = sd;
    }
    private String cticker;
    /*
    public List<CommodityDetails> getSd() {
        return sd;
    }

    public void setSd(List<CommodityDetails> sd) {
        this.sd = sd;
    }
    */
    
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
        JSONObject quote = commodityDetailsFacade.getCommodityData(getCticker());
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
        CommodityDetails cd = new CommodityDetails(quote);
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
    //private static final Logger LOGG= Logger.getLogger(CommodityQuote.class.getName());
/*
    private CommodityDetailsFacadeLocal lookupCommodityDetailsFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (CommodityDetailsFacadeLocal) c.lookup("java:global/MinorTest/CommodityDetailsFacade!minor.session.CommodityDetailsFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    */

    private CommodityDetailsFacadeLocal lookupCommodityDetailsFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (CommodityDetailsFacadeLocal) c.lookup("java:global/MinorTest/CommodityDetailsFacade!minor.session.CommodityDetailsFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
