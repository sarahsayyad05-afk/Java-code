<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
  <%@ include file="AdminHeader.jsp" %>
<%@ include file="AdminSideBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="5" cellspacing="0" align="center">

<tr>
    <th>Customer Name</th>
    <th>Mobile</th>
    <th>City</th>
    <th>Username</th>
</tr>
<%
try
{

Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con = DriverManager.getConnection
 		(
 		"jdbc:mysql://localhost:3306/register",
 		"root",
 		"sarah@05"
 		);
 
       String q1="select * from Customer";
      PreparedStatement ps1=con.prepareStatement(q1);
      ResultSet rs=   ps1.executeQuery();
     
      while(rs.next()){
  %>

  <tr>


  <td><%= rs.getString("CName") %></td>

  <td><%= rs.getInt("CMobileNo") %></td>

  <td><%= rs.getString("City") %></td>


  <td><%= rs.getString("CUsername") %></td>

  

  </tr>

  <%
      }

    
      con.close();

  }
  catch(Exception e){
      out.println(e);
  }
  %>

  </table>


  </body>
  <%@ include file="AdminFooter.jsp" %>
  </html>

</body>
</html>