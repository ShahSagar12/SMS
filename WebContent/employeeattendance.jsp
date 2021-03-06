<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<a href="liststudent.jsp" title="Go to Student List"
					class="tip-bottom"><i class="icon-home"></i> Student List</a>
			</div>
		</div>
		<hr>

		<div class="container-fluid">
			<div class="container">
				<h3>Employee Attendance</h3>
			</div>
			<table class="table table-responsive" border=1>
				<thead>
					<tr>
						<th><b>ID</b></th>
						<th><b>First Name</b></th>
						<th><b>Last Name</b></th>
						<th><b>Total Working Days</b></th>
						<th><b>Total present days</b></th>
					</tr>
				</thead>
				<tr>
					<td>1.</td>
					<td>Sudeep</td>
					<td>Paudel</td>
					<td>30</td>
					<td>25</td>
				</tr>

			</table>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
