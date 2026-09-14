<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
  <%@ include file="AdminHeader.jsp" %>

<%@ include file="AdminSideBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content">
<div class="cards">
 
<%
try{

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/register",
    "root",
    "sarah@05");

    PreparedStatement ps=con.prepareStatement(
    "SELECT * FROM Admin");

    ResultSet rs=ps.executeQuery();

    while(rs.next()){
%>

<div class="card">
 <img src="../images/admin.jpeg" height ="100px"alt="profile">
 
  <h3><%= rs.getString("username") %></h3>
    <p><%= rs.getString("password") %></p>
    
    <a href=" <%= request.getContextPath() %>/Admin/LogoutServlet.jsp" class="btn btn-primary">Logout</a>
</div>


<%
    }

  
    con.close();

}
catch(Exception e)
{
    out.println(e);
}
%>


</div>
</div>

</body>
<%@ include file="AdminFooter.jsp" %>
</html>