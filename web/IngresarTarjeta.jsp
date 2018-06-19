
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%--@page session='true' --%>
<%@page import="bd.cConexion"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Targeta</title>
        
    </head>
    <body>
        <nav id="nav">
            <ul>
              <li><a class="active" href="Juego">Realizar Pedido</a></li>
              <li><a href="Historial">Consultar estado Pedido</a></li>              
            </ul>
        </nav>
        <h2>Ingresar Tarjeta de Prepago</h2>
        <form action="IngresarTar" method="post">
            <input type="text" size="50" name="codigo" placeholder="Ingrese Codigo" required/> <br><br>            
            <input type="submit" name="ingresarTag" value="Ingresar"/>            
        </form>
        <%if(request.getParameter("r")!=null){
                int x=Integer.parseInt(request.getParameter("r"));
                if(x==0){%> 
                    <h4>Error al agregar</h4>
             <%  
                }
                else{%>
                    <h4>Se agrego credito a su cuenta</h4>
               <% }
            }%>
    </body>
</html>
