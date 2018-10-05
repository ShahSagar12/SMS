<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.sms.Model.Student" %>
<%@ page import="com.sms.Model.Student" %>
<%@ page import="com.sms.Service.StudentService" %>
<%@ page import="com.sms.ServiceImpl.StudentServiceImpl" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting!!</title>
</head>
<body>
<% 
	int ida=Integer.parseInt(request.getParameter("id"));
	StudentServiceImpl studentService=new StudentServiceImpl();
	Student students=studentService.get(ida);	
	%>
<form method="post" action="deleteStudent?id=<%=ida%>">
<h3>Are you sure to delete the <a href="StudentInformation.jsp"><%=students.getStudentName()%></a> </h3>
<input type="submit" value="Yes" /> 
<input type="submit" value="No" onclick="form.action='liststudent.jsp'"/>
</form>
</body>
</html>