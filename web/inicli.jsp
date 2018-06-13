
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
        <link rel="stylesheet" href="css/estiloinicli.css">

    </head>
    <body style="background-color: #F2F2F2;">
        <nav id="nav">
            <ul>
              <li><a class="active" href="Juego">Realizar Pedido</a></li>
              <li><a href="Historial">Consultar estado Pedido</a></li>
            </ul>
        </nav>
            liente Entraste como <%= request.getSession().getAttribute("idusuario")%>
            <!--cargamos el menu disponible de alimentos -->
            <%    
                try{
                cConexion con=new cConexion();
                con.conectar();
               
                ResultSet r=con.consulta("select * from platillo where disponible=1;");
                
                while(r.next()){
                    //Retrieve by column name
                    int id  = r.getInt("id");
                    int age = r.getInt("age");
                    String first = r.getString("first");
                    String last = r.getString("last");

                    //Display values
                    System.out.print("ID: " + id);
                    System.out.print(", Age: " + age);
                    System.out.print(", First: " + first);
                    System.out.println(", Last: " + last);
                 }
                 //STEP 6: Clean-up environment
                 r.close();
                 con.cerrarConexion();
            
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
            %>
    </body>
</html>
