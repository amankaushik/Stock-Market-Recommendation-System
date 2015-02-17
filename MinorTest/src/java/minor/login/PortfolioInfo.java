/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chanakya
 */
public class PortfolioInfo {
    String uname;
    
    PortfolioInfo(String uname) {
        this.uname = uname; 
    }

    public String get_has_portfolio(String uname){
        return "true";
    }
    
    public Map<String, ArrayList<PortfolioData>> get_portfolio_info(String uname){
        Map<String, ArrayList<PortfolioData>> portfolioinfo = new HashMap<String, ArrayList<PortfolioData>>();
        ArrayList<PortfolioData> lpd = new ArrayList<PortfolioData>();
        PortfolioData temppd = new PortfolioData();
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor","root","");
            PreparedStatement ps = con.prepareStatement("SELECT portfolio FROM userinfo where username = ?");
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getInt(1) == 0){
                    System.out.println("No Portfolio");
                    portfolioinfo.put("0", null);
                }
                else{
                    System.out.println("Yes Portfolio");
                    ps = con.prepareStatement("SELECT ticker, quantity, buy_price FROM userportfolio where username = ?");
                    ps.setString(1, uname);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        PortfolioData pd = new PortfolioData();
                        pd.ticker = rs.getString(1);
                        pd.quantity = rs.getString(2);
                        pd.buy_price = rs.getString(3);
                        temppd = pd;
                        lpd.add(temppd);
                        temppd = null;
                    }
                    portfolioinfo.put("1", lpd);
                }
                System.out.println("tttt"+portfolioinfo);
            }
            con.close();
        }catch(ClassNotFoundException e){} catch (SQLException e){
            System.out.println(e);
        }
        return portfolioinfo;
    }
}
