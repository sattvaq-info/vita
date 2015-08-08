<%-- 
    Document   : test
    Created on : Jul 29, 2015, 7:03:54 PM
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
        
        <%=session.getAttribute("sname").toString()%>
        
                <%=session.getAttribute("suserid").toString()%>
        
                
    </body>
</html>
