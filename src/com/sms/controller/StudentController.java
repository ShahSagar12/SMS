package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.sms.Model.Student;

import com.sms.Service.StudentService;
import com.sms.ServiceImpl.StudentServiceImpl;



@WebServlet("/register")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("addStudent.Jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student=new Student();
		
		String id=request.getParameter("studentid");
		int ida=Integer.parseInt(id);
		
		student.setStudentId(ida);
		
		student.setStudentName(request.getParameter("studentname"));
		student.setFatherName(request.getParameter("fathername"));
		student.setMotherName(request.getParameter("mothername"));
		student.setStudentAddress(request.getParameter("studentaddress"));
		student.setStudentPhoneNo(request.getParameter("studentphone"));
		student.setStatus(1);
		StudentService studentService=new StudentServiceImpl();
		int save=studentService.save(student);
		
		
		if(save>0) {
			response.sendRedirect("SaveSuccessFull.jsp");
		}else {
			response.sendRedirect("ERROR.jsp?403");
		}
		
		
	}

}
