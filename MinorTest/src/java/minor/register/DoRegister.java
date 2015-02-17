/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author chanakya
 */
public class DoRegister {
    public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor","root","");   
  
PreparedStatement ps=con.prepareStatement("insert into userinfo values(?,?,?,?,?)");  
ps.setString(1,r.getUname());  
ps.setString(2,r.getName());  
ps.setString(3,r.getEmail());  
ps.setString(4,r.getPassword());
ps.setInt(5, 0);
status=ps.executeUpdate();    
}catch(ClassNotFoundException e){} catch (SQLException e) {  
        }  
    return status;  
}  
}
