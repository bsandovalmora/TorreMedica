package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("\t<title>ADAPEX</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\n");
      out.write("\t crossorigin=\"anonymous\" />\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\" />\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"./css/main.css\" />\n");
      out.write("\t<link rel=\"icon\" href=\"./assets/images/fav.jpeg\">\n");
      out.write("</head>\n");
      out.write("<header></header>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"navbar-container\">\n");
      out.write("\t\t<nav id=\"menu\" class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\"><img id=\"logo\" src=\"./assets/images/logo/logo_200x55.png\" alt=\"\"></a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler hidden-lg-up\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavId\"\n");
      out.write("\t\t\t aria-controls=\"collapsibleNavId\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-ellipsis-v\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"collapsibleNavId\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-right navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\">Inicio <span class=\"sr-only\">(current)</span></a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"dropdownId\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Nuestros\n");
      out.write("\t\t\t\t\t\t\tproductos</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdownId\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"Productos\">Especialidades</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Minivegetales</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Procesados</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Hierbas aromáticas</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"dropdownId\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Conózcanos</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdownId\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">¿Quiénes somos?</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Proceso</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Distribuidores</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#services\">Rutas de reparto</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#contact-us\">Contacto</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"services\" class=\"jumbotron jumbotron-fluid main\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1 class=\"title display-1\">Fácil de preparar.</h1>\n");
      out.write("\t\t\t<h2 class=\"sub\">Los colores de los vegetales en tu cocina.</h2>\n");
      out.write("\t\t\t<!-- <p class=\"lead button-container\">\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary btn-lg\" href=\"#services\" role=\"button\"></a>\n");
      out.write("\t\t\t</p> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"card-container\">\n");
      out.write("\t\t<h1 class=\"title\">Productos</h1>\n");
      out.write("\t\t<div class=\"row card-group\">\n");
      out.write("\t\t\t<div class=\"col-xlg-3 col-lg-3 col-md-6 col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\"></div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"./assets/images/productos/minivegetales.jpg\" alt=\"Card image cap\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">Minivegetales</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Vegetales en porciones que no se pierden</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\"><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xlg-3  col-lg-3 col-md-6 col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\"></div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"./assets/images/productos/especial.jpg\" alt=\"Card image cap\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">Especialidades</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Vegetales que vienen de cosechas cuidadas como oro</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\"><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xlg-3  col-lg-3 col-md-6 col-sm-12\">\n");
      out.write("\t\t\t\t<dic class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\"></div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"./assets/images/productos/procesados.jpg\" alt=\"Card image cap\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">Procesados</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Productos listos para ser parte de tu próxima gran comida</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\"><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</dic>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xlg-3  col-lg-3 col-md-6 col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\"></div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\" src=\"./assets/images/productos/hierbas.jpg\" alt=\"Card image cap\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-title\">Hierbas aromáticas</h4>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text\">Dale a tu comida ese toque que nadie se espera</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\"><i class=\"fa fa-arrow-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"about-us\" class=\"container info-container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col col-12\">\n");
      out.write("\t\t\t\t<h1>¿Quienes somos?</h1>\n");
      out.write("\t\t\t\t<p> La Asociación de Desarrollo Agrícola para la Exportación ( ADAPEX ); una alternativa\n");
      out.write("\t\t\t\t\tde diversificación agrícola para la zona norte de Cartago. Hemos logrado altos estándares de <strong>calidad</strong>,\n");
      out.write("\t\t\t\t\tpreservando\n");
      out.write("\t\t\t\t\tsu <strong>sabor</strong>, buena <strong>presentación</strong> y <strong>frescura</strong></p>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Conoce más</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<footer>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col col-md-6 col-lg-4 col-sm-6\">\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"./assets/images/logo/logo_200x55_white.png\" alt=\"\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col col-md-6 col-lg-3 col-sm-6\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#about-us\">About us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#services\">Services</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact-us\">Contact us</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col col-md-12 col-sm-12 col-lg-5\">\n");
      out.write("\t\t\t\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d31447.633866113938!2d-83.94269899234695!3d9.854206898871597!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8fa0df1021af2921%3A0xb5e5548558a39c52!2sProvincia+de+Cartago%2C+Cartago!5e0!3m2!1ses-419!2scr!4v1548480350376\"\n");
      out.write("\t\t\t\t frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
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
