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

	<!--  Main-container-part-->

	<h1>Notice Board</h1>
<form class="navbar-form navbar-right" role="search">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
        <td>&nbsp;</td>
    <button type="submit" class="btn btn-success"><span class="icon-search"></span>GO</button>
    </div>
    <br>
    <br>
    <button class="btn btn-primary pull-right">Post Notice</button>
    <br>
</form>
<br/>
<table class="table table-striped"border=1>
<thead>
 <tr>
<td>S.No</td> 
<td>Title</td>
<td>Posted By</td>
<td>Description</td>
<td>For</td>
<td>Action</td>
</tr>
</thead>
<tr>
        <td>1.</td>
        <td>School Will Resumed from 1st May</td>
        <td>Academic Coordinator</td>
        <td>This notice is to inform all student and teachers and staffs.</td>
        <td>Students,Teacher,Staffs</td>
        <td>
        <a href="Issue.html"  class="btn btn-success"><span class="icon-table"></span>View Full Notice</a>
          <a href="edit.html" class="btn btn-primary"><span class="icon-edit"></span> Edit</a> 
          <a href="delete.html"  class="btn btn-danger"><span class="icon-trash"></span> Delete</a>
            
            
        </td>
      </tr>

</table>
</div>
</div>

	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
