/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.login;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author chanakya
 */
public class AddPortfolio extends ActionSupport {
    String StockQuote;
    String quantity;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(String buy_price) {
        this.buy_price = buy_price;
    }
    String buy_price;
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    String username = (String) session.getAttribute("user");
    
    public String getUsername() {
        return username;
    }

    public String getStockQuote() {
        return StockQuote;
    }

    public void setStockQuote(String StockQuote) {
        this.StockQuote = StockQuote;
    }
    @Override
    public void validate(){
        if(StringUtils.isEmpty(getQuantity())){
            addFieldError("quantity", "Quantity cannot be blank.");
        }
        if(StringUtils.isEmpty(getBuy_price())){
            addFieldError("buy_price", "Buy Price cannot be blank.");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String execute(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor","root","");
            PreparedStatement ps = con.prepareStatement("INSERT INTO userportfolio VALUES(?,?,?,?)");
            ps.setString(1, getUsername());
            ps.setString(2, getStockQuote().toUpperCase());
            ps.setString(3, getQuantity());
            ps.setString(4, getBuy_price());
            ps.executeUpdate();
            String sql = "UPDATE userinfo " + "  SET portfolio = ? " + "WHERE Username = ?";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, "1");
                    pstmt.setString(2, getUsername());
                    pstmt.executeUpdate();
            con.close();
            
        }catch(ClassNotFoundException e){} catch (SQLException e){
            System.out.println(e);
        }
        System.out.println(getUsername()+getStockQuote()+getQuantity()+getBuy_price());
        return "success";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }
}
