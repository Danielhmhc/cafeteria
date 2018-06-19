/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import bd.cConexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Daniel
 */
@WebServlet(name = "Agregarped", urlPatterns = {"/Agregarped"})
@MultipartConfig
public class Agregarped extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nom = request.getParameter("platillos"); //atrapa el usuario
            String antidad = request.getParameter("txtant");
           
            try{
                cConexion con=new cConexion();
                con.conectar();
               
                ResultSet r=con.consulta("call Obtcosto('"+nom+"');");
                
                
                if(r.first()){
                    float id= r.getFloat("costo");
                    if(id==-1){
                        response.sendRedirect("inicli.jsp?r=Algo ocurrio duante el pedido, vuelva a intentarlo");
                    }
                    else{
                        ArrayList<Pedido> Orden;
                        HttpSession sesion = request.getSession();
                        Orden=(ArrayList)sesion.getAttribute("Orden");
                        if(Orden== null){
                          Orden= new ArrayList<Pedido>();
                         
                        }
                        Pedido patual=new Pedido(nom,Integer.parseInt(antidad),Integer.parseInt(antidad)* id); 
                        Orden.add(patual);
                        sesion.setAttribute("Orden",Orden);
                        response.sendRedirect("inicli.jsp?r=Pedido Agregado exitosamente");
                    }
                }                
                else{
                    response.sendRedirect("inicli.jsp?r=Algo ocurrio duante el pedido, vuelva a intentarlo");
                }
            
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
    
