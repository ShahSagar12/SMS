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
    <h1>
      <b>Result Calculation</b>
    </h1>
    <div class="col-md-12">
      <table class="table table-responsive">
        <tr>
          <td>Enter Marks in Math</td>
          <td><input type="number" name="marksMath"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in Social</td>
          <td><input type="number" name="marksSocial"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in Computer</td>
          <td><input type="number" name="marksComputer"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in Science</td>
          <td><input type="number" name="marksScience"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in English</td>
          <td><input type="number" name="marksEnglish"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in Nepali</td>
          <td><input type="number" name="marksNepali"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>

        <tr>
          <td>Enter Marks in Health and Science</td>
          <td><input type="number" name="marksHealthScience"
            placeholder="Enter Marks" class="form-control"></td>
        </tr>
      </table>

      <div class="col-md-12">
        <button class="btn-lg btn-primary pull-right" name="marksTotal">Calculate
          Result</button>
      </div>

    </div>
  </div>



	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
