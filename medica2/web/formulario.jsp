<%-- 
    Document   : formulario
    Created on : 16/02/2019, 01:55:14 AM
    Author     : jif_c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0,minimun-scale=1.0">
	<title>Usuario</title>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
   <body>
       
    <div class="container"> 
        <form action="ingresar" method="post"> 
            <label for="name">Nombre</label>
            <input type="text" name="vo.nombre" id="tbname" value="" autocomplete="off">
            <label for="lastname">Apellido</label>
            <input type="text" name="vo.apellidos" id="tblastname" value="" autocomplete="off">
            <label for="edad">Edad:</label>
            <input type="text" name="vo.edad" id="tbedad" value="" autocomplete="off">
             <label for="correo">Correo eletr&oacute;nico:</label>
            <input type="email" name="vo.correo" id="tbCorreo" value="" autocomplete="off">
            <label for="Direccion">Direcci&oacute;n:</label>
            <input type="text" name="vo.direccion" id="tbdireccion" value="" autocomplete="off">
            <label for="user">Usuario:</label>
            <input type="text" name="vo.n_user" id="tbUser" value="" autocomplete="off">
            <label for="password">Constrase&ntilde;a:</label>
            <input type="password" name="vo.pass" id="tbpassword" value="" autocomplete="off">
            <input type="submit" value="Guardar"/>
        </form>
    </div>
</body>
</html>
