<%-- 
    Document   : formulario
    Created on : 16/02/2019, 01:55:14 AM
    Author     : jif_c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <body>
    <header style="background-color:#33CC33; height: 50px;">
        <a href="Citas.html" style="color: white; margin-right: 8px; margin-left:90%;">Salir</a>
    </header>
    <div class="container" style="width:50%;margin-top:100px;"> 
        <form action="ingresar"> 
            <label for="name">Nombre</label>
            <input type="text" name="vo.nombre" id="tbname" value="" autocomplete="off">
            <label for="lastname">Apellido</label>
            <input type="text" name="vo.apellidos" id="tblastname" value="" autocomplete="off">
            <label for="edad">Edad:</label>
            <input type="text" name="vo.edad" id="tbedad" value="" autocomplete="off">
             <label for="correo">Correo eletr&oacute;nico:</label>
            <input type="email" name="vo.correo" id="tbCorreo" value="" autocomplete="off">
            <label for="Direccion">Direcci&oacute;n:</label>
            <input type="text" name="vo.dirrecion" id="tbdireccion" value="" autocomplete="off">
            <label for="user">Usuario:</label>
            <input type="text" name="vo.n_user" id="tbUser" value="" autocomplete="off">
            <label for="password">Constrase&ntilde;a:</label>
            <input type="password" name="vo.pass" id="tbpassword" value="" autocomplete="off">
            <input type="submit" class="ui-btn ui-btn-inline" value="Crear Usuario" style="background-color: #33CC33;margin-top:80px; width: 60px;">
        </form>
    </div>
</body>
</html>
