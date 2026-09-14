<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CarBookingSystem</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Style.css">
 <%@ include file="User/Header.jsp" %>
 <hr>
</head>
<body>

 <h2 align="center">Welcome To Car Booking System</h2>
 <p>Welcome to our Car Booking System. We provide affordable,reliable, and comfortable cars for your business trips, family vacations, and daily travel needs</p>
 <div> <img src="images/car.jpeg" alt="Car" width="600" height="350"> 
 <img src="images/car2.jpeg" alt="Car" width="600" height="350">
  </div>
 <hr>
 
 <h2>Our Services</h2>
 <ul>
 
 <li> Self Drive Cars</li>
 <li> Luxury Cars</li>
 <li>Airport Pickup</li>
 <li> Corporate Booking</li>
 <li> Wedding Car Rental</li>
 <li>24 x 7 Cutomer Support</li>
 
 
 </ul>
<hr>


<h2>Featured Cars</h2>

<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th>Car</th>
        <th>Company</th>
        <th>Fuel</th>
        <th>Price / Day</th>
    </tr>

    <tr>
        <td>Swift</td>
        <td>Maruti</td>
        <td>Petrol</td>
        <td>₹1200</td>
    </tr>

    <tr>
        <td>Creta</td>
        <td>Hyundai</td>
        <td>Diesel</td>
        <td>₹2500</td>
    </tr>

    <tr>
        <td>Nexon</td>
        <td>Tata</td>
        <td>Petrol</td>
        <td>₹2000</td>
    </tr>
</table>

<hr>

<h2>Why Choose Us?</h2>

<ol>
    <li>Affordable Prices</li>
    <li>Well Maintained Cars</li>
    <li>Easy Booking Process</li>
    <li>Trusted by Thousands of Customers</li>
    <li>24 × 7 Customer Support</li>
</ol>

<hr>

<h2>Watch Our Promotional Video</h2>

<video width="600" height="300" controls>
    <source src="videos/cars1.mp4" type="video/mp4">
</video>

<hr>

<h3>Contact Information</h3>
<p><b>Email :</b> info@carbooking.com</p>
<p><b>Phone :</b> +91 9876543210</p>
<p><b>Address :</b> Pune, Maharashtra, India</p>

<hr>
 <%@ include file="User/Footer.jsp" %>
 


</body>
</html>