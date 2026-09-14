<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String user1=(String) session.getAttribute("username"); %>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/Style.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/Header.css">

<h1 style="text-align:center;">DriveEase</h1>
<hr>
     <div class="site-nav">
       <div class="nav-links">
       <a href="<%=request.getContextPath()%>/Index.jsp"> Home |</a>
       <a href="<%=request.getContextPath()%>/User/AvailableCars.jsp"> Available Cars |</a>
       <a href="<%=request.getContextPath()%>/User/BookCar.jsp"> Book Car |</a>
       <a href="<%=request.getContextPath()%>/User/Gallery.jsp"> Gallery |</a>
       <a href="<%=request.getContextPath()%>/User/AboutUs.jsp"> About Us |</a>
       <a href="<%=request.getContextPath()%>/User/ContactUs.jsp">Contact Us</a>
       </div>
       <%if (user1!=null){ %>
       <div class="nav-profile">
         <a class="nav-avatar" href="<%=request.getContextPath()%>/User/UserProfile.jsp">
           <img src="<%=request.getContextPath()%>../images/admin.jpeg" alt="profile"
                onerror="this.style.display='none'; this.nextElementSibling.style.display='flex';">
           <span class="nav-avatar-fallback" style="display:none;"><%= user1.substring(0,1).toUpperCase() %></span>
         </a>
         <a class="nav-profile-link" href="<%=request.getContextPath()%>/User/UserProfile.jsp">My Profile</a>
       </div>
        <p>Welcome, <b><%= user1 %></b></p>
       <%} %>
      
</div>
 <hr>
</head>