package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("  \t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0,minimun-scale=1.0\">\n");
      out.write("\t<title>Productos</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("\tfont-family: arial;\n");
      out.write("}\n");
      out.write(".colum1{\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-top: 1%;\n");
      out.write("\tborder: 1px solid #343a40;\n");
      out.write("\tborder-radius: 50px 20px;\n");
      out.write("\twidth: 20%;\n");
      out.write("\theight: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".colum1 p{\n");
      out.write("\tmargin-top: 5%;\n");
      out.write("\ttext-align: left;\n");
      out.write("\tmargin-left: 5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".foo{\n");
      out.write("\tmargin-top: 5%;\n");
      out.write("\tborder: 1 px;\n");
      out.write("\tpadding: 3%;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-family: arial;\n");
      out.write("\tbackground-color: #343a40;\n");
      out.write("\tfont-size: 0.9em;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img-rounded{\n");
      out.write("\tmargin-top: 2%;\n");
      out.write("\theight: auto;\n");
      out.write("\twidth: auto;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row h4{\n");
      out.write("\ttext-align: left;\n");
      out.write("\tcolor: white;\n");
      out.write("\tborder: 1px;\n");
      out.write("\tpadding: 8%;\n");
      out.write("\tbackground-color: #343a40;\n");
      out.write("\tborder-radius: 50px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 1200px){\n");
      out.write("\t.colum1{\n");
      out.write("\t\twidth:40%;\n");
      out.write("\t\tmargin-top: 3%\n");
      out.write("\t}\n");
      out.write(" \t\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 575px){\n");
      out.write("\t.colum1{\n");
      out.write("\t\tmargin-top: 40%;\n");
      out.write("\t}\n");
      out.write(" \t\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 550px){\n");
      out.write("\t.colum1{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t}\n");
      out.write(" \t\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark fixed-top\">\n");
      out.write("  \t\t<a class=\"navbar-brand\" href=\"#\"><img src=\"../img/logo_tienda_2361.png\" style=\"width: 40%; height: 10%\"></a>\n");
      out.write("  \t\t<ul class=\"navbar-nav\">\n");
      out.write("    \t\t<li class=\"nav-item\">\n");
      out.write("      \t\t\t<a class=\"nav-link\" href=\"#\">Productos</a>\n");
      out.write("    \t\t</li>\n");
      out.write("    \t\t<li class=\"nav-item\">\n");
      out.write("      \t\t\t<a class=\"nav-link\" href=\"#\">Distribudores</a>\n");
      out.write("    \t\t</li>\n");
      out.write("    \t\t<li class=\"nav-item\">\n");
      out.write("      \t\t\t<a class=\"nav-link\" href=\"#\">Rutas</a>\n");
      out.write("    \t\t</li>\n");
      out.write("    \t\t<li class=\"nav-item\">\n");
      out.write("      \t\t\t<a class=\"nav-link\" href=\"#\">¿Quienes somos?</a>\n");
      out.write("    \t\t</li>\n");
      out.write("    \t\t<li class=\"nav-item\">\n");
      out.write("      \t\t\t<a class=\"nav-link\" href=\"#\">Contactenos</a>\n");
      out.write("    \t\t</li>\n");
      out.write("  \t\t</ul>\n");
      out.write("\t</nav>\n");
      out.write("            \n");
      out.write("  \t\t<div class=\"container\">\n");
      out.write("  \t\t\t<h1 style=\"margin-top: 10%;\">Productos</h1>\n");
      out.write("  \t\t\t<div class=\"row\">\n");
      out.write("                            ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  \t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"foo\">\n");
      out.write("\t\t\t<footer >\n");
      out.write("\t\t\t\t<h2>Secciones</h2>\n");
      out.write("\t\t\t\t<nav style=\"margin-left: 5%;\">\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Inicio</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Distribudores</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Productos</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">¿Quienes somos?</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Terminos condiciones</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Contactenos</a></li>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("lista");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("  \t\t\t\t<div class=\"colum1\">\n");
        out.write("  \t\t\t\t\t<h4>");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</h4>\n");
        out.write("  \t\t\t\t\t<img src=\"../img/");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(".png\" class=\"img-rounded\" alt=\"\">\n");
        out.write("      \t\t\t\t<p>Valor: ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("      \t\t\t\t<hr>\n");
        out.write("      \t\t\t\t<a href=\"ver.html\" class=\"btn btn-info\" role=\"button\">Ver</a>\n");
        out.write("      \t\t\t\t<hr>\n");
        out.write("      \t\t\t\t\n");
        out.write("  \t\t\t\t</div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("nombre");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("img");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("valor");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }
}
