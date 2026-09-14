<div class="sidebar">

    <h3>MENU</h3>

    <a href=" <%= request.getContextPath() %>/Admin/AdminDashboard.jsp"> <i class="fas fa-house"></i> Dashboard</a>

    <hr>

    <h3>Car Management</h3>

    <a href=" <%= request.getContextPath() %>/Admin/Insert.jsp"><i class="fas fa-plus"></i>  Add Car</a>

    <a href=" <%= request.getContextPath() %>/Admin/ViewCars.jsp"><i class="fas fa-car"></i>View Cars</a>

    <hr>

    <h3>Customer Management</h3>

    <a href=" <%= request.getContextPath() %>/Admin/ViewCustomersServlet.jsp"><i class="fas fa-users"></i> View Customers</a>

    <hr>

    <h3>Booking Management</h3>

    <a href=" <%= request.getContextPath() %>/Admin/ViewBookingsServlet.jsp"><i class="fas fa-calendar-check"></i>View Bookings</a>

    <hr>

  
    <h3>Account</h3>

    <a href=" <%= request.getContextPath() %>/Admin/AdminProfile.jsp"><i class="fas fa-user"></i> Profile</a>

    <a href=" <%= request.getContextPath() %>/Admin/LogoutServlet.jsp"><i class="fas fa-right-from-bracket"></i> Logout</a>

</div>