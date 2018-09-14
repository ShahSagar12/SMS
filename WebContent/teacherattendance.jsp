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
	
			<!-- Main-container-part -->
<div class="container">
<h2>Teacher Attendance</h2>

<table class="table table-responsive">
<thead>
    <tr>
      <th><b>ID</b></th>
      <th><b>First Name</b></th>
      <th><b>Last Name</b></th>
      <th><b>Total Working Days</b></th>
    <th><b>Total present days</b></th>
    </tr>
  </thead>
<tr>
        <td>1.</td>
        <td>Sudeep</td>
        <td>Paudel</td>
        <td>30</td>
        <td>25</td>
</tr>
  
</table>
</div>

            

<!--end-main-container-part-->

			<!-- including footer part -->
			<jsp:include page="footer.jsp" />
</body>
</html>
