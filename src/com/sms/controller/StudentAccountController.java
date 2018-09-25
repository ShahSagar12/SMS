package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Student;
import com.sms.Model.StudentAccount;


@WebServlet("/StudentAccount")
public class StudentAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentAccountController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("StudentAccount.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentAccount sA=new StudentAccount();
		Student student=new Student();
		student.setStudentName(request.getParameter(""));
		sA.setTotalFee(Integer.parseInt(request.getParameter("")));
		sA.setStudentAccNo(request.getParameter(""));
		
		
	
	
	}

}
