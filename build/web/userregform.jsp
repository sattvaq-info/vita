<%-- 
    Document   : userregform
    Created on : Jul 19, 2015, 11:58:53 AM
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
        <h1>User Sign Up Form</h1>
        
        <form action="UserRegAction" method="post">
            
            
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>Enter Email ID</td>
                        <td><input type="email" required name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="psw" value="" /></td>
                    </tr>
                    <tr>
                        <td>Select DOB</td>
                        <td><input type="date" name="dob" value="" /></td>
                    </tr>
                    <tr>
                        <td>Select Gender</td>
                        <td><select name="g">
                                <option  value="M">Male</option>
                                <option value="F">Female</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Select Location</td>
                        <td><select name="l">
                                <option>HYD</option>
                                <option>DELHI</option>
                                <option>BANGOLORE</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Enter Phone NUmber</td>
                        <td><input type="text" name="p" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Sign Up Here" /></td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        
        
        
    </body>
</html>
