<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
String admin = (String)session.getAttribute("admin");

if(admin == null){
    response.sendRedirect("Login.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>DriveEase Admin Panel</title>

<link rel="stylesheet" href="<%=request.getContextPath() %>/css/admin.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css">

</head>

<body>

<header>

    <h1>DriveEase - Admin Dashboard</h1>

    <div class="admin-info">

        Welcome, <b><%=admin %></b>

    </div>

</header>

<div class="container">