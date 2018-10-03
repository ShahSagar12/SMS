<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.sms.Model.Staff" %>
<%@ page import="com.sms.Service.StaffService" %>
<%@ page import="com.sms.ServiceImpl.StaffServiceImpl" %>	
	
<!DOCTYPE html>
<html lang="en">
<head>
<title>MIS System</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/fullcalendar.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<link href='css/googleapi.css' rel='stylesheet' type='text/css'>
</head>
<body>
<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />

	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="index.html" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a>
			</div>
		</div>

		<div class="container-fluid">
			<hr />
			<h3>Employee List</h3>
			<form class="navbar-form navbar-right" role="search">

				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
					<button type="submit" class="btn-success">
						GO<span class="icon-search"></span>
					</button>
				</div>
				<a href="addemployee.jsp" class="btn btn-success pull-right">Add
					Staff</a>
			</form>
			<%	
			StaffService staffService=new StaffServiceImpl();
	List<Staff> allStaff=staffService.list();
	for(Staff staff:allStaff){
	%>
			
			<br>
			<table class="table table-hover" border=1>
				<thead>
					<tr>
						<td>Staff Id</td>
						<td>Staff Name</td>
						<td>Staff Post</td>
						<td>Staff Address</td>
						<td>Staff EmailAddress</td>
						<td>Staff Phone</td>
						<td>Action</td>
					</tr>
				</thead>
				<tr>
					<td><%=staff.getStaffId()%></td>
					<td><%=staff.getStaffName()%></td>
					<td><%=staff.getStaffPost()%></td>
					<td><%=staff.getStaffAddress() %></td>
					<td><%=staff.getStaffEmailAddress()%></td>
					<td><%=staff.getStaffPhone()%></td>
					<td><a href="#" class="btn btn-primary"><span
							class="icon-edit"></span> Edit</a> <a href="#" class="btn btn-danger"><span
							class="icon-trash"></span> Delete</a> <a href="#"
						class="btn btn-success"><span class="icon-user"></span> View
							Information</a></td>
				</tr>

			</table>

		</div>

	</div>
	<%} %>

	<jsp:include page="footer.jsp" />
</body>
</html>
