
<%@page import="com.sms.ServiceImpl.StudentServiceImpl"%>
<%@page import="com.sms.Service.StudentService"%>
<%@page import="com.sms.DAOImpl.StudentDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
			<form action="studentaccountprint.jsp" method="get">
				<div class="container">
					<h3>Student Account</h3>
					<label>Student ID : </label><input name="studentId" type="text"
						value="" class="form-control" /><br> <label>Student
						Name : </label><input name="studentName" type="text" value=""
						class="form-control" /><br> <label>Student Class : </label><input
						name="studentClass" type="text" value="" /><br> <Label>Total
						Fee Amount : </Label><input name="totalFee" type="number"
						disabled="disabled" value="" class="form-control" /><br> <label>Late
						Fee Charge : </label><input name="lateFee" type="number" value=" " /><br>
					<label>Payment Method : </label><select name="paymentMethod">
						<option value="Cash">Cash</option>
						<option value="Cheque">Cheque</option>
						<option value="Wire Transfer">Wire Transfer</option>
						<option value="Credit Card">Credit Card</option>
					</select><br> <label>Fee Received Amount: </label><input
						name="receivedFee" type="number" value="" /><br>
				</div>
				<button class="btn btn-primary" type="submit">Calculate Due
					Amount</button>
				&nbsp; &nbsp;
				<button class="btn btn-danger" type="reset">Reset</button>
			</form>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>