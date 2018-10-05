<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.sms.Model.Student" %>
<%@ page import="com.sms.Service.StudentService" %>
<%@ page import="com.sms.ServiceImpl.StudentServiceImpl" %>	
<!DOCTYPE html>
<html>
<head>
<title>Edit Student</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link rel="stylesheet" href="assets/fontawesome/css/all.css" />
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<% 
	int ida=Integer.parseInt(request.getParameter("id"));
	StudentServiceImpl studentService=new StudentServiceImpl();
	Student students=studentService.get(ida);
		
	
	%>
	
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="StudentList.jsp" title="Go to Student List" class="tip-bottom"><i
					class="icon-home"></i> Edit Student</a>
			</div>
		</div>
		<hr>
		<br>
		<div class="container-fluid">
			<form action="EditStudent" method="post">
				<label><b>Student Id</b></label>
				<input name="studentid" type="text" class="form-control"  value="<%=ida%>"/>
				<label><b>Student Name</b></label>
				<input name="studentname" type="text"  value="<%=students.getStudentName() %>" />
				<label><b>Student Address</b></label>
				<input name="studentaddress" type="text" value="<%=students.getStudentAddress() %>" />
				<label><b>Phone No.</b></label>
				<input name="studentphone" type="text" value="<%=students.getStudentPhoneNo() %>"  />
				<label><b>Father's Name</b></label>
				<input name="fathername" type="text"  value="<%=students.getFatherName() %>" />
				<label><b>Mother's Name</b></label>
				<input name="mothername" type="text"  value="<%=students.getMotherName() %>" />
				<br>
				<button class="btn btn-primary" type="submit" >EDIT</button>
				
				<button class="btn btn-primary" type="submit" onclick="form.action='liststudent.jsp'">Cancel</button>
		</form>
		
		</div>
	</div>
	<jsp:include page="footer.jsp"/>



</body>
</html>