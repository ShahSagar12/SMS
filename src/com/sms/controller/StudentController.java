package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Student;
import com.sms.Model.StudentAccount;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/Student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("addStudent.Jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student=new Student();
		student.setStudentName(request.getParameter(""));
		student.setFatherName(request.getParameter(""));
		student.setMotherName(request.getParameter(""));
		student.setStudentAddress(request.getParameter(""));
		student.setStudentPhoneNo(request.getParameter(""));
		StudentAccount studentAccount=new StudentAccount();
		studentAccount.setFeePayment(Integer.parseInt(request.getParameter("")));
		
	}

}
