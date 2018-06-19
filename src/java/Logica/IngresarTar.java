package Logica;

import bd.cConexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IngresarTar", urlPatterns = {"/IngresarTar"})
@MultipartConfig
public class IngresarTar extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String codigo=request.getParameter("codigo");       
        Pattern p=Pattern.compile("[A-Z]{4}[1-9]{4}efac[A-Za-z0-9]{2}ESCOM");        
        Matcher mat = p.matcher(codigo);
        cConexion con=new cConexion();
        con.conectar();        
        if(mat.matches()){
            try{
                String id=""+request.getSession().getAttribute("idusuario");                
                ResultSet r=con.consulta("SELECT * FROM usuario WHERE idusuario="+id);                
                r.next();
                float credito=r.getFloat("saldo");
                credito+=100;                
                con.actualizar("UPDATE usuario SET saldo="+credito+" where idusuario="+id);
                response.sendRedirect("IngresarTargeta.jsp?r=1");          
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
        }  
        else{            
            response.sendRedirect("IngresarTargeta.jsp?r=0");          
        }
        /*try (PrintWriter out = response.getWriter()) {            
        }*/
    }   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        processRequest(request, response);
    }
    
}
