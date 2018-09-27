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
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<div id="content">

		<div id="content-header">
			<div id="breadcrumb">
				<a href="index.html" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a>
			</div>
		</div>

		<div class="container-fluid">
			<jsp:include page="quickactions.jsp"></jsp:include>
			<hr>
			<h2>Track Vehicle</h2>
			<div class="container">
				<form>
					<table class="table table-responsive">
						<tr>
							<td>Vehicle Location <input type="File" name=VehiclesImage
								required="required" class="form-control" /></td>
						</tr>
						<tr>
							<td>From : <input type="text" name="txtFrom"
								required="required" class="form-control" /></td>
							<td>To : <input type="text" name="txtTo" required="required"
								class="form-control" /></td>
						</tr>

					</table>
				</form>
			</div>
		</div>

	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
