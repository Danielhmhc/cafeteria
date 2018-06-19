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
@WebServlet(name = "RegistrarOrden", urlPatterns = {"/RegistrarOrden"})
@MultipartConfig
public class RegistrarOrden extends HttpServlet {
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
            HttpSession sesion = request.getSession();
            ArrayList<Pedido> Orden= new ArrayList<Pedido>();
            Orden=(ArrayList)sesion.getAttribute("Orden");
           
            try{
                cConexion con=new cConexion();
                con.conectar();
                
                ResultSet r=con.consulta("call insertarOrden("+sesion.getAttribute("idusuario")+");");
                r.first();
                int norden=r.getInt("numorden");
                int i;
                for(i=0;i<Orden.size();i++){
                    r=con.consulta("insert into pedido values("+(norden)+","+ (i+1) +",(select idplatillo from platillo where nomplatillo= '" +Orden.get(i).getNombre()  + "'),"+Orden.get(i).getCantidad() +");");
                
                }
                
                ArrayList<Pedido> OrdenN= new ArrayList<Pedido>();
                sesion.setAttribute("Orden", OrdenN);
                response.sendRedirect("inicli.jsp?r=orden registrada corretamente");
             
            }catch(Exception e){
                
                System.out.println("Error : "+e.getMessage());
                response.sendRedirect("inicli.jsp?r=o");
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
    

