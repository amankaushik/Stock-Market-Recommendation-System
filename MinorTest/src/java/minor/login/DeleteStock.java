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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author chanakya
 */
public class DeleteStock {

    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    String username = (String) session.getAttribute("user");

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

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
    String ticker, quantity, buy_price;

    public String execute() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor", "root", "");
            System.out.println("kokoko" + getUsername());
            PreparedStatement ps = con.prepareStatement("DELETE FROM userportfolio WHERE username=? and ticker=? and quantity=? and buy_price=?");
            ps.setString(1, getUsername());
            ps.setString(2, getTicker().toUpperCase());
            ps.setString(3, getQuantity());
            ps.setString(4, getBuy_price());
            System.out.println(ps);
            ps.executeUpdate();
            con.close();
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor", "root", "");
            PreparedStatement ps2 = con.prepareStatement("SELECT count(ticker) FROM userportfolio WHERE username=?");
            ps2.setString(1, getUsername());
            ResultSet rs = ps2.executeQuery();

            if (rs.next()) {
                int count = -1;
                count = rs.getInt(1);
                System.out.println(count);
                if (count == 0) {
                    String sql = "UPDATE userinfo " + "  SET portfolio = ? " + "WHERE username = ?";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, "0");
                    pstmt.setString(2, getUsername());
                    System.out.println(pstmt);
                    pstmt.executeUpdate();
                    con.close();
                }
            }
        } catch (ClassNotFoundException ee) {
        } catch (SQLException ee) {
            System.out.println(ee);
        }

        return "success";
    }

    public String getUsername() {
        return username;
    }
}
