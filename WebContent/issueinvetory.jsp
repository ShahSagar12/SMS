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
    <h1>Item Issue</h1>
    
  <form method="Post" action="IssueList.html">
  <table class="table table-responsive">
        <tr>
          <td>Issue to</td>
          <td>
          <select>
          <option>[Issue For]
                <option>science</option>
          <option>Management</option>
          <option>Computer</option>
              </option>
          </select>
            </td>
         </tr>
        <tr>
        <td>Item Code</td>
          <td><input type="text" name="bookCode" class="form-control" /></td>
        </tr>
        <tr>
          <td>Item Name</td>
          <td><input type="text" name="bookName" class="form-control" /></td>
        </tr>
        <tr>
          <td>Issued On</td>
          <td><input type="date" name="issuedOn" class="form-control" /></td>
        </tr>
        <tr>
        <td>Quantity</td>
                  <td><input type="number" name="issuedOn" class="form-control" /></td>
        </tr>         
          
        <tr>
        <td>&nbsp;</td>
          <td><a href="" class="btn btn-default">Clear</a> &nbsp; <input type="submit"
            value="Issue" name="btnRegister" class="btn btn-primary" /></td>
                </tr>
      </table>
        </form>
       </div>



	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
