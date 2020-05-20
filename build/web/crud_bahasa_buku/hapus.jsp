
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
        String id=request.getParameter("d");
        int no=Integer.parseInt(id);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan", "root", "");
            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM bahasa_buku WHERE id_bahasa_buku = '"+no+"'");
            response.sendRedirect("bahasa_buku.jsp");
        } catch(Exception e){}
        %>
