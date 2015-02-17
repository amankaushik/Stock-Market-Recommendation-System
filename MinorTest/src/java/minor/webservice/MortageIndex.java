/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.webservice;

import net.webservicex.MonthlyIndex;
import net.webservicex.WeeklyIndex;

/**
 *
 * @author chanakya
 */
public class MortageIndex {

    String day;
    String month;
    String year;
    String indexBy;
    WeeklyIndex wi;
    WeeklyIndex wi_cur;
    MonthlyIndex mi;
    MonthlyIndex mi_cur;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIndexBy() {
        return indexBy;
    }

    public void setIndexBy(String indexBy) {
        this.indexBy = indexBy;
    }

    public WeeklyIndex getWi_cur() {
        return wi_cur;
    }

    public void setWi_cur(WeeklyIndex wi_cur) {
        this.wi_cur = wi_cur;
    }

    public MonthlyIndex getMi() {
        return mi;
    }

    public void setMi(MonthlyIndex mi) {
        this.mi = mi;
    }

    public MonthlyIndex getMi_cur() {
        return mi_cur;
    }

    public void setMi_cur(MonthlyIndex mi_cur) {
        this.mi_cur = mi_cur;
    }

    public WeeklyIndex getWi() {
        return wi;
    }

    public void setWi(WeeklyIndex wi) {
        this.wi = wi;
    }
    
    
    private static WeeklyIndex getMortgageIndexByWeek(int day, int month, int year) {
        net.webservicex.MortgageIndex service = new net.webservicex.MortgageIndex();
        net.webservicex.MortgageIndexSoap port = service.getMortgageIndexSoap();
        return port.getMortgageIndexByWeek(day, month, year);
    }

    private static MonthlyIndex getMortgageIndexByMonth(int month, int year) {
        net.webservicex.MortgageIndex service = new net.webservicex.MortgageIndex();
        net.webservicex.MortgageIndexSoap port = service.getMortgageIndexSoap();
        return port.getMortgageIndexByMonth(month, year);
    }

    private static WeeklyIndex getCurrentMortgageIndexByWeekly() {
        net.webservicex.MortgageIndex service = new net.webservicex.MortgageIndex();
        net.webservicex.MortgageIndexSoap port = service.getMortgageIndexSoap();
        return port.getCurrentMortgageIndexByWeekly();
    }

    private static MonthlyIndex getCurrentMortgageIndexMonthly() {
        net.webservicex.MortgageIndex service = new net.webservicex.MortgageIndex();
        net.webservicex.MortgageIndexSoap port = service.getMortgageIndexSoap();
        return port.getCurrentMortgageIndexMonthly();
    }
    
        public String execute(){
            if(getIndexBy().equals("1")){
              System.out.println(getIndexBy());
                //System.out.println(Integer.parseInt(getDay()));
                //System.out.println(Integer.parseInt(getMonth()));
                //System.out.println(Integer.parseInt(getYear()));
                //setWi(getMortgageIndexByWeek(Integer.parseInt(getDay()), Integer.parseInt(getMonth()), Integer.parseInt(getYear())));
                setWi_cur(getCurrentMortgageIndexByWeekly());
            }else{
                //setMi(getMortgageIndexByMonth(Integer.parseInt(getMonth()), Integer.parseInt(getYear())));
                setMi_cur(getCurrentMortgageIndexMonthly());
            }
        return "success";
    }
}
