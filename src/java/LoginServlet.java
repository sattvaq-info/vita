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
public class LoginServlet extends HttpServlet {

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
        try  {
            /* TODO output your page here. You may use following sample code. */
           // getting values from form
            
            String userid=request.getParameter("userid");
            String psw=request.getParameter("psw");
            
            
            
            // connect with DB
            
              Class.forName("com.mysql.jdbc.Driver");
          
             java.sql.Connection   mycon =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/vitadb", "123vita", "123");

            
             
             // SQL    select psw, name from users where userid='"++"'
             
             String q="select psw, name from users where userid='"+userid+"'";
             
             
             
             
              java.sql.Statement  st= mycon.createStatement();
          
          // call executeQuery();
              
              
              java.sql.ResultSet  r= st.executeQuery(q);
              
              
              // next()  T/F    
              
              
              if(r.next())
              {
              
              // email is avaiable
                  
                  String tpsw=r.getString("psw");
                  
                  if(psw.equals(tpsw))
                  {
                  // both are correct
                      
                      String tname= r.getString(2);
                      
                      
                    
                      
                      // sessin object 
                      
                      javax.servlet.http.HttpSession s=  request.getSession();
                      
                      
                      s.setAttribute("sname", tname);
                      s.setAttribute("suserid", userid);
                      
                      
                      
                      // RD
                  // userHome.jsp
                      
                      
                       
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("userHome.jsp");
              
              
              rd.forward(request, response);
                      
                  }
                  
                  
                  else
                  {
                  
                  // password is wrong
                      //RD
                  // errorpsw.jsp
                       
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("errorPsw.jsp");
              
              
              rd.forward(request, response);
                      
                  }
              
              }
              else
              {
              
              // email not avaialbe : ie user not yet registered
                 
                  
                  //RD    witth errorEmail.jsp
                  
                  
                   
              javax.servlet.RequestDispatcher   rd= request.getRequestDispatcher("errorEmail.jsp");
              
              
              rd.forward(request, response);
                      
              }
              
              
              
              
              
            
            
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
