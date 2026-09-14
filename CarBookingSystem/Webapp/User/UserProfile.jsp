<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String user = (String) session.getAttribute("username");
    if (user == null) {
        response.sendRedirect(request.getContextPath()+"/User/UserLogin.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Style.css">
<%@ include file="Header.jsp" %>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/UserProfile.css">
</head>
<body>

<div class="content">
  <div class="profile-wrapper">

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/register",
        "root",
        "sarah@05");

    PreparedStatement ps = con.prepareStatement(
        "SELECT * FROM Customer where CUsername=?");
    ps.setString(1, user);

    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
%>
    <div class="card">
      <div class="avatar-ring">
        <img src="../images/admin.jpeg" alt="profile"
             onerror="this.style.display='none'; this.nextElementSibling.style.display='block';">
        <span style="display:none;">profile pic</span>
      </div>

      <div class="username">@<%= rs.getString("CUsername") %></div>

      <div class="info-list">
        <div class="row">
          <span class="label">Customername</span>
          <span class="value"><%= rs.getString("CName") %></span>
        </div>
        <div class="row">
          <span class="label">Phone number</span>
          <span class="value"><%= rs.getInt("CMobileNo") %></span>
        </div>
        <div class="row">
          <span class="label">Email</span>
          <span class="value"><%= rs.getString("email") %></span>
        </div>
        <div class="row">
          <span class="label">Address</span>
          <span class="value"><%= rs.getString("City") %></span>
        </div>
      </div>

      <a class="logout-btn" href="<%=request.getContextPath()%>/User/UserLogout.jsp">Logout</a>
    </div>
<%
    }

    con.close();

} catch (Exception e) {
    out.println("<p style='color:red;text-align:center;'>Error loading profile: " + e.getMessage() + "</p>");
}
%>

  </div>
</div>

</body>
<%@ include file="Footer.jsp" %>
</html>
