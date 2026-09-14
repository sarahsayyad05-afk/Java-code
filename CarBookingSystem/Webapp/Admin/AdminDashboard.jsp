<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
 <%@ page import="com.DbConnection" %>
 

<%@ include file="AdminHeader.jsp" %>

<%@ include file="AdminSideBar.jsp" %>

<div class="content">

    <h2>Dashboard</h2>

    <p>
        Welcome to the DriveEase Administration Panel.
    </p>

    <div class="cards">

        <div class="card">
            <h3>Total Cars</h3>
              <%
            try
            {

        		Connection con=DbConnection.getConnection();       
        		           
                String q="SELECT count(*) FROM cars";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(q);
                if(rs.next()){
                	%><p> <%= rs.getInt(1) %> </p> 
                	<% 
                }
            }
            catch(Exception e)
            {
            	out.println(e);
            }
            %>
           
        </div>

        <div class="card">
            <h3>Available Cars</h3>
            
            <%
            try
            {
            	Connection con =DbConnection.getConnection();
                String q="SELECT count(*) FROM cars where status='Available'";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(q);
                if(rs.next())
                {
                	
                	%><p> <%= rs.getInt(1) %> </p> 
                	<% 
                }
            }
            catch(Exception e)
            {
            	out.println(e);
            }
            %>    
           
        </div>

        <div class="card">
            <h3>Booked Cars</h3>
           <%
            try
            {
            	Connection con =DbConnection.getConnection();

                String q="SELECT count(*) FROM cars where status='Booked'";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(q);
                if(rs.next()){
                	%><p> <%= rs.getInt(1) %> </p> 
                	<% 
                }
            }
            catch(Exception e)
            {
            	out.println(e);
            }
            %>
        </div>
    <div class="card">
            <h3>Total Customers</h3>
        <%
            try
            {
            	Connection con =DbConnection.getConnection();

                String q="SELECT count(*) FROM Customer";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(q);
                if(rs.next()){
                	%><p> <%= rs.getInt(1) %> </p> 
                	<% 
                }
            }
            catch(Exception e)
            {
            	out.println(e);
            }
            %>       
             </div>

        <div class="card">
            <h3>Total Bookings</h3>
            <%
            try
            {
            	Connection con =DbConnection.getConnection();

                String q="SELECT count(*) FROM cars where status='Booked'";
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(q);
                if(rs.next()){
                	%><p> <%= rs.getInt(1) %> </p> 
                	<% 
                }
            }
            catch(Exception e)
            {
            	out.println(e);
            }
            %>
        </div>

        <div class="card">
            <h3>Total Revenue</h3>
            <%
            
            try
            {
                Connection con = DbConnection.getConnection();
                String q = 
                		"SELECT sum(datediff(ci.return_date, ci.pickup_date) * c.price_per_day) AS total_revenue FROM CustomerInfo ci JOIN cars c ON ci.carname = c.car_name";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(q);
                if (rs.next())
                {
                    double revenue = rs.getDouble(1);
                    %><p>Rs. <%=  revenue %></p><%
                }
            }
            
        		    catch(Exception e){
        		        System.out.println(e);
        		    }
            %>
        </div>

    </div>

</div>

<%@ include file="AdminFooter.jsp" %>