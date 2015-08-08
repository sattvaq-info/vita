<%-- 
    Document   : loginform
    Created on : Jul 19, 2015, 11:58:46 AM
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
        <h1>Login Page</h1>
        
        <form action="LoginServlet" method="POST">
       
            <table border="0">
               
                <tbody>
                    <tr>
                        <td>Enter User Email is</td>
                        <td><input type="email" name="userid" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="psw" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login Here" /></td>
                    </tr>
                </tbody>
            </table>

        
        </form>
        
        
        
        
        
        
    </body>
</html>
