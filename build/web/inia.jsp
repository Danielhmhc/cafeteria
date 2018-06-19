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
        <style>
        body, html {
            height: 100%;
            margin: 0;
        }

        .bg {
            /* The image used */
            background-image: url("img/background.jpg");

            /* Full height */
            height: 100%; 

            /* Center and scale the image nicely */
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .bg .content {
            background: rgba(0, 0, 0, 0.5); /* Black background with transparency */
            color: #f1f1f1;
            margin: auto;
            width: 35%;
            padding: 20px;
        }
        </style>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body>
        <div class="bg">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <a class="navbar-brand" href="#">CAFESCOM</a>
                  </div>
                </div>
              </nav>
        <div class="content">
            <img src="img/logo.png"/><br>
            Administrador Entraste como <%= request.getSession().getAttribute("idusuario")%>      
        </div>
       </div>
    </body>
</html>