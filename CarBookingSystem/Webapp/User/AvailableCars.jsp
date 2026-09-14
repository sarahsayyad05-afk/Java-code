<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Style.css">
<%@ include file="Header.jsp" %>
</head>

<body>

<h2 align="center">Available Cars</h2>

<p align="center">
Choose your favorite car from our collection.
</p>

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
    "SELECT * FROM cars WHERE status='Available'");

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

<td><a href="BookCar.jsp"><%= rs.getString("status") %></a></td>

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

<br><br>

<h2>Rental Information</h2>

<ul>
<li>Minimum booking period is 1 day.</li>
<li>Driving License is mandatory.</li>
<li>Fuel charges are not included.</li>
<li>Late return charges may apply.</li>
<li>Cars are available subject to confirmation.</li>
</ul>

<hr>

<div align="center">
<p><b>Email :</b> info@carbooking.com</p>

<p><b>Phone :</b> +91 9876543210</p>

<p><b>Address :</b> Pune, Maharashtra</p>
</div>

<hr>

<%@ include file="Footer.jsp" %>
</body>
</html>