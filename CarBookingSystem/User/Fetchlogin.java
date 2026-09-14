package com.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/UserLogin")
public class Fetchlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String username=(String)request.getParameter("username");
		String pass=(String)request.getParameter("password");
		
	try {	Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con = DriverManager.getConnection
        		(
        		"jdbc:mysql://localhost:3306/register",
        		"root",
        		"sarah@05"
        		);
        
        String q="Select * from Customer where CUsername=? and Password=? ";
        PreparedStatement ps = con.prepareStatement(q);
        
        ps.setString(1, username);
        ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			HttpSession session= request.getSession();
			session.setAttribute("username", rs.getString("CUsername"));
			 response.sendRedirect(request.getContextPath() + "/Index.jsp");	
			 }
		else {
			response.sendRedirect(request.getContextPath() + "/User/UserLogin.jsp?error=1");	
		}
		
	}catch(Exception e) {
		out.println(e);
	}
		
		
	}

}
