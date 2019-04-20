<%-- 
    Document   : index
    Created on : 15/04/2019, 07:46:39 PM
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <h1>INICIAR SESION</h1>
        <hr>
        <form action="Iniciar" method="post" >
            Usuario: <input type="text" name="usuario" /> <br>
            Contraseña: <input type="password" name="contra" /> <br>
            <input type="submit" value="Entrar" />          
        </form>
        <br><br>
        ¿No tienes una cuenta?<a href="registro.jsp"> Registrarme</a>
       
    </body>
</html>
