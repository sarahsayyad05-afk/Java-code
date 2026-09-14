<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="AdminHeader.jsp" %>

<%@ include file="AdminSideBar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Car</title>
</head>

<body>



<form action=" <%= request.getContextPath() %>/InsertEx" method="post" >
<table align="center" cellpadding="8">

<tr>
<td>Car Name</td>
<td><input type="text" name="carname"></td>
</tr>

<tr>
<td>Company</td>
<td><input type="text" name="company"></td>
</tr>

<tr>
<td>Fuel Type</td>
<td>
<select name="fuel">
<option>Petrol</option>
<option>Diesel</option>
<option>CNG</option>
<option>Electric</option>
</select>
</td>
</tr>

<tr>
<td>Seats</td>
<td><input type="number" name="seats"></td>
</tr>

<tr>
<td>Price Per Day</td>
<td><input type="number" name="price"></td>
</tr>

<tr>
<td>Status</td>
<td>
<select name="status">
<option>Available</option>
<option>Booked</option>
</select>
</td>
</tr>

<tr>
<td>Image Path</td>
<td>
<input type="text" name="image"
placeholder="images/swift.jpg">
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Insert Car">
</td>
</tr>

</table>

</form>

</body>
<%@ include file="AdminFooter.jsp" %>
</html>