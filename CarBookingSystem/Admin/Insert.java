package com.Admin;

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
import java.sql.Statement;

@WebServlet("/InsertEx")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			
			PrintWriter out=response.getWriter();
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register",
		            "root",
		            "sarah@05");
		            
		            Statement s=con.createStatement();
		            response.setContentType("text/html");

		String cname=request.getParameter("carname");
		String company=request.getParameter("company");
		
		   String fuel=request.getParameter("fuel");
		
		int seats=Integer.parseInt(request.getParameter("seats"));
		
		int price=Integer.parseInt(request.getParameter("price"));
         String status=request.getParameter("status");
		
		String image=request.getParameter("image");
		
		String q1="insert into cars(image,car_name,company,fuel_type,seats,price_per_day,status) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(q1);
			ps.setString(1,image);
			ps.setString(2,cname);
			ps.setString(3,company);
			ps.setString(4,fuel);
			ps.setInt(5,seats);
			ps.setInt(6,price);
			ps.setString(7,status);


			int i=ps.executeUpdate();

			if(i>0){
			out.println("<h3>Car Inserted Successfully</h3>");
			
			}
			else{
			out.println("<h3>Insertion Failed</h3>");
			}

			con.close();
			}
			catch(Exception e){
				out.println(e);
			}
	}

}
