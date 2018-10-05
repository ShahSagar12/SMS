<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="com.sms.Model.Staff" %>
<%@ page import="com.sms.Service.StaffService" %>
<%@ page import="com.sms.ServiceImpl.StaffServiceImpl" %>	
<!DOCTYPE html>
<html>
<head>
<title>Add Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link rel="stylesheet" href="assets/fontawesome/css/all.css" />
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="listemployee.jsp" title="Go to Employee List" class="tip-bottom"><i
					class="icon-home"></i>Edit Employee</a>
			</div>
		</div>
		<hr>
		<%
		int ida=Integer.parseInt(request.getParameter("id"));
		StaffService staffService=new StaffServiceImpl();
		Staff staff=staffService.get(ida);
		%>
		<div class="container-fluid">
			<form action="editStaff" method="post">
				
				<label><b>Employee Name</b></label>
				<input name="staffName" type="text" value="<%=staff.getStaffName()%>"/>
				<label><b>Address</b></label>
				<input name="staffAddress" type="text" value="<%=staff.getStaffAddress()%>"/>
				<label><b>Email Address</b></label>
				<input name="staffEmail" type="text" value="<%=staff.getStaffEmailAddress()%>"/>
				<label><b>Phone No.</b></label> 
				<input name="staffPhone" type="text" value="<%=staff.getStaffPhone()%>"/>
				<label><b>Post</b></label> 
				<input name="staffPost" type="text" value="<%=staff.getStaffPost()%>"/>
				<br>
				<button class="btn btn-primary" type="submit" >Edit</button>
				<button class="btn btn-danger" onclick="form.action='listemployee.jsp'">Cancel</button>
			</form>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>
</body>
</html>