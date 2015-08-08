<%-- 
    Document   : getUsersList
    Created on : Jul 30, 2015, 6:11:26 PM
    Author     : SattvaQ1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Users</h1>
        <%
            
            
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
          
          
          
          %>
        
          <table>
              
              <thead><th>User id</th><th>Name </th><th>DOB</th></thead>
          
          <tbody>
        <%
          
          while(rs.next())
          {
              
              
              String tuserid=rs.getString(1);
              String tname= rs.getString(3);
              
              String tdob=rs.getString(4);
              
              %>
        
              <tr><td><%=tuserid%></td><td><%=tname%></td><td><%=tdob%></td></tr>
              
              <%
              
          
          }
                  
          
          
            
            %>
            
          </tbody>
    </table>
        
    </body>
</html>
