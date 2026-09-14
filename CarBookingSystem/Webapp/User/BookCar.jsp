<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% String user=(String)session.getAttribute("username");
   if(user==null){
	   response.sendRedirect(request.getContextPath() +"/User/UserLogin.jsp");
	   return;
   }
	   %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Style.css">
<%@ include file="Header.jsp" %>

</head>
<body>




<form action="<%=request.getContextPath()%>/Bookcar" method="post">

<table align="center" cellpadding="8">

<tr>
<td>Customer Name</td>
<td><input type="text" name="cname" placeholder="Enter your name" required></td>
</tr>

<tr>
<td>Email</td>
<td><input type="email" name="email" placeholder="Enter your email" required></td>
</tr>

<tr>
<td>Mobile Number</td>
<td><input type="tel" name="mobile" placeholder="Enter mobile number" required></td>
</tr>

<tr>
<td>Driving License No.</td>
<td><input type="text" name="licenseno" placeholder="Enter license number" required></td>
</tr>

<tr>
<td>Select Car</td>
<td>
<select name="carname" >
<option value="Swift">Swift</option>
<option value="Creta">Creta</option>
<option value="Nexon">Nexon</option>
<option value="City">City</option>
<option value="Scorpio">Scorpio</option>
</select>
</td>
</tr>

<tr>
<td>Pickup Date</td>
<td><input type="date" name="pickup_date" required></td>
</tr>

<tr>
<td>Return Date</td>
<td><input type="date" name="return_date" required></td>
</tr>

<tr>
<td>Pickup Time</td>
<td><input type="time" name="pickup_time" required></td>
</tr>

<tr>
<td>Gender</td>
<td>
<input type="radio" name="gender" value="Male"> Male
<input type="radio" name="gender" value="Female"> Female
</td>
</tr>

<tr>
<td>Extra Services</td>
<td>
<input type="checkbox" name="extraService" value="Driver"> Driver <br>
<input type="checkbox" name="extraService" value="GPS Navigation"> GPS Navigation <br>
<input type="checkbox" name="extraService" value="Child Seat"> Child Seat
</td>
</tr>

<tr>
<td>Payment Method</td>
<td>
<select name="payment">
<option  value="Cash">Cash</option>
<option value="CreditCard">Credit Card</option>
<option value="DebitCard">Debit Card</option>
<option value="UPI">UPI</option>
<option value="NetBanking">Net Banking</option>
</select>
</td>
</tr>

<tr>
<td>Address</td>
<td>
<textarea name="address" rows="4" cols="25"></textarea>
</td>
</tr>

<tr>
<td>Terms & Conditions</td>
<td>
<input type="checkbox" name="terms" required>
I accept all terms and conditions.
</td>
</tr>

<tr>
<td></td>
<td>
<input type="submit" value="Book Car">
<input type="reset" value="Clear">
</td>
</tr>

</table>

</form>
 <%@ include file="Footer.jsp" %>
 
</body>
</html>
