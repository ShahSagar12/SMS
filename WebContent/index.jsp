<!DOCTYPE html>
<html lang="en">
<head>
<title>Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="assets/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="assets/css/fullcalendar.css" />
<link rel="stylesheet" href="assets/css/matrix-style.css" />
<link rel="stylesheet" href="assets/css/matrix-media.css" />
<link rel="stylesheet" href="assets/fontawesome/css/all.css" />
<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
<link
	href='assets/http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'
	rel='stylesheet' type='text/css'>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="sidebar.jsp"></jsp:include>

	<div id="content">

		<div id="content-header">
			<div id="breadcrumb">
				<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a>
			</div>
		</div>

		<div class="container-fluid">
			<jsp:include page="quickactions.jsp"></jsp:include>
			<hr />
			<jsp:include page="systemanalytics.jsp"></jsp:include>
		</div>

	</div>

	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
