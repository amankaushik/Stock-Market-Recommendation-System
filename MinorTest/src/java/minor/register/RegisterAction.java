/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.register;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author chanakya
 */
public class RegisterAction extends ActionSupport{
    private String uname,name,password,email,cpassword;  

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
    @Override
    public void validate(){
        if(StringUtils.isEmpty(getUname())){
            addFieldError("uname", "Username cannot be blank.");
        }
        if(StringUtils.isEmpty(getUname())){
            addFieldError("name", "Name cannot be blank.");
        }
        if(StringUtils.isEmpty(getUname())){
            addFieldError("password", "Password cannot be blank.");
        }
        if(StringUtils.isEmpty(getCpassword())){
            addFieldError("cpassword", "Confirm Password cannot be blank.");
        }
        if(StringUtils.isEmpty(getEmail())){
            addFieldError("email", "Email cannot be blank");
        }
        if(!StringUtils.equals(getPassword(), getCpassword())){
            addFieldError("cpassword", "Passwords don't match.");
        }
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Minor","root","");  
      
        PreparedStatement ps=con.prepareStatement("select * from userinfo where username=?");  
        ps.setString(1,uname);
        
        ResultSet rs = ps.executeQuery();  
        if(rs.next()){
            addFieldError("uname", "Username already taken.");
        }  
        con.close();
    }catch(ClassNotFoundException e){
        System.out.println(e);
    }   catch (SQLException e) {    
        System.out.println(e);
        }    
    }
  
    @Override
    public String execute(){  
        int i=DoRegister.save(this);  
        if(i>0){  
            return "success";  
        }  
        return "error";  
    }  
}
