<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Admin Login</title>

<link rel="stylesheet" href="<%=request.getContextPath() %>/css/login.css">

</head>

<body>
<div class="login-container">


	

		<h1>DriveEase</h1>

		<h2>Admin Login</h2>

		<form action=" <%= request.getContextPath() %>/AdminLoginServlet" method="post">

			<label>Username</label> 
			<input type="text" name="username" placeholder="Enter Username" required> 
			
			<label>Password</label>
			<input type="password" name="password" placeholder="Enter Password" required> 
			<input type="submit" value="Login"class="login-btn">
			
		</form>
		<br>
		<%
if(request.getParameter("error") != null){
%>

<p style="color:red; text-align:center;">
Invalid Username or Password
</p>

<% 
}
		
		
%>

	</div>

</body>

</html>





