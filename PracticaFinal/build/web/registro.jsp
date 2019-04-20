<%-- 
    Document   : registro
    Created on : 16/04/2019, 05:52:56 PM
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO</title>
    </head>
    <body>
        <h1>REGISTRATE</h1>
        <hr>
        <form action="nuevousuario" method="post">
            Usuario: <input type="text" name="usuario" /> <br>
            Contraseña: <input type="password" name="pass" /> <br>
            ¿Que nivel eres? (1)Admin,(2) Normal o (3)Invitado(Introduce el numero): <input type="text" name="nivel" /> <br>
            <input type="submit" value="Registrarme" /> <br>
            
        </form>
    </body>
</html>
