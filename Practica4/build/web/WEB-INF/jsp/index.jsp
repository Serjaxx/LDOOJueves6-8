<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/CSS/principal.css" />
        <meta charset=UTF-8" />
        <title>Formulario Practica 4</title>
    </head>
    <body>
	<h1>REGISTRO</h1>
	<form:form id="command" action="form.htm" method="post">
		<label for="nombre">Introduce tu Nombre(s):</label>
		<input type="text" placeholder="Escribe tu Nombre" name="nombre" id="nombre">
		<br><br>
		<label for="apellidos">Introduce tus Apellidos:</label>
		<input type="text" placeholder="Escribe tus apellidos" name="apellidos" id="apellidos">
		<br><br>
		<label for="email">Introduce tu Email:</label>
		<input type="email" placeholder="Escribe tu correo" name="email" id="email">
		<br><br>
		<label for="password">Introduce tu Contrase&ntilde;a:</label>
		<input type="password" placeholder="Escribe tu contrase&ntilde;a" name="contraseña" id="contraseña">
		<br><br>
		<label for="date">Introduce tu Fecha de nacimiento:</label>
		<input type="date" name="nacimiento" id="nacimiento">
		<br><br>
                <button type="submit" value="Submit">Enviar</button>
	</form:form>
    </body>
</html>
