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
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<link href='css/googleapi.css' rel='stylesheet' type='text/css'>
<jsp:include page="header.jsp" />
<jsp:include page="sidebar.jsp" />
<jsp:include page="subheader.jsp" />
</head>
<body>

	<!--  Main-container-part-->

	<div class="Container">
		<h1>Issued List</h1>

		<div class="form-group">
			<input type="text" class="form-control" placeholder="Search">
		</div>
		<button type="submit" class="btn btn-success">
			<span class="icon-search"> GO</span>
		</button>
		<br> <br>
		<button class="btn btn-success pull-right">
			Book Issue</span>
		</button>
		<button class="btn btn-primary pull-right">Book Renew</button>
		<button class="btn btn-inverse pull-right">Return Book</button>
		<br> <br>


		<table class="table table-responsive " border=1>
			<tr>
				<td>S.No</td>
				<td>Member Code</td>
				<td>Book Code</td>
				<td>Book Name</td>
				<td>Publication</td>
				<td>Edition</td>
				<td>Issued By</td>
				<td>Issued On</td>
				<td>Due Date</td>
				<td>Category</td>
				<td>Remaining</td>
				<td>Action?</td>
			</tr>
			<tr>
				<td>1</td>
				<td>STU-101</td>
				<td>JAVA-1001</td>
				<td>Java Programming</td>
				<td>Oxford Publication</td>
				<td>Edition</td>
				<td>Kaushal Regmi</td>
				<td>17/05/2017</td>
				<td>22/05/2017</td>
				<td>Student</td>
				<td>5</td>
				<td><a href="Issue.html" class="btn btn-primary"><span
						class="icon-bookmark"></span> Extend</a><br> <a
					href="Return.html" class="btn btn-success"><span
						class="icon-book"></span> Return</a></td>
			</tr>

		</table>
	</div>

	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
