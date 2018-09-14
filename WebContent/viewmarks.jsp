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
<jsp:include page="subheader.jsp" />
</head>
<body>

	<!-- Main-container-part -->
<div class="container">
    <form class="form-horizontal">

      <h1>
        <b>MARKS SHEET</b>
      </h1>

      <div class="container">
        <button class="btn btn-lg btn-primary pull-right"
          name="markDisplayButton">Display</button>
      </div>
    </form>
    <div class="col-sm-12">
      <form id="file_upload_form" method="post"
        enctype="multipart/form-data" action="upload.java">
        <div style="float: center">
          <br />
          <iframe id="upload" style="background-color: white;" width=100%
            height=100%></iframe>
        </div>
      </form>
    </div>
  </div>



	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
