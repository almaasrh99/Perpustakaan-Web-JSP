
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Perpustakaan Login</title>
  <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style>
  body{
    background-image: url("assets/img/a.png");

  }

  

  #background{
    background-image: url("assets/img/a.png");
    background-size: 100% 100%;
  }

    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 800px}

    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #ffbf80;
      height: 100%;
    }
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }

    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;}
    }
  </style>
</head>
<body>

  <div  class="container-fluid">
    <div class="row content">
      <div class="col-md-3 sidenav">
        <h4>perpustakaan</h4>
        <ul class="nav nav-pills nav-stacked">
          <li class="active"><a href="${pageContext.request.contextPath}/buku/list_buku.jsp">Home</a></li>
          <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Fitur
            <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="${pageContext.request.contextPath}/pencarian/index.jsp">Cari Buku</a></li>
              <li><a href="">Peminjaman</a></li>

            </ul>
            </li>

  <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#" >Buku
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/buku/list_buku.jsp">List Buku</a></li>
            <li><a href="${pageContext.request.contextPath}/pengarang/pengarang.jsp">Pengarang</a></li>
            <li><a href="${pageContext.request.contextPath}/crud_bahasa_buku/bahasa_buku.jsp">Bahasa Buku</a></li>
            <li><a href="${pageContext.request.contextPath}/penerbit/penerbit.jsp">Penerbit</a></li>
            <li><a href="${pageContext.request.contextPath}/jenis_buku/jenis_buku.jsp">Jenis Buku</a></li>
          </ul>
        </li>
        

<%
        if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
        %>
            Login dulu,biar afdol<br/>
            <% response.sendRedirect("index/index.jsp");%>
        <%} else {
        %>
        <br>
            Welcome <%=session.getAttribute("userid")%>
            <li><a href="../logout/logout.jsp"><span class="glyphicon glyphicon-log-out"> Logout</span></a></li>
      </ul><br>
        <%
        }
        %>
       
         
        

    </div>

      <div  class="col-sm-9">
      <div style='height:30px;'></div>
<div id="con">
           <div class="panel panel-primary">
        <div style="background: gold ; color:black"class ="panel-heading"><b><h1>Daftar Buku </b></h1></div>
        <div class="panel-footer"></div>
       <tr align="right"><td colspan="5"><a href="tambah.jsp">
<input type="button" class="btn btn-primary btn-md" value="+ Tambah " /></a></td>      
            <p></p>
            <%
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
            %>
           
            <table border="1" cellspacing="0" cellpadding="0" width="80%"><br>
                <table class="table table-bordered" "col-md-3">
	<thead>
                <tr style="background-color: #F0709D;">
                    <th>Id Buku</th>
                    <th>Judul Buku</th>
                    <th>Bahasa Buku</th>
                    <th>Jenis Buku</th>
                    <th>Penerbit Buku</th>
                    <th>Pengarang Buku</th>
                    <th>Stok</th>
                    <th widht="10%">Aksi</th>
                </tr>
        </thead>
                <%
                while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString("id_buku")%></td>
                    <td><%=rs.getString("judul_buku")%></td>
                    <td><%=rs.getString("bahasa_buku")%></td>
                    <td><%=rs.getString("jenis_buku")%></td>
                    <td><%=rs.getString("nama_penerbit")%></td>
                    <td><%=rs.getString("nama_pengarang")%></td>
                    <td><%=rs.getString("stok")%></td>
                    
                    <td><a href="edit.jsp?u=<%=rs.getString("id_buku")%>" ><input type="button" class="btn btn-primary btn-md" value="Edit " /></a> <br> - <br><a href="hapus.jsp?d=<%=rs.getString("id_buku")%>" ><input type="button" class="btn btn-warning btn-md" value="Hapus " /></a></td>
                </tr>
                <%   }    %>
            </table>
            <%
                rs.close();
                statement.close();
                connection.close();
            } catch (Exception ex) {
                out.println("Can't connect to database.");
            }
            %>
        </div>


    </div>
  </div>
</div>

<footer class="container-fluid">
  <p>Footer Text</p>
</footer>

</body>
</html>

