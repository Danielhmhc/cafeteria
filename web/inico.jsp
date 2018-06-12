<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page session='true' %>
<%@page contentType="text/html" pageEncoding="UTF-8" import="bd.cConexion"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Inicio</title>
        <!-- Como casi nunca tenemos internet en la escuela, mejor descargue bootstrap-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/styles.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
        <body style="background-color: #F2F2F2;">
            nero Entraste como <%= request.getSession().getAttribute("idUsuario")%>
    </body>
</html>