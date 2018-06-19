<%-- 
    Document   : Registro
    Created on : 30/11/2016, 08:57:51 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>

<html lang="en"> 
    <head>
        <title>Registro</title>
        <!-- Como casi nunca tenemos internet en la escuela, mejor descargue bootstrap-->
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
                  <ul class="nav navbar-nav">
                    <li class="active"><h3 style="color: #ffffff">Bienvenido al sistema de administracion de la cafeteria</h3></li>
                    
                  </ul>
                  <ul class="nav navbar-nav navbar-right">
                    <li><a href="#" class="btn btn-dark btn-lg" data-toggle="modal" data-target="#login-modal">Inicia Sesion</a></li>
                    <li><a href="Registro.jsp" class="btn btn-dark btn-lg">Registrate</a></li>
                  </ul>
                </div>
              </nav>
        <div class="content">
            <img src="img/logo.png"/><br>
                   <form method="post" action="Registro" enctype="multipart/form-data"> <!--no tiene cierre!!-->
                       <legend style="color:white">Registrate</legend>
                            <br/> <label for="user">Usuario</label>
                            <br/> <input type="text"  class="form-control" placeholder="Usuario" name="user" id="user" style="color:black" required/>
                            <br/> <label for="email">Correo</label>
                            <br/> <input type="email"  class="form-control" placeholder="e-mail" name="email" id="email" style="color:black" required/>
                            <br/> <label  for="password">Password</label>
                            <br/> <input type="password" class="form-control" placeholder="*****" name="password" id="password" style="color:black;" required/>
                            <br/> <br/> <input type="submit" class="btn btn-info" value="Regitrarse" style="float: left;"><br><br>
                                    
        </div>
    </div>
                      
                    </body>
                    </html>