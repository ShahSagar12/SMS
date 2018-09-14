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
<jsp:include page="subheader.jsp"/>
</head>
<body>
	
			<!--  Main-container-part-->

<div class="container">
		<div class="col-sm-12">
			<h1>
				<b>FeedBack</b>
			</h1>
			<form class="form-horizontal">

				<div class="form-group form-group-sm">
					<label class="col-sm-1 control-label" for="formGroupInputSmall">Student
						ID</label>
					<div class="col-sm-1">
						<input class="form-control" type="number"
							id="formGroupInputStudentId">
					</div>
				</div>
				
				<div class="form-group form-group-sm">
					<label class="col-sm-1 control-label" for="formGroupInputSmall">Student
						Name</label>
					<div class="col-sm-3">
						<input class="form-control" type="text"
							id="formGroupInputStudentName">
					</div>
				</div>

				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						Faculty <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Administration</a></li>
						<li><a href="#">Teacher</a></li>
						<li><a href="#">Workers</a></li>
					</ul>

				</div>
				<hr />
				<div class="form-group">
					<textarea name="feedbackText"
						placeholder="Please give your Feedback Here " class="form-control"
						rows="5"></textarea>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-10 col-sm">
						<button type="submit" class="btn btn-success">Submit</button>
						&nbsp;&nbsp; <input type="submit" value="Back" name="btnBack"
							class="btn btn-primary" />
					</div>
				</div>
			</form>
		</div>
	</div>




			<!--end-main-container-part-->

			<!-- including footer part -->
			<jsp:include page="footer.jsp" />
</body>
</html>
