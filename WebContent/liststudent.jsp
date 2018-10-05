<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.sms.Model.Student"%>
<%@ page import="com.sms.Model.Student"%>
<%@ page import="com.sms.Service.StudentService"%>
<%@ page import="com.sms.ServiceImpl.StudentServiceImpl"%>

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
<link rel="stylesheet" href="assets/fontawesome/css/all.css" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
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
			<h3>List Student</h3>
			<form class="navbar-form navbar-right" role="search">

				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
					<button type="submit" class="btn-success">
						GO<span class="icon-search"></span>
					</button>
				</div>
				<a href="addstudent.jsp" class="btn btn-success pull-right">Add
					Student</a>
			</form>
		</div>
		<%	
	StudentService studentService=new StudentServiceImpl();
	List<Student> allStudent=studentService.list();
	for(Student student:allStudent){
		if(student.getStatus()==1){
	
	%>
		<div class="container">
			<br>
			<table class="table table-hover" border=1>

				<tr>
					
					<th>Student Name</th>
					<th>Father Name</th>
					<th>Mother Name</th>
					<th>Address</th>
					<th>Phone Number</th>
					<th>Action</th>
				</tr>

				<tr>
					
					<td><%=student.getStudentName() %></td>
					<td><%=student.getFatherName()%></td>
					<td><%=student.getMotherName()%></td>
					<td><%=student.getStudentAddress()%></td>
					<td><%=student.getStudentPhoneNo()%></td>

					<td><a href="EditStudent.jsp?id=<%=student.getStudentId() %>"
						class="btn btn-primary"><span class="icon-edit"></span> Edit</a> <a
						href="deleteStudent.jsp?id=<%=student.getStudentId()%>" class="btn btn-danger"><span
							class="icon-trash"></span> Delete</a> <a href="#"
						class="btn btn-success"><span class="icon-user"></span> View
							Information</a></td>
				</tr>

			</table>
			<%} }%>
		</div>


	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>
