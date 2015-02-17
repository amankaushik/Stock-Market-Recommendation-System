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
/**
 *
 * @author chanakya
 */
public class DoLogin {
    public static boolean loginvalidate(String username,String password){  
 boolean status=false;  
  try{  
   Class.forName("com.mysql.jdbc.Driver");  
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor","root","");
     
   PreparedStatement ps=con.prepareStatement(  
     "select * from userinfo where username=? and password=?");  
   ps.setString(1,username);  
   ps.setString(2,password);  
   ResultSet rs=ps.executeQuery();  
   status=rs.next();  
  }catch(ClassNotFoundException e){} catch (SQLException e) {  
        }  
 return status;  
}  
}
