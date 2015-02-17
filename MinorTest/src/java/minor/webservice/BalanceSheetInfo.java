/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.webservice;

import java.util.ArrayList;
import java.util.List;
import minor.companyinfo.BalanceSheet;

/**
 *
 * @author chanakya
 */
public class BalanceSheetInfo {

    String timeframe;
    String ticker;
    List<BalanceSheet> bs;
    BalanceSheet one;
    BalanceSheet two;
    BalanceSheet three;
    BalanceSheet four;

    public BalanceSheet getOne() {
        return one;
    }

    public void setOne(BalanceSheet one) {
        this.one = one;
    }

    public BalanceSheet getTwo() {
        return two;
    }

    public void setTwo(BalanceSheet two) {
        this.two = two;
    }

    public BalanceSheet getThree() {
        return three;
    }

    public void setThree(BalanceSheet three) {
        this.three = three;
    }

    public BalanceSheet getFour() {
        return four;
    }

    public void setFour(BalanceSheet four) {
        this.four = four;
    }
    
    public List<BalanceSheet> getBs() {
        return bs;
    }

    public void setBs(List<BalanceSheet> bs) {
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

    private static java.util.List<minor.companyinfo.BalanceSheet> getCompanyInfo(java.lang.String ticker, java.lang.String timeframe) {
        minor.companyinfo.NewWebService service = new minor.companyinfo.NewWebService();
        minor.companyinfo.CompanyInfo port = service.getCompanyInfoPort();
        return port.getCompanyInfo(ticker, timeframe);
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
        setBs(getCompanyInfo(getTicker(), sent_time));
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

}
