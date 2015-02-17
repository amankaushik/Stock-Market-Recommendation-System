/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author chanakya
 */
public class Portfolio {
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    ArrayList<PortfolioData> all_values = new ArrayList<PortfolioData>();
    String uname = (String) session.getAttribute("user");
    String hasPortfolio;
    Map<String, ArrayList<PortfolioData>> portfolioinfo = new HashMap<String, ArrayList<PortfolioData>>();

    public ArrayList<PortfolioData> getAll_values() {
        return all_values;
    }

    public void setAll_values(ArrayList<PortfolioData> all_values) {
        this.all_values = all_values;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getHasPortfolio() {
        return hasPortfolio;
    }

    public void setHasPortfolio(String hasPortfolio) {
        this.hasPortfolio = hasPortfolio;
    }

    public String execute() {
        System.out.println("qqqq"+uname);
        PortfolioInfo pi = new PortfolioInfo(uname);
        portfolioinfo = pi.get_portfolio_info(uname);
        Iterator<Map.Entry<String, ArrayList<PortfolioData>>> entries = portfolioinfo.entrySet().iterator();
        System.out.println("wwww"+portfolioinfo);
        while (entries.hasNext()) {
            Map.Entry<String, ArrayList<PortfolioData>> entry = entries.next();
            setAll_values(entry.getValue());
            System.out.println("eeeee"+all_values);
            setHasPortfolio(entry.getKey());
            System.out.println("rrrrr"+getHasPortfolio());
        }
        return "success";
    }

}
