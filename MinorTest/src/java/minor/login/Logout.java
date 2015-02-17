/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
import org.apache.http.HttpResponse;
import org.apache.struts2.ServletActionContext; 

/**
 *
 * @author chanakya
 */
public class Logout{
    HttpSession session=ServletActionContext.getRequest().getSession(false);
    HttpServletResponse res = ServletActionContext.getResponse();
    //response.setHeader("Pragma", "no-cache");
    //response.setHeader("Cache-Control", "no-cache");
    //response.setHeader("Expires", "0");
   
    public String execute(){
        if(session!=null || session.getAttribute("login")!=null){  
            session.invalidate();
            return "success";  
        }  
        return "login";
    }
}