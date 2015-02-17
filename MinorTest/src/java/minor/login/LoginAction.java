/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.login;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;  
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  
/**
 *
 * @author chanakya
 */
public class LoginAction extends ActionSupport implements SessionAware { 
private String username,password;  
SessionMap<String,String> sessionmap;  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public SessionMap<String, String> getSessionmap() {
        return sessionmap;
    }

    public void setSessionmap(SessionMap<String, String> sessionmap) {
        this.sessionmap = sessionmap;
    }
    
    @Override
    public void validate(){
        if(StringUtils.isEmpty(getUsername())){
            addFieldError("username", "Username cannot be blank.");
        }
        if(StringUtils.isEmpty(getPassword())){
            addFieldError("password", "Password cannot be blank.");
        }
    }
  
    @Override
    public String execute(){  
        if(DoLogin.loginvalidate(username, password)){  
            sessionmap.put("user", getUsername());
            return "success";  
        }  
        else{  
            return "error";  
        }  
    }  
  
@Override
public void setSession(Map map) {  
    sessionmap=(SessionMap)map;  
    sessionmap.put("login","true");
}

    /**
     *
     * @return
     */
/*
    public String logout(){
        System.out.println(sessionmap.toString());
        sessionmap.invalidate();
        System.out.println("Invalidated");
        System.out.println(sessionmap.toString());
        return "success";  
    }  
  */
}  
