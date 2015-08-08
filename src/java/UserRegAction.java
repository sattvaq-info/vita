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
public class UserRegAction extends HttpServlet {

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
           
            
            // step1 getting values from user form
            
            String email=null,psw=null,phn=null,dob=null,location=null,gender=null,name=null;
            
            
            
            String status="1";
            
            String today=   new java.util.Date().toString();
            
            
            
            email= request.getParameter("email");
            phn=request.getParameter("p");
            psw=request.getParameter("psw");
            
            location=request.getParameter("l");
            
            dob= request.getParameter("dob");
            
            gender=request.getParameter("g");
            
            name= request.getParameter("uname");
            
            
            
            
            
            
            // step2 creating Connection Object
            
                // step 2.1 
            // loading driver class (object) it was not loaded
          Class.forName("com.mysql.jdbc.Driver");
          
          // step 2.2 
          
          // create COnnection interface reference 
          
          // Db is avaialbe URL :  jdbc:mysql://192.52.45.78:3306/vitadb
          // 
          
          
          java.sql.Connection   mycon =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/vitadb", "123vita", "123");
          
          
          
          // creating SQL query as String Variable
          
          // insert into users values ( '','','','','','','','','')
          
          
          
      
          String q="insert into users values ( '"+email+"','"+psw+"','"+name+"','"+dob+"','"+gender+"','"+location+"','"+phn+"','"+today+"','"+status+"')";
          
          // SQL into two types 1) Select executeQuery 2) non select  <-- executeUpdate() of Statement object
          
          
          // creating stmt object
          
          java.sql.Statement  st= mycon.createStatement();
          
          
          
          // invoke executeUpdate() <-- int value
          
          // number of rows are being insterd , updated   
          
          
          int i=   st.executeUpdate(q);
          
          if(i>0)
          {
          
          // insetered area    afterreg.jsp
              // deligating to jsp page
              
              
              // RD   
              
              
              // create RD object  
              
              
              
              String link="<a href='http://localhost:8080/vita/activateAccount.jsp'>Activate YOu Account</a>";
              
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("afteruserreg.jsp");
              
              
              rd.forward(request, response);
                      
              
              
              // keyboard   
              
              
              
            
          }
          else{
              
              // error  error.jsp
              
              
               javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("error.jsp");
              
              
              rd.forward(request, response);
          
          }
          
          
          // for insertin gsome data into a table as rows
          
          //  admin --- red fac, reg user, add somethis (p[roduct, feedback, sending mail) 80% 
          // compose    composedata table
          
          // create fopr
          out.print("Ok connected");
            
            
            // coder 
          
          
            
            
            
            
        }
        
        catch(Exception e)
        {
        
        out.print(e);
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
