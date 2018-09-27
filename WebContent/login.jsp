<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/matrix-login.css" />
<link rel="stylesheet" href="assets/fontawesome/css/all.css" />
<link href='css/googleapi.css' rel='stylesheet' type='text/css'>

</head>
<body>
	<div id="loginbox">
		<form id="loginform" class="form-vertical" action="index.jsp">
			<div class="control-group normal_text">
				<h3>
					<img src="assets/img/logo.png" alt="Logo" />
				</h3>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lg"><i class="fas fa-user-secret"></i></span><input
							type="text" placeholder="Username" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="fas fa-key"></i></span><input
							type="password" placeholder="Password" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<span class="pull-left"><button type="submit"
						class="btn btn-success btn-lg">Login</button></span> <span
					class="pull-right">Lost password?<a href="#" id="to-recover">click
						here.</a></span>
			</div>
		</form>
		<form id="recoverform" action="#" class="form-vertical">
			<p class="normal_text">Enter your e-mail address below and we
				will send you instructions how to recover a password.</p>

			<div class="controls">
				<div class="main_input_box">
					<span class="add-on bg_lo"><i class="icon-envelope"></i></span><input
						type="text" placeholder="E-mail address" />
				</div>
			</div>

			<div class="form-actions">
				<span class="pull-left"><a href="#"
					class="flip-link btn btn-success" id="to-login">&laquo; Back to
						login</a></span> <span class="pull-right"><button class="btn btn-info">Recover
					</button></span>
			</div>
		</form>
	</div>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/matrix.login.js"></script>
</body>

</html>
