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
	
			<!--  Main-container-part-->


			<h1>Subject</h1>
<form class="navbar-form navbar-right" role="search">

    <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
        <button type="submit" class="btn-success">GO<span class="icon-search"></span></button>
    </div>
    
    <br>
    <br>
    <a href="addsubject.jsp" class="btn btn-success pull-right">Add New Subject</a>
    <br>
</form>
<br>
<br/>
<table class="table table-responsive"border=1>
 <tr>
<td>SUB_ID</td> 
<td>Subject Name</td>
<td>Course</td>
<td>Teacher</td>
<td>Credit Hours</td>
<td>Description</td>
<td>Action</td>
</tr>
<tr>
        <td>CSC-109</td>
        <td>Java Programming</td>
        <td>BSC CSIT</td>
        <td>sudeep paudel</td>
        <td>6 hrs</td>
        <td>Concept about core and advance java</td>
        <td>
          <a href="#" class="btn btn-primary"><span class="icon-edit"></span> Edit</a> 
          <a href="#"  class="btn btn-danger"><span class="icon-trash"></span> Delete</a>
            <a href="#"  class="btn btn-success"><span class="icon-user"></span> View Information</a>
            
        </td>
      </tr>

</table>





			<!--end-main-container-part-->

			<!-- including footer part -->
			<jsp:include page="footer.jsp" />
</body>
</html>
