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

	<!-- Main-container-part -->
	<div class="Container">
		<h1>Inventory List</h1>
		<form class="navbar-form navbar-right" role="search" method="get"
			action="#">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
				<button type="submit" class="btn btn-success">
					<span class="icon-search"></span>GO
				</button>
			</div>
			<button class="btn btn-primary pull-right">Add New Stock</button>
		</form>

		<table class="table table-responsive " border=1>
			<tr>
				<td>S.No</td>
				<td>Item Code</td>
				<td>Item Name</td>
				<td>Purchased By</td>
				<td>Purchase From</td>
				<td>Purchase Date</td>
				<td>Purchase Time</td>
				<td>Stock</td>
				<td>Price</td>
				<td>Action?</td>

			</tr>
			<tr>
				<td>1</td>
				<td>ITM-101</td>
				<td>Chalk</td>
				<td>Kathford College</td>
				<td>Satyal Accessories</td>
				<td>17/05/2017</td>
				<td>07:09</td>
				<td>50</td>
				<td>500</td>
				<td><a href="Issueto.html" class="btn btn-primary"><span
						class="icon-bookmark"></span> Issue to</a> <a href="#"
					class="btn btn-success"><span class="icon-book"></span>
						Purchase</a></td>
			</tr>

		</table>
	</div>




	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
