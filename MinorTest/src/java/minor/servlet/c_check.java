package minor.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import minor.ejb.ETFlookup;
import minor.ejb.Lookup;
import minor.session.ETFlookupFacadeLocal;
import minor.session.LookupFacadeLocal;
//import model.Lookup;
//import sessionBean.AbstractFacade;
//import sessionBean.LookupFacadeRemote;
//import minor.ejb.LookupFacadeRemote;
//import minor.remote.Lookup;
/**
 * 
 * @author chanakya
 */
public class c_check extends HttpServlet {
    
    @EJB
    private LookupFacadeLocal lfl;
    @EJB
    private ETFlookupFacadeLocal elfl;
    //@EJB
    
    //private AbstractFacade af;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet c_check</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet c_check at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");  
        //PrintWriter out = response.getWriter();
        String uname = request.getParameter("cname");
        //HttpSession session = request.getSession();
        
        int flag = -1;
        List<ETFlookup> l = elfl.findAll();
        
        for(ETFlookup obj : l){
            System.out.println(obj.getName());
            if(obj.getTicker().equals(uname.toUpperCase())){
                request.setAttribute("ccheck", obj.getName());
                flag = 1;
                break;
            }
        }
        //}catch(Exception e){
        //    System.out.println(e);
        //}
        if(flag == -1){
                request.setAttribute("ccheck", "No Such ETF");
            }
        //processRequest(request, response);

                    RequestDispatcher rd = request.getRequestDispatcher("etf.jsp");
                    rd.forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
        //PrintWriter out = response.getWriter();
        String uname = request.getParameter("cname");
        //HttpSession session = request.getSession();
        
        int flag = -1;
        List<Lookup> l = lfl.findAll();
        
        for(Lookup obj : l){
            System.out.println(obj.getSymbol());
            if(obj.getName().equals(uname)){
                request.setAttribute("ccheck", obj.getSymbol());
                flag = 1;
                break;
            }
        }
        //}catch(Exception e){
        //    System.out.println(e);
        //}
        if(flag == -1){
                request.setAttribute("ccheck", "No Such Commodity");
            }
        //processRequest(request, response);

                    RequestDispatcher rd = request.getRequestDispatcher("commodity.jsp");
                    rd.forward(request, response);
 
        

            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
