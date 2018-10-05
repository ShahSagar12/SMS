package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Student;
import com.sms.Service.StudentService;
import com.sms.ServiceImpl.StudentServiceImpl;


@WebServlet("/deleteStudent")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("delete.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ida=Integer.parseInt(request.getParameter("id"));
		StudentServiceImpl studentService=new StudentServiceImpl();
		Student students=studentService.get(ida);	
		Student student=new Student();
		student.setStudentId(students.getStudentId());
		student.setStudentName(students.getStudentName());
		student.setFatherName(students.getFatherName());
		student.setMotherName(students.getMotherName());
		student.setStudentAddress(students.getStudentAddress());
		student.setFatherName(students.getFatherName());
		student.setStudentPhoneNo(students.getStudentPhoneNo());		
		student.setStatus(0);
		
		studentService.update(student);	
		response.sendRedirect("listStudent.jsp");
	}

}
