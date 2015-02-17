/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.webservice;

/**
 *
 * @author chanakya
 */
public class ARPLoanLease {                  
    String a_amt;
    String a_cost;
    String a_rate;
    String a_mnth;
    
    String le_amt;
    String le_cost;
    String le_rate;
    String le_mnth;
    
    String l_amt;
    String l_rate;
    String l_mnth;
    
    String m_amt;
    String m_rate;
    String m_mnth;
    
    String all;

    double apr;
    double lease;
    double loan;
    double month;

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    public double getLease() {
        return lease;
    }

    public void setLease(double lease) {
        this.lease = lease;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }
    
    
    
    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    
    
    public String getA_amt() {
        return a_amt;
    }

    public void setA_amt(String a_amt) {
        this.a_amt = a_amt;
    }

    public String getA_cost() {
        return a_cost;
    }

    public void setA_cost(String a_cost) {
        this.a_cost = a_cost;
    }

    public String getA_rate() {
        return a_rate;
    }

    public void setA_rate(String a_rate) {
        this.a_rate = a_rate;
    }

    public String getA_mnth() {
        return a_mnth;
    }

    public void setA_mnth(String a_mnth) {
        this.a_mnth = a_mnth;
    }

    public String getLe_amt() {
        return le_amt;
    }

    public void setLe_amt(String le_amt) {
        this.le_amt = le_amt;
    }

    public String getLe_cost() {
        return le_cost;
    }

    public void setLe_cost(String le_cost) {
        this.le_cost = le_cost;
    }

    public String getLe_rate() {
        return le_rate;
    }

    public void setLe_rate(String le_rate) {
        this.le_rate = le_rate;
    }

    public String getLe_mnth() {
        return le_mnth;
    }

    public void setLe_mnth(String le_mnth) {
        this.le_mnth = le_mnth;
    }

    public String getL_amt() {
        return l_amt;
    }

    public void setL_amt(String l_amt) {
        this.l_amt = l_amt;
    }

    public String getL_rate() {
        return l_rate;
    }

    public void setL_rate(String l_rate) {
        this.l_rate = l_rate;
    }

    public String getL_mnth() {
        return l_mnth;
    }

    public void setL_mnth(String l_mnth) {
        this.l_mnth = l_mnth;
    }

    public String getM_amt() {
        return m_amt;
    }

    public void setM_amt(String m_amt) {
        this.m_amt = m_amt;
    }

    public String getM_rate() {
        return m_rate;
    }

    public void setM_rate(String m_rate) {
        this.m_rate = m_rate;
    }

    public String getM_mnth() {
        return m_mnth;
    }

    public void setM_mnth(String m_mnth) {
        this.m_mnth = m_mnth;
    }

    private static double apr(double loanAmount, double extraCost, double interestRate, double months) {
        net.webservicex.FinanceService service = new net.webservicex.FinanceService();
        net.webservicex.FinanceServiceSoap port = service.getFinanceServiceSoap();
        return port.apr(loanAmount, extraCost, interestRate, months);
    }

    private static double leaseMonthlyPayment(double loanAmount, double residualValue, double interestRate, double months) {
        net.webservicex.FinanceService service = new net.webservicex.FinanceService();
        net.webservicex.FinanceServiceSoap port = service.getFinanceServiceSoap();
        return port.leaseMonthlyPayment(loanAmount, residualValue, interestRate, months);
    }

    private static double loanMonthlyPayment(double loanAmount, double interestRate, double months) {
        net.webservicex.FinanceService service = new net.webservicex.FinanceService();
        net.webservicex.FinanceServiceSoap port = service.getFinanceServiceSoap();
        return port.loanMonthlyPayment(loanAmount, interestRate, months);
    }

    private static double loanNumberOfPayment(double loanAmount, double interestRate, double monthlyPayment) {
        net.webservicex.FinanceService service = new net.webservicex.FinanceService();
        net.webservicex.FinanceServiceSoap port = service.getFinanceServiceSoap();
        return port.loanNumberOfPayment(loanAmount, interestRate, monthlyPayment);
    }
    
        public String execute(){
                if(getAll().equals("1")){
                    setApr(apr(Double.parseDouble(getA_amt()), Double.parseDouble(getA_cost()), 
                            Double.parseDouble(getA_rate()), Double.parseDouble(getA_mnth())));
                }
                else if(getAll().equals("2")){
                    setLease(leaseMonthlyPayment(Double.parseDouble(getLe_amt()), Double.parseDouble(getLe_cost()), 
                            Double.parseDouble(getLe_rate()), Double.parseDouble(getLe_mnth())));
                }
                else if(getAll().equals("3")){
                    setLoan(loanMonthlyPayment(Double.parseDouble(getL_amt()), Double.parseDouble(getL_rate()),
                            Double.parseDouble(getL_mnth())));
                }
                else{
                    setMonth(loanNumberOfPayment(Double.parseDouble(getM_amt()), Double.parseDouble(getM_rate()),
                            Double.parseDouble(getM_mnth())));
                }
        return "success";
    }
}
