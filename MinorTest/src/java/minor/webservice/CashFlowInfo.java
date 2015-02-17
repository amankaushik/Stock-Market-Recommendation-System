/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.webservice;

import java.util.ArrayList;
import java.util.List;
import minor.companyinfo.CashFlow;

/**
 *
 * @author chanakya
 */
public class CashFlowInfo {

    String timeframe;
    String ticker;
    List<CashFlow> bs;
    CashFlow one;
    CashFlow two;
    CashFlow three;
    CashFlow four;

    public CashFlow getOne() {
        return one;
    }

    public void setOne(CashFlow one) {
        this.one = one;
    }

    public CashFlow getTwo() {
        return two;
    }

    public void setTwo(CashFlow two) {
        this.two = two;
    }

    public CashFlow getThree() {
        return three;
    }

    public void setThree(CashFlow three) {
        this.three = three;
    }

    public CashFlow getFour() {
        return four;
    }

    public void setFour(CashFlow four) {
        this.four = four;
    }
    
    public List<CashFlow> getBs() {
        return bs;
    }

    public void setBs(List<CashFlow> bs) {
        this.bs = bs;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String time) {
        this.timeframe = time;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String execute() {
        String sent_time;
        System.out.println(getTicker());
        System.out.println(getTimeframe());
        if(getTimeframe().equals("1")){
            sent_time = "annual";
        }
        else{
            sent_time = "quaterly";
        }
        //bs.addAll(getCompanyInfo(getTicker(), getTime()));
        setBs(getCashFlow(getTicker(), sent_time));
        //System.out.println(getTicker()+getTimeframe());
        //System.out.println(getCompanyInfo(getTicker(), getTimeframe()).size());
        //System.out.println(getBs().size());
        setOne(getBs().get(0));
            setTwo(getBs().get(1));
            setThree(getBs().get(2));
        if(getTimeframe().equals("2")){
            setFour(getBs().get(3));
        }
        return "success";
    }

    private static java.util.List<minor.companyinfo.CashFlow> getCashFlow(java.lang.String ticker, java.lang.String timeframe) {
        minor.companyinfo.NewWebService service = new minor.companyinfo.NewWebService();
        minor.companyinfo.CompanyInfo port = service.getCompanyInfoPort();
        return port.getCashFlow(ticker, timeframe);
    }

}
