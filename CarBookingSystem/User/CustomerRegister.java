package com.User;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class CustomerRegister
 */
@WebServlet("/CustomerRegister")
public class CustomerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
		try
		{
			
		String cname = request.getParameter("cname");
		
		String mobnum = request.getParameter("mobnum");
		
		String city = request.getParameter("city");
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con = DriverManager.getConnection
         		(
         		"jdbc:mysql://localhost:3306/register",
         		"root",
         		"sarah@05"
         		);
         
         String q1="insert into Customer(CName,CMobileNo,City,CUsername,Password,email) values(?,?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(q1);
         
         ps.setString(1, cname);
         ps.setString(2, mobnum);
         ps.setString(3, city);
         ps.setString(4, username);
         ps.setString(5, password);
         ps.setString(6, email);
         int i = ps.executeUpdate();
         if(i>0) {
        	 response.sendRedirect(request.getContextPath() + "/User/UserLogin.jsp");
         }
         
		}
		catch(Exception e)
		{
			out.println(e.getMessage());
		}
		
	}

}
