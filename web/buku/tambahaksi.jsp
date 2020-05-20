<%-- 
    Document   : tambahaksi
    Created on : May 05, 2019, 4:25:29 PM
    Author     : Almaas
    Correct by : Danboru
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String a=request.getParameter("id_buku");
String b=request.getParameter("judul_buku");
String c=request.getParameter("bahasa_buku");
String d=request.getParameter("jenis_buku");
String e=request.getParameter("nama_penerbit");
String f=request.getParameter("nama_pengarang");
String g=request.getParameter("stok");
//membuat variabel untuk nampung alamat untuk akses database nantinya.
String url="jdbc:mysql://localhost:3306/perpustakaan";
//membuat koneksi ke database dengan jdbc
Connection conn=null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
int updateQuery=0;

         try{
        conn=DriverManager.getConnection(url,"root","");
        String query="Insert into buku(id_buku,judul_buku,bahasa_buku,jenis_buku,nama_penerbit,nama_pengarang,stok) value(?,?,?,?,?,?,?)";
       ps=conn.prepareStatement(query);
       ps.setString(1,a);
       ps.setString(2,b);
       ps.setString(3,c);
       ps.setString(4,d);
       ps.setString(5,e);
       ps.setString(6,f);
       ps.setString(7,g);
        updateQuery=ps.executeUpdate();
        if(updateQuery!=0){
            out.println("<script>alert('Berhasil Menyimpan data')</script>");
            response.sendRedirect("list_buku.jsp");
        }
    }catch(Exception ex){
        out.println("Koneksi bermasalah");
        
 
    }finally{
        ps.close();
        conn.close();
    }


%>
