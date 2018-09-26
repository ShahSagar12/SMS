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

	<!--  Main-container-part-->

	<h1>Available Books</h1>
<form class="navbar-form navbar-right" role="search">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
        <td>&nbsp;</td>
    <button type="submit" class="btn btn-success"><span class="icon-search"></span>GO</button>
    </div>
    <br>
    <br>
    <button class="btn btn-primary pull-right">Request Book</button>
    <br>
</form>
<br/>
<br/>
<table class="table table-responsive"border=1>
<thead>
 <tr>
<td>S.No</td> 
<td>Accession_No</td>
<td>Title</td>
<td>Author</td>
<td>Publication</td>
<td>Edition</td>
<td>Category</td>
<td>Price</td>
<td>Remark</td>
<td>Action</td>
</tr>
</thead>
<tr>
        <td>1.</td>
        <td>JAVA-1001</td>
        <td>Java Programming</td>
        <td>Balaguru Swammy</td>
        <td>Oxford Publication</td>
        <td>5th</td>
        <td>Computer</td>
        <td>200</td>
        <td>Computer programming book</td>
        <td>
          <a href="edit.html" class="btn btn-primary"><span class="icon-edit"></span> Edit</a> 
          <a href="delete.html"  class="btn btn-danger"><span class="icon-trash"></span> Delete</a>
            <a href="Issue.html"  class="btn btn-success"><span class="icon-book"></span> Issue</a>
            
        </td>
      </tr>

</table>
</div>

	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
