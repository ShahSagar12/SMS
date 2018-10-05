<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Student</title>
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
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="StudentList.jsp" title="Go to Student List" class="tip-bottom"><i
					class="icon-home"></i> Add Student</a>
			</div>
		</div>
		<hr>
		<br>
		<div class="container-fluid">
			<form action="register" method="post">
				<label><b>Student Id</b></label>
				<input name="studentid" type="text" class="form-control" placeholder="StudentID" required/>
				<label><b>Student Name</b></label>
				<input name="studentname" type="text" placeholder="Enter your name here." required/>
				<label><b>Student Address</b></label>
				<input name="studentaddress" type="text" placeholder="Enter your address here." required/>
				<label><b>Phone No.</b></label>
				<input name="studentphone" type="text" placeholder="Enter your phone number here." required/>
				<label><b>Father's Name</b></label>
				<input name="fathername" type="text" placeholder="Enter your father's name here." required/>
				<label><b>Mother's Name</b></label>
				<input name="mothername" type="text" placeholder="Enter your mother's name here." required/>
				<br>
				<button class="btn btn-primary" type="submit" >Submit</button>
		</form>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>



</body>
</html>