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
<h2>Vehicles Route</h2>
  <div class="container">
    <form>
      <table class="table table-responsive">

        <tr>
          <td>Route<input type="file" name="fileRoute"
            required="required" class="form-control" /></td>
            <td>Total time<input type="Time" name="timeToDestination"
            required="required" class="form-control" /></td>
            <td>Time to Destination<input type="Time" name="timeToDestination"
            required="required" class="form-control" /></td>
        </tr>
      </table>
    </form>
  </div>

	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
