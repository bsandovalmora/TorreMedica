<%-- 
    Document   : consulta
    Created on : 13-feb-2019, 11:31:21
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar</title>
    </head>
    <body>
        <h1>Consulta!</h1>
        <table>
            <s:iterator value="lista">
            <tr>
                <td><s:property value="nombre"></s:property></td>
                <td><s:property value="correo"></s:property></td>
                <td><s:property value="telefono"></s:property></td>
            </tr>
            <hr>
            </s:iterator>
        </table>
    </body>
</html>
