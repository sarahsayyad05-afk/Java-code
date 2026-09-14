<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/UserLogin.css">
</head>
<body>
<form action="<%=request.getContextPath()%>/UserLogin" method="post" align="center">
 <h1> DriveEase </h1><hr>
     <h2> Log in</h2><hr>
      Enter Username<input type="text" name= "username"><br><br>
      Enter Password<input type="password" name="password"><br><br>
      <a href="<%=request.getContextPath()%>/User/CustomerRegister.jsp">Create Account?</u>  <input type="submit" value="Login">
        
</form>
	<%
if(request.getParameter("error") != null){
%>

<p style="color:red; text-align:center;">
Invalid Username or Password
</p>

<% 
}
		
		
%>
</body>
</html>