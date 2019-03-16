<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Formulario Practica 4</title>
    </head>
    <body>       
        <h1>Usuario Registrado</h1>
        
        <b>Nombre(s):</b> <c:out value="${nombre}" /> <br><br>

        <b>Apellidos:</b> <c:out value="${apellidos}" /> <br><br>
        
        <b>Correo Electronico:</b> <c:out value="${email}" /> <br><br>
        
        <b>Contraseña:</b> <c:out value="${password}" /> <br><br>
        
        <b>Fecha de nacimiento:</b> <c:out value="${nacimiento}" /> <br><br>
        
    </body>
</html>
