package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class charts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Lumino - Charts</title>\n");
      out.write("\n");
      out.write("<link href=\"../assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"../assets/css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"../assets/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Icons-->\n");
      out.write("<script src=\"../assetes/js/lumino.glyphs.js\"></script>\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<script src=\"js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><span>Lumino</span>Admin</a>\n");
      out.write("\t\t\t\t<ul class=\"user-menu\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown pull-right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> User <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><svg class=\"glyph stroked gear\"><use xlink:href=\"#stroked-gear\"></use></svg> Settings</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><svg class=\"glyph stroked cancel\"><use xlink:href=\"#stroked-cancel\"></use></svg> Logout</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t</div><!-- /.container-fluid -->\n");
      out.write("\t</nav>\n");
      out.write("\t\t\n");
      out.write("\t<div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\t\t<form role=\"search\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<ul class=\"nav menu\">\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/indexlog.jsp\"><svg class=\"glyph stroked dashboard-dial\"><use xlink:href=\"#stroked-dashboard-dial\"></use></svg> Dashboard</a></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/widgets.jsp\"><svg class=\"glyph stroked calendar\"><use xlink:href=\"#stroked-calendar\"></use></svg> Widgets</a></li>\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/charts.jsp\"><svg class=\"glyph stroked line-graph\"><use xlink:href=\"#stroked-line-graph\"></use></svg> Charts</a></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/tables.jsp\"><svg class=\"glyph stroked table\"><use xlink:href=\"#stroked-table\"></use></svg> Tables</a></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/forms.jsp\"><svg class=\"glyph stroked pencil\"><use xlink:href=\"#stroked-pencil\"></use></svg> Forms</a></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/panels.jsp\"><svg class=\"glyph stroked app-window\"><use xlink:href=\"#stroked-app-window\"></use></svg> Alerts &amp; Panels</a></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index/icons.jsp\"><svg class=\"glyph stroked star\"><use xlink:href=\"#stroked-star\"></use></svg> Icons</a></li>\n");
      out.write("\t\t\t<li class=\"parent \">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span data-toggle=\"collapse\" href=\"#sub-item-1\"><svg class=\"glyph stroked chevron-down\"><use xlink:href=\"#stroked-chevron-down\"></use></svg></span> Dropdown \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"children collapse\" id=\"sub-item-1\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-right\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> Sub Item 1\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-right\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> Sub Item 2\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-right\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> Sub Item 3\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.jsp\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> Login Page</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t</div><!--/.sidebar-->\n");
      out.write("\t\t\n");
      out.write("\t<div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\t\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t<li><a href=\"#\"><svg class=\"glyph stroked home\"><use xlink:href=\"#stroked-home\"></use></svg></a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Icons</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Charts</h1>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Line Chart</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"canvas-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<canvas class=\"main-chart\" id=\"line-chart\" height=\"200\" width=\"600\"></canvas>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Bar Chart</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"canvas-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<canvas class=\"main-chart\" id=\"bar-chart\" height=\"200\" width=\"600\"></canvas>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Pie Chart</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"canvas-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<canvas class=\"chart\" id=\"pie-chart\" ></canvas>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Doughnut Chart</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"canvas-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<canvas class=\"chart\" id=\"doughnut-chart\" ></canvas>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-body easypiechart-panel\">\n");
      out.write("\t\t\t\t\t\t<h4>Label:</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"easypiechart\" id=\"easypiechart-blue\" data-percent=\"92\" ><span class=\"percent\">92%</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-body easypiechart-panel\">\n");
      out.write("\t\t\t\t\t\t<h4>Label:</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"easypiechart\" id=\"easypiechart-orange\" data-percent=\"65\" ><span class=\"percent\">65%</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-body easypiechart-panel\">\n");
      out.write("\t\t\t\t\t\t<h4>Label:</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"easypiechart\" id=\"easypiechart-teal\" data-percent=\"56\" ><span class=\"percent\">56%</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-body easypiechart-panel\">\n");
      out.write("\t\t\t\t\t\t<h4>Label:</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"easypiechart\" id=\"easypiechart-red\" data-percent=\"27\" ><span class=\"percent\">27%</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t</div>\t<!--/.main-->\n");
      out.write("\t  \n");
      out.write("\n");
      out.write("\t<script src=\"../assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/chart.min.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/chart-data.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/easypiechart-data.js\"></script>\n");
      out.write("\t<script src=\"../assets/js/bootstrap-datepicker.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t!function ($) {\n");
      out.write("\t\t    $(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){          \n");
      out.write("\t\t        $(this).find('em:first').toggleClass(\"glyphicon-minus\");      \n");
      out.write("\t\t    }); \n");
      out.write("\t\t    $(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("\t\t}(window.jQuery);\n");
      out.write("\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("\t\t})\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("\t\t})\n");
      out.write("\t</script>\t\n");
      out.write("</body>\n");
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
