<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.sms.Model.Staff"%>
<%@ page import="com.sms.Service.StaffService"%>
<%@ page import="com.sms.ServiceImpl.StaffServiceImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting!!</title>
</head>
<body>
	<%
		int ida = Integer.parseInt(request.getParameter("id"));
		StaffService staffService = new StaffServiceImpl();
		Staff staff = staffService.get(ida);
	%>
	<form method="post" action="deleteStaff?id=<%=ida%>">
		<h3>
			Are you sure to delete the <a href="StudentInformation.jsp"><%=staff.getStaffName()%></a>
		</h3>
		<input type="submit" value="Yes" /> <input type="submit" value="No"
			onclick="form.action='liststudent.jsp'" />
	</form>
</body>
</html>