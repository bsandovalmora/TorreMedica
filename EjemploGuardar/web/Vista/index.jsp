<%-- 
    Document   : index
    Created on : 13-feb-2019, 10:57:50
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <h1>Guardar datos en una lista</h1>
        <form action="guardar">
            <input type="text" name="vo.nombre"/>
            <hr>
            <input type="submit" value="Guardar"/>
            <hr>
        </form>
        <form action="consultar">
            <input type="submit" value="Consultar"/>
        </form>
        <hr>
        <h1>Consulta</h1>
        <table>
            <s:iterator value="lista">
            <tr>
                <td><s:property value="id"></s:property></td>
                <td><s:property value="nombre"></s:property></td>
                
            </tr>
            </s:iterator>
        </table>
    </body>
</html>
