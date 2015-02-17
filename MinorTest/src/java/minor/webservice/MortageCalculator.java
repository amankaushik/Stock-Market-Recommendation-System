/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.webservice;

import net.webservicex.MortgageResults;

/**
 *
 * @author chanakya
 */
public class MortageCalculator {
                    
    String years;
    String interest;
    String loanamt;
    String anntax;
    String annins;
    MortgageResults mr;

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getLoanamt() {
        return loanamt;
    }

    public void setLoanamt(String loanamt) {
        this.loanamt = loanamt;
    }

    public String getAnntax() {
        return anntax;
    }

    public void setAnntax(String anntax) {
        this.anntax = anntax;
    }

    public String getAnnins() {
        return annins;
    }

    public void setAnnins(String annins) {
        this.annins = annins;
    }

    public MortgageResults getMr() {
        return mr;
    }

    public void setMr(MortgageResults mr) {
        this.mr = mr;
    }
    
    
    private static MortgageResults getMortgagePayment(int years, double interest, double loanAmount, double annualTax, double annualInsurance) {
        net.webservicex.Mortgage service = new net.webservicex.Mortgage();
        net.webservicex.MortgageSoap port = service.getMortgageSoap();
        return port.getMortgagePayment(years, interest, loanAmount, annualTax, annualInsurance);
    }
    
    public String execute(){
        setMr(getMortgagePayment(Integer.parseInt(getYears()), Double.parseDouble(getInterest()), 
                Double.parseDouble(getLoanamt()), Double.parseDouble(getAnntax()), Double.parseDouble(getAnnins())));
        return "success";
    }
    
}
