package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getUsersList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>List of Users</h1>\r\n");
      out.write("        ");

            
            
            // connection reference variable
            
                // loading driver class (object) it was not loaded
          Class.forName("com.mysql.jdbc.Driver");
          
          // step 2.2 
          
          // create COnnection interface reference 
          
          // Db is avaialbe URL :  jdbc:mysql://192.52.45.78:3306/vitadb
          // 
          
          
          java.sql.Connection   mycon =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/vitadb", "123vita", "123");
          
          
            
          
          String q="select * from users"; // executeQuery()<-- resultSet object
          
          java.sql.Statement  stmt= mycon.createStatement();
            
          java.sql.ResultSet rs= stmt.executeQuery(q);
          
          
          
          
      out.write("\r\n");
      out.write("        \r\n");
      out.write("          <table>\r\n");
      out.write("              \r\n");
      out.write("              <thead><th>User id</th><th>Name </th><th>DOB</th></thead>\r\n");
      out.write("          \r\n");
      out.write("          <tbody>\r\n");
      out.write("        ");

          
          while(rs.next())
          {
              
              
              String tuserid=rs.getString(1);
              String tname= rs.getString(3);
              
              String tdob=rs.getString(4);
              
              
      out.write("\r\n");
      out.write("        \r\n");
      out.write("              <tr><td>");
      out.print(tuserid);
      out.write("</td><td>");
      out.print(tname);
      out.write("</td><td>");
      out.print(tdob);
      out.write("</td></tr>\r\n");
      out.write("              \r\n");
      out.write("              ");

              
          
          }
                  
          
          
            
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
