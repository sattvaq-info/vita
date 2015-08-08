<%-- 
    Document   : edit1
    Created on : Aug 7, 2015, 6:20:08 PM
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
        <h1>Hello World!</h1>
        
        <%
            
            
             String userid= session.getAttribute("suserid").toString();
            
             
             // getting DB connection
             
              
              Class.forName("com.mysql.jdbc.Driver");
          
             java.sql.Connection   mycon =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/vitadb", "123vita", "123");

             
             
             String q="select * from users where userid='"+userid+"'";
             
             java.sql.Statement stmt= mycon.createStatement();
             
             java.sql.ResultSet rs=stmt.executeQuery(q);
             
             if(rs.next())
             {
                 
                 String tname=rs.getString(3);
                 String dob=rs.getString(4);
                 String gender=rs.getString(5);
                 String location=rs.getString(6);
                 String phn=rs.getString(7);
             
                 %>
        .
        output in form format.
        
        <form action="EditUserServlet">
            
            
            <table border="0">
                
                <tbody>
                    <tr>
                        <td></td>
                        <td><input type="hidden" name="uid" value="<%=userid%>" /></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="n" value="<%=tname%>" /></td>
                    </tr>
                    <tr>
                        <td>DOB</td>
                        <td><input type="text" name="dob" value="<%=dob%>" /></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><input type="text" name="gender" value="<%=gender%>" /></td>
                    </tr>
                    <tr>
                        <td>Location </td>
                        <td><input type="text" name="loc" value="<%=location%>" /></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="text" name="phn" value="<%=phn%>" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Edit" /></td>
                    </tr>
                </tbody>
            </table>

                   </form>
        
        
        
        
        <%
                 
             }
             else
             {
             
             
             }
             
             
             
            %>
    </body>
</html>
