package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menucli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MenuCliente</title>\n");
      out.write("        <style>\n");
      out.write("        body, html {\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .bg {\n");
      out.write("            /* The image used */\n");
      out.write("            background-image: url(\"img/background.jpg\");\n");
      out.write("\n");
      out.write("            /* Full height */\n");
      out.write("            height: 100%; \n");
      out.write("\n");
      out.write("            /* Center and scale the image nicely */\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        .bg .content {\n");
      out.write("            background: rgba(0, 0, 0, 0.5); /* Black background with transparency */\n");
      out.write("            color: #f1f1f1;\n");
      out.write("            margin: auto;\n");
      out.write("            width: 35%;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilomenicli.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg\">\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                  <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">CAFESCOM</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <img src=\"img/logo.png\"/><br>\n");
      out.write("            <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("          <a href=\"#\">About</a>\n");
      out.write("          <a href=\"#\">Services</a>\n");
      out.write("          <a href=\"#\">Clients</a>\n");
      out.write("          <a href=\"#\">Contact</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Use any element to open the sidenav -->\n");
      out.write("        <span onclick=\"openNav()\">open</span>\n");
      out.write("\n");
      out.write("        <!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->\n");
      out.write("        <div id=\"main\">\n");
      out.write("          ...\n");
      out.write("        </div>   \n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/estilomenicli.js\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
