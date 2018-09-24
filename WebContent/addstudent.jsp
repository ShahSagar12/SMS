<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration</title>
<link href="assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/bootstrap-responsive.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="assets/js/bootstrap.min.js">
	
</script>
<style>
.form {
	color: rgb(136, 126, 119);
	width: 100%;
	height: 100%;
	padding: 5%;
	align:center;
}
.table{
width:100%;
height: 100%;
	padding: 5%;


}
</style>
</head>
<body>

	<div class="container">
		<h1 align="center" style="color: blue;">
			<u>Registration</u>
		</h1>
	</div>
	<div class="container">
		<form action="register" method="post" id="form-1" class="form">
		<table class="content">
		<tr>
			
				<th>User Name</th> 
				<th><input type="text" placeholder="User Name" name="userName" class="container" class="responsive" style="width:50%;height:20px"/></th></tr>
				<tr><th>
				Password </th>
				<th>
				<input type="password" placeholder="User Password" name="userPassword" class="container" style="width:50%;height:20px"/></th></tr>
				<tr><th>
				<input	type="submit" value="Register" class="container" class="responsive"/></th></tr>
			
			</table>


		</form>
	</div>
</body>
</html>