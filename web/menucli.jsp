<%-- 
    Document   : menucli
    Created on : 10/06/2018, 09:42:33 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MenuCliente</title>
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

        <link rel="stylesheet" href="css/estilomenicli.css">
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
            <div id="mySidenav" class="sidenav">
          <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
          <a href="#">About</a>
          <a href="#">Services</a>
          <a href="#">Clients</a>
          <a href="#">Contact</a>
        </div>

        <!-- Use any element to open the sidenav -->
        <span onclick="openNav()">open</span>

        <!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->
        <div id="main">
          ...
        </div>   
        </div>
       </div>
          
    </body>
    <script src="js/estilomenicli.js"></script>
</html>
