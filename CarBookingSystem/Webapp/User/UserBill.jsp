<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.time.*" %>
<%@ page import="java.time.temporal.ChronoUnit" %>
 <%@ page import="com.DbConnection" %>
  <% String user=(String)session.getAttribute("username");
   if(user==null){
	   response.sendRedirect(request.getContextPath() + "/User/UserLogin.jsp");
	   return;
   }
	   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Style.css">
<%@ include file="Header.jsp" %>
</head>

<body>



<h2> Booking Bill</h2>

<%
try{



	Connection con =DbConnection.getConnection();
String cusName=(String)request.getAttribute("customername");
PreparedStatement ps=con.prepareStatement(
"SELECT ci.* ,ca.price_per_day FROM cars ca JOIN CustomerInfo ci ON ca.car_name=ci.carname where cname=?");
ps.setString(1,cusName);


ResultSet rs=ps.executeQuery();

if(rs.next()){

String cname=rs.getString("cname");
String email=rs.getString("email");
String mobile=rs.getString("mobile");
String license=rs.getString("licenseno");
String car=rs.getString("carname");

Date pickup=rs.getDate("pickup_date");
Date ret=rs.getDate("return_date");

Time time=rs.getTime("pickup_time");

String gender=rs.getString("gender");
String extra=rs.getString("extraService");
String payment=rs.getString("payment");
String address=rs.getString("address");

double price=rs.getDouble("price_per_day");

LocalDate p=pickup.toLocalDate();
LocalDate r=ret.toLocalDate();

Period days = Period.between(p, r);
double totalAmount=0.0;
int due=days.getDays();
if(due<=0)
totalAmount=price;
else
totalAmount+=price*due;
%>

<table border="1" cellpadding="10">

<tr>
<th colspan="2">Booking Receipt</th>
</tr>

<tr>
<td>Customer Name</td>
<td><%=cname%></td>
</tr>

<tr>
<td>Email</td>
<td><%=email%></td>
</tr>

<tr>
<td>Mobile</td>
<td><%=mobile%></td>
</tr>

<tr>
<td>License No</td>
<td><%=license%></td>
</tr>

<tr>
<td>Car Name</td>
<td><%=car%></td>
</tr>

<tr>
<td>Pickup Date</td>
<td><%=pickup%></td>
</tr>

<tr>
<td>Return Date</td>
<td><%=ret%></td>
</tr>

<tr>
<td>Pickup Time</td>
<td><%=time%></td>
</tr>

<tr>
<td>Gender</td>
<td><%=gender%></td>
</tr>

<tr>
<td>Extra Services</td>
<td><%=extra%></td>
</tr>

<tr>
<td>Payment Method</td>
<td><%=payment%></td>
</tr>

<tr>
<td>Address</td>
<td><%=address%></td>
</tr>

<tr>
<td>Price Per Day</td>
<td>₹ <%=price%></td>
</tr>

<tr>
<td>Number of Days</td>
<td><%=due%></td>
</tr>

<tr>
<th>Total Amount</th>
<th>₹ <%=totalAmount%></th>
</tr>

</table>

<br>



<%
}

con.close();

}
catch(Exception e){

out.println(e);

}
%>


<%@ include file="Footer.jsp" %>
</body>
</html>