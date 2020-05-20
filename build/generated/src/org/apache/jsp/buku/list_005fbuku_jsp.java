package org.apache.jsp.buku;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class list_005fbuku_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Perpustakaan Login</title>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("  body{\n");
      out.write("    background-image: url(\"assets/perpus.jpg\");\n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("  #background{\n");
      out.write("    background-image: url(\"assets/perpus.jpg\");\n");
      out.write("    background-size: 100% 100%;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */\n");
      out.write("    .row.content {height: 800px}\n");
      out.write("\n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      background-color: #ffbf80;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    footer {\n");
      out.write("      background-color: #555;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("    @media screen and (max-width: 767px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height: auto;}\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div  class=\"container-fluid\">\n");
      out.write("    <div class=\"row content\">\n");
      out.write("      <div class=\"col-md-3 sidenav\">\n");
      out.write("        <h4>perpustakaan</h4>\n");
      out.write("        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("          <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">Home</a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Anggota\n");
      out.write("            <span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a href=\"\">Cari anggota</a></li>\n");
      out.write("              <li><a href=\"\">Peminjaman</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" >Buku\n");
      out.write("          <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/buku/list_buku.jsp\">List Buku</a></li>\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pengarang/pengarang.jsp\">Pengarang</a></li>\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/crud_bahasa_buku/bahasa_buku.jsp\">Bahasa Buku</a></li>\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/penerbit/penerbit.jsp\">Penerbit</a></li>\n");
      out.write("            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jenis_buku/jenis_buku.jsp\">Jenis Buku</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("          <li><a href=\"#\">Buku</a></li>\n");
      out.write("\n");

        if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
        
      out.write("\n");
      out.write("            Login dulu,biar afdol<br/>\n");
      out.write("            ");
 response.sendRedirect("index/index.jsp");
      out.write("\n");
      out.write("        ");
} else {
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("            Welcome ");
      out.print(session.getAttribute("userid"));
      out.write("\n");
      out.write("            <li><a href=\"../logout/logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"> Logout</span></a></li>\n");
      out.write("      </ul><br>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("       \n");
      out.write("         \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <div  class=\"col-sm-9\">\n");
      out.write("      <div style='height:30px;'></div>\n");
      out.write("<div id=\"con\">\n");
      out.write("            <h3 align=\"center\">Daftar Buku</h3>\n");
      out.write("            \n");
      out.write("            <p></p>\n");
      out.write("            ");

            try {
                String Host = "jdbc:mysql://localhost:3306/perpustakaan";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host, "root", "");
                statement = connection.createStatement();
                String Data = "select * from buku";
                rs = statement.executeQuery(Data);
            
      out.write("\n");
      out.write("            <a href=\"tambah.jsp\">Tambah</a><br>\n");
      out.write("            <table border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id Buku</th>\n");
      out.write("                    <th>Judul Buku</th>\n");
      out.write("                    <th>Bahasa Buku</th>\n");
      out.write("                    <th>Jenis Buku</th>\n");
      out.write("                    <th>Penerbit Buku</th>\n");
      out.write("                    <th>Pengarang Buku</th>\n");
      out.write("                    <th>Stok</th>\n");
      out.write("                    <th>Aksi</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("id_buku"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("judul_buku"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("bahasa_buku"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("jenis_buku"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("nama_penerbit"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("nama_pengarang"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("stok"));
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td><a href=\"edit.jsp?u=");
      out.print(rs.getString("id_buku"));
      out.write("\" >edit</a> / <a href=\"hapus.jsp?d=");
      out.print(rs.getString("id_buku"));
      out.write("\" > hapus</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
   }    
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");

                rs.close();
                statement.close();
                connection.close();
            } catch (Exception ex) {
                out.println("Can't connect to database.");
            }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid\">\n");
      out.write("  <p>Footer Text</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
