<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
					class="icon-home"></i>Employee List</a>
			</div>
		</div>
		<hr>
		<div class="container-fluid">
			<form action="listemployee.jsp">
				<label><b>Employee Id</b></label>
				<input name="employeeid" type="text" class="form-control" placeholder="EmployeeId" required/>
				<label><b>Employee Name</b></label>
				<input name="employeename" type="text" placeholder="Enter your employee name here"/>
				<label><b>Employee Address</b></label>
				<input name="empolyeeaddress" type="text" placeholder="Enter your employee address" />
				<label><b>Phone No.</b></label> 
				<input name="employeephoneno" type="text" placeholder="Enter your employee phone number" />
				<br>
				<button class="btn btn-primary" type="submit">Submit</button>
			</form>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>
</body>
</html>