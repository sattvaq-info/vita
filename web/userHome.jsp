<%-- 
    Document   : userHome
    Created on : Jul 29, 2015, 6:22:01 PM
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
        
        <%
           String name= session.getAttribute("sname").toString();
            
            %>
        
        <h1>Welcome To Home page <%=name%> </h1>
        
        <a href="viewProfile.jsp">View Profile</a>
    </body>
</html>
