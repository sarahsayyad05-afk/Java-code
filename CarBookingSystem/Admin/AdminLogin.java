package com.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/AdminLoginServlet")

public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		
		    if(uname.equals("Admin05") && pass.equals("admin@1234"))
		    	
		    {   HttpSession session=request.getSession();
		        session.setAttribute("admin", uname);
		    
		        response.sendRedirect(request.getContextPath()+"/Admin/AdminDashboard.jsp");
		    }
		
		else {
			response.sendRedirect(request.getContextPath()+"/Admin/Login.jsp?error=1");
			
		}
	}

}
