
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Logica.Platillo"%>
<%@page import="Logica.Pedido"%>
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
            <div id="menu">
            <%  ArrayList <Platillo> menu= new ArrayList<Platillo>();
                
                try{
                cConexion con=new cConexion();
                con.conectar();
               
                ResultSet r=con.consulta("select * from platillo where disponible=1;");
                
                int i=0;
                while(r.next()){
                    menu.add(new Platillo());
                    menu.get(i).setNomplatillo(r.getString("nomplatillo"));
                    menu.get(i).setCosto(r.getFloat("costo"));
                    i++;
                 }
                 //STEP 6: Clean-up environment
                 r.close();
                 con.cerrarConexion();
            
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
             
            for(int i=0;i<menu.size();i++){
             %>
             
             <div class="Platillo" >
                 <h2>Nombre: <%= menu.get(i).getNomplatillo()%></h2>
                 <p>costo:<%= menu.get(i).getCosto()%> </p>    
             </div>
            <%}%>    
            </div>
            <form id="orden" action="Agregarped" method="post">
                <h1>Seleccione su pedido</h1>
                <label for="Platillo">Platillo :</label> <select name="platillos" onchange="cambcosto()">
                   <% for(int i=0;i<menu.size();i++){
                       
                   %>
                      <option value="<%=menu.get(i).getNomplatillo()%>" ><%=menu.get(i).getNomplatillo()%></option>
                   <%}%>    
                </select>
                <input name="txtant" placeholder="Ej: 1"/>
                <input id="btnagp" type="submit" value="Agregar Pedido" />
                
            </form>
                <div id="confirmar">
                    <% 
                        
                    ArrayList<Pedido> Orden;
                    HttpSession sesion = request.getSession();
                    Orden=(ArrayList)sesion.getAttribute("Orden");
                    int i=0;
                    if(Orden==null){
                        ;
                    }
                    else{
                        for(i=0;i<Orden.size();i++){
                        %>
                        <div class="pedido">
                            <label for="Platillop">Platillo: <%= Orden.get(i).getNombre()%></label>
                            <label for="antidad">Cantidad: <%= Orden.get(i).getCantidad()%> </label>
                            <label for="ostoT">Costo Total: <%= Orden.get(i).getCostot()%> </label>
                        </div>
                         <%    
                        }
                    }
                    

                    
                    %>
                    <form id="onfirmaro" action="RegistrarOrden" method="post">
                        <input type="submit" value="Realizar Orden"  />
                        
                    </form>
                </div>     
    </body>
    
</html>
