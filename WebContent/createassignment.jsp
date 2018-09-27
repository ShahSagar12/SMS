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
</head>
<body>

	<!--  Main-container-part-->
	<div class="container">
		<h2>Create Assignment For Student</h2>
		<form>
			<div class="form-group">
				<div class="col-md-12">
					<div class="form-group"></div>
					<div class="form-group">
						<label for="assignment_title">Assignment Title</label> <input
							type="text" class="form-control" name="assignment_title"
							placeholder="Assignment Title">
					</div>
					<div class="form-group">
						<label for="assignment_for">Assignment For</label> <select
							class="form-control">
							<option>BSC CSIT</option>
							<option>BIM</option>
							<option>BBA</option>
						</select>
					</div>
					<div class="form-group">
						<label for="semester">Semester</label> <select
							class="form-control">
							<option>1st</option>
							<option>2nd</option>
							<option>3rd</option>
							<option>4th</option>
							<option>5th</option>
							<option>6th</option>
							<option>7th</option>
							<option>8th</option>
						</select>
					</div>
					<div class="form-group">
						<label for="assignment_deadline">Assignment Deadline</label> <input
							type="date" class="form-control" name="assignment_deadline"
							placeholder="Assignment Deadline">
					</div>
					<div class="form-group">
						<label for="url">Upload Assignment File</label> <input type="file"
							class="form-control" name="upload_assignment" />
					</div>
					<div class="form-group">
						<a href="attendancelist.html" class="btn btn-primary">Submit</a>
					</div>
				</div>
			</div>
		</form>
	</div>



	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
