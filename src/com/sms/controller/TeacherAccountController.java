package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Staff;
import com.sms.Model.Teacher;
import com.sms.Service.TeacherService;
import com.sms.ServiceImpl.TeacherServiceImpl;


@WebServlet("/TeacherAccount")
public class TeacherAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TeacherAccountController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("TeacherAccount.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Teacher teacher=new Teacher();
		Staff staff=new Staff();
		teacher.setTeacherPosition(request.getParameter(""));
		TeacherService teacherService=new TeacherServiceImpl();
		int i=teacherService.save(teacher);
		
		if(i>0) {
			response.sendRedirect("Index.jsp");
		}else {
			response.sendRedirect("TeacherAccount.jsp");
		}
		
	}

}
