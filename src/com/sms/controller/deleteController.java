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
		String id=request.getParameter("studentid");
		int ida=Integer.parseInt(id);	
		Student student=new Student();
		student.setStudentId(ida);		
		student.setStatus(0);
		StudentService studentService=new StudentServiceImpl();
		studentService.update(student);	
		response.sendRedirect("listStudent.jsp");
	}

}
