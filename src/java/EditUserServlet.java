/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SattvaQ1
 */
public class EditUserServlet extends HttpServlet {

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
         
            
            String uid=request.getParameter("uid");
            String name=request.getParameter("n");
            String dob=request.getParameter("dob");
            String gender=request.getParameter("gender");
            String loc=request.getParameter("loc");
            String phn=request.getParameter("phn");
            
            
            
            // connect with DB
            
              Class.forName("com.mysql.jdbc.Driver");
          
             java.sql.Connection   mycon =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/vitadb", "123vita", "123");

            
             
             
             String q="update users set psw='"+name+"' , dob='"+dob+"', gender='"+gender+"', location='"+loc+"' , phn='"+phn+"' where userid='"+uid+"'";
            
             
             
             // update  users set name="" where userid=""
             java.sql.Statement stmt= mycon.createStatement();
             
             int i= stmt.executeUpdate(q);
             
             if(i>0)
             {
             
                        
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("viewProfile.jsp");
              
              
              rd.forward(request, response);
             }
             
             
            
        
        else{
                
                                        
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("error.jsp");
              
              
              rd.forward(request, response);
             }
                }
        catch(Exception e)
        {}
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
        processRequest(request, response);
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
        processRequest(request, response);
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
