<%-- 
    Document   : login
    Created on : 16/02/2019, 03:23:27 AM
    Author     : jif_c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    <script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="bootstrap/css/bootstrap.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <header style="background-color:#33CC33; height: 50px;">
    </header>
    <div class="container" style="width:50%;margin-top:100px; text-align:center;"> 
        <img src="1.jpg" alt="Smiley face" height="300" width="300">
        <form action="ingresar">
            <label for="user">Usuario:</label>
            <input type="text" name="user" id="tbUser" value="" autocomplete="off">
            <label for="password">Constrase&ntilde;a:</label>
            <input type="password" name="password" id="tbpassword" value="" autocomplete="off">
            <input type="submit" class="ui-btn ui-btn-inline" value="Ingresar" style="background-color: #33CC33;margin-top:80px; width: 60px;">
        </form>
    </div>
</body>
</html>
