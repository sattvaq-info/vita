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
        
        
         <link href='styleserror.css' rel='stylesheet'>
        <script src='nod.js'></script>
    </head>
    <body>
        <h1>Login Page</h1>
        
        <form action="LoginServlet" method="POST">
       
            <table border="0">
               
                <tbody>
                    <tr>
                        <td>Enter User Email is</td>
                        <td><input type="email" name="userid" value="" class="testclass emailtest"/></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="psw" value="" class="pswtest"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login Here" /></td>
                    </tr>
                </tbody>
            </table>

        
        </form>
        
        
        
        
        
        
        
        
         <script>
            // create an instance to work with by calling it.
            var myNod = nod();

            // Add a check to nod.
            myNod.add([{
                selector: '.emailtest',
                validate: 'email',
                errorMessage: 'Enter email foramt '
            }, {
                selector: '.pswtest',
                validate: 'min-length:3',
                errorMessage: 'Password Length must be minimum 3 letters'
            },
             {
                selector: '.pswtest',
                validate: 'integer',
                errorMessage: 'must be numbers'
            }
            
        
    
    ]
                    
            
            
            );
        </script>
        
    </body>
</html>
