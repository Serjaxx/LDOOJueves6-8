<html>
    <head>	
        <link rel="stylesheet" type="text/css" href="estilos2.css">
    </head>
    <body>
        
        <h1>Usuario Registrado</h1>
        
        <b>Nombre(s):</b> <%=request.getParameter("nombre") %> <br><br>

        <b>Apellidos:</b> <%=request.getParameter("apellidos") %> <br><br>
        
        <b>Correo Electronico:</b> <%=request.getParameter("email") %> <br><br>
        
        <b>Contraseña:</b> <%=request.getParameter("contraseña") %> <br><br>
        
        <b>Fecha de nacimiento:</b> <%=request.getParameter("nacimiento") %> <br><br>
        
    </body>
</html>

