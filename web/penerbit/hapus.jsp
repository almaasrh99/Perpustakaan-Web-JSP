
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
            st.executeUpdate("DELETE FROM penerbit WHERE id_penerbit = '"+no+"'");
            response.sendRedirect("penerbit.jsp");
        } catch(Exception e){}
        %>
