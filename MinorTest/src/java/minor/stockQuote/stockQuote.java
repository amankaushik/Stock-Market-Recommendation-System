/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.stockQuote;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author chanakya
 */
public class stockQuote extends ActionSupport{
    private String StockQuote;
    List<StockDetails> sd;

    public List<StockDetails> getSd() {
        return sd;
    }

    public void setSd(List<StockDetails> sd) {
        this.sd = sd;
    }
    /*
    public List<StockDetails> getSd(){
        return sd;
    }
    */
    public void setStockQuote(String StockQuote) {
        this.StockQuote = StockQuote;
    }

    public String getStockQuote() {
        return StockQuote;
    }
    
    @Override
    public void validate(){
        if(StringUtils.isEmpty(getStockQuote())){
            addFieldError("StockQuote", "Stock Quote cannot be blank");
        }
        if(StringUtils.isNumeric(getStockQuote())){
            addFieldError("StockQuote", "Stock Quote cannot be numeric");
        }
        if(StringUtils.length(getStockQuote())>6){
            addFieldError("StockQuote", "Invalid Ticker length");
        }
    }
    
    public String execute(){
        System.out.println(getStockQuote());
        StockData stockData = new StockData();
        sd = stockData.getStockData(getStockQuote());
        //System.out.println("rtrtrt"+sd.toString());
        if(!sd.isEmpty()){
            return "success";
        }
        else{
            return "error";
        }
    }
}
