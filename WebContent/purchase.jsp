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
  
    <h2>Purchase Order</h2>
  <br/>
  <br/>
  <form method="get" action="BookAvailable.html">
  <table class="table">
        <tr>
          <td>Item Code</td>
          <td><input type="text" name="ItemCode" class="form-control" /></td>
        </tr>
        <tr>
          <td>Item Name</td>
          <td><input type="text" name="itemName" class="form-control" /></td>
        </tr>
        <tr>
        
          <td>Organization Name</td>
          <td><input type="text" name="orgName" class="form-control" /></td>
        </tr>
        <tr>
        
          <td>Suppliers Name</td>
          <td><input type="text" name="ProdName" class="form-control" /></td>
        </tr>
        
        <tr>
        
          <td>Account Number</td>
          <td><input type="text" name="depositAccount" class="form-control" /></td>
        </tr>
        
        <tr>
        <td>Category</td>
        <td>
        <select name="Category" class="form-control">
        <option>[choose]
          <option>Esewa</option>
          <option>VisaCard</option>
               <option>CreditCard</option>
        </select>
        </td>
        <tr>
          <td>Quantity</td>
          <td><input type="number" name="itemQuantity" class="form-control" /></td>
        </tr> 
          <td>Price</td>
          <td><input type="number" step=0.01 name="bookPrice" class="form-control" /></td>
        </tr>
        
        </tr>
          <td>&nbsp;</td>
          <td><a href="" class="btn btn-default">Clear</a> &nbsp; <input type="submit"
            value="Purchase" name="btnRegister" class="btn btn-primary" /></td>
        </tr>
      </table>

</form>
</div>



	<!--end-main-container-part-->

	<!-- including footer part -->
	<jsp:include page="footer.jsp" />
</body>
</html>
