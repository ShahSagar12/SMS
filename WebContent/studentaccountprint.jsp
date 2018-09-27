<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Due Amount Calculation</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/fullcalendar.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<style type="text/css">
#print-content {
	width: 800px;
	padding: 10px;
	border: 2px solid black;
	margin: 25px;
}

#print {
	width: 800px;
	padding: 0px;
	margin: 0;
}

input[type=button] {
	background-color: grey;
	color: white;
	border: none;
	padding: 12px 30px;
	cursor: pointer;
	padding: 16px 32 px
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="studentaccount.jsp" title="Go to Student Account"
					class="tip-bottom"><i class="icon-user-md"></i>Student Account</a>
			</div>
		</div>

		<div class="container-fluid">
			<h3>Due Amount :</h3>

			<div id="print-content">
				<form>
					<h3 align="center">
						School Name<br> School Street Address<br> FEE RECEIPT
					</h3>
					<p align="right">
						<b>Date : </b>
					</p>
					<hr>
					<h5>
						<b> Receipt Number : </b>
					</h5>
					<hr>
					<div class="container">
						<label><b>Student ID : </b></label><br> <label><b>Student
								Name : </b></label><br> <label><b>Student Class : </b></label><br>
						<label><b>Total Fee : Rs</b></label><br> <label><b>Late
								Fee Charge : Rs</b></label><br> <label><b>Fee Received : Rs</b></label><br>
						<label><b>Due Amount : Rs</b></label><br>
					</div>
					<p align="right">
						<b>.........................</b><br> <b>Fee Received By :
							xyz</b>
					</p>
					<hr>
					<ul>
						<li><p>This receipt is the property of the school.</p></li>
						<li><p>The bill should not misused and if found please
								call the school.</p></li>
					</ul>
				</form>
			</div>

			<div id="print" align="right">
				<input type="button" onclick="printDiv('print-content')"
					value="Print Receipt" />
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

	<script type="text/javascript">
		function printDiv(divName) {
			var printContents = document.getElementById(divName).innerHTML;
			w = window.open();
			w.document.write(printContents);
			w.print();
			w.close();
		}
	</script>
</body>
</html>
