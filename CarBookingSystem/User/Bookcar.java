package com.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

/**
 * Servlet implementation class Bookcar
 */
@WebServlet("/Bookcar")
public class Bookcar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register",
		            "root",
		            "sarah@05");
		            
		  Statement s=con.createStatement();
        
		  String q1="CREATE TABLE if NOT EXISTS  CustomerInfo (cname VARCHAR(30), email VARCHAR(30),mobile INT,licenseno INT,carname VARCHAR(20),pickup_date DATE,return_date DATE,pickup_time TIME,gender VARCHAR(10),extraService VARCHAR(40), payment VARCHAR(30),address VARCHAR(50))";
		  s.executeUpdate(q1);
		  String cname =request.getParameter("cname");
		   String email =request.getParameter("email");
		    String mobile =request.getParameter("mobile");
		   String licenseno =request.getParameter("licenseno");
		   String carname =request.getParameter("carname");
		   String pickupDate =request.getParameter("pickup_date");
		  String returnDate =request.getParameter("return_date");
		   String pickupTime =request.getParameter("pickup_time");
		   String gender =request.getParameter("gender");
		  String payment =request.getParameter("payment");
		   String address =request.getParameter("address");
		   String[] extraServices = request.getParameterValues("extraService");
		   String extras = String.join(", ", extraServices);
		   
		   DateTimeFormatter d= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	       
	       
		   LocalDate pickupDate1 = LocalDate.parse(pickupDate,d);
		   LocalDate returnDate1 = LocalDate.parse(returnDate,d);
		  LocalTime pickupTime1 = LocalTime.parse(pickupTime,DateTimeFormatter.ofPattern("HH:mm"));
         Period p = Period.between(pickupDate1, returnDate1);
         
         
       
			String q2="Insert into CustomerInfo values (?,?,?,?,?,?,?,?,?,?,?,?)";
	        PreparedStatement ps=con.prepareStatement(q2);
	        ps.setString(1, cname);
	        ps.setString(2, email);
	        ps.setString(3, mobile);
	        ps.setString(4, licenseno);
	        ps.setString(5, carname);
	        ps.setDate(6, Date.valueOf(pickupDate1));
	        ps.setDate(7, Date.valueOf(returnDate1));
	        ps.setTime(8, Time.valueOf(pickupTime1));
	        ps.setString(9, gender);
	        ps.setString(10, extras);
	        ps.setString(11, payment);
	        ps.setString(12, address);

	    int i=    ps.executeUpdate();
	    if(i>0) 
	    {
	    	out.println("<h2 align= 'center' style='color:blue;' >Car Booked Succesfully</h2>");
	    	String q3="UPDATE cars SET status='Booked' WHERE car_name=?";			
	        PreparedStatement ps1=con.prepareStatement(q3);
	        ps1.setString(1, carname);        
	       int a= ps1.executeUpdate();
	       if(a>0) {
	    	   
	    	   request.setAttribute("customername",cname );
	    	   RequestDispatcher rd=request.getRequestDispatcher("/User/UserBill.jsp");
				rd.forward(request, response);

	       }
	    }
	    else {
	    	out.println("<h2 align= 'center' style='color:red;' >Car Booking Failed</h2>");
	    	RequestDispatcher rd=request.getRequestDispatcher("Bookcar.jsp");
			rd.include(request, response);
	    }
	        
	        
		            
		}catch(Exception e) {
			out.println(e);
		}
	}

}
