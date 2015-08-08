<%-- 
    Document   : ex
    Created on : Jul 30, 2015, 6:24:02 PM
    Author     : SattvaQ1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
 
<style>
    body{
        
            background-color: bisque;
        
    }
</style>
    
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Login Page</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="email">Enter email</label>  
  <div class="col-md-8">
  <input id="email" name="email" type="text" placeholder="sattvaq@gmail.com" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="psw">Password </label>
  <div class="col-md-8">
    <input id="psw" name="psw" type="password" placeholder="MInimum 6 digits" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Login</button>
  </div>
</div>

</fieldset>
</form>

        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>
