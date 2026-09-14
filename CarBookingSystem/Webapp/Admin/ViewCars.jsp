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
<table border="1" cellpadding="10" cellspacing="0" align="center">

<tr>
    <th>Car Image</th>
    <th>Car Name</th>
    <th>Company</th>
    <th>Fuel Type</th>
    <th>Seats</th>
    <th>Price / Day</th>
    <th>Status</th>
</tr>

<%
try{

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/register",
    "root",
    "sarah@05");

    PreparedStatement ps=con.prepareStatement(
    "SELECT * FROM cars");

    ResultSet rs=ps.executeQuery();

    while(rs.next()){
%>

<tr>

<td>
<img src="<%= rs.getString("image") %>" width="150" height="90">
</td>

<td><%= rs.getString("car_name") %></td>

<td><%= rs.getString("company") %></td>

<td><%= rs.getString("fuel_type") %></td>

<td><%= rs.getInt("seats") %></td>

<td>₹<%= rs.getDouble("price_per_day") %></td>

<td><%= rs.getString("status") %></td>

</tr>

<%
    }

  
    con.close();

}
catch(Exception e){
    out.println(e);
}
%>

</table>


</body>
<%@ include file="AdminFooter.jsp" %>
</html>