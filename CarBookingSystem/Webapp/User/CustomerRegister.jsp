<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/UserLogin.css">

</head>
<body>
<form action="<%=request.getContextPath()%>/CustomerRegister" method="post" align="center">
 <h1> DriveEase </h1><hr>
     <h2> Register Your Account</h2><hr>
Enter  Name<input type="text" name="cname" placeholder="enter name"><br>
Enter  Email<input type="email" name="email" placeholder="ex.abc@gmail.com"><br>
Enter  Mobile number<input type="text" name="mobnum" placeholder="enter mobilenum"><br>
Enter  City<input type="text" name="city" placeholder="enter city"><br>
Enter  UserName<input type="text" name="username" placeholder="enter username"><br>
Enter  Password<input type="password" name="password" placeholder="enter password"><br>
<input type="submit" value="  Save">
</form>
</body>
</html>