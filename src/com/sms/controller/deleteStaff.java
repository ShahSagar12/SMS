package com.sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Staff;
import com.sms.Service.StaffService;
import com.sms.ServiceImpl.StaffServiceImpl;


@WebServlet("/deleteStaff")
public class deleteStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("listemployee.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ida=Integer.parseInt(request.getParameter("id"));
		Staff staff=new Staff();
		
		StaffService staffService=new StaffServiceImpl();
		staff.setStaffId(ida);
		staff.setStaffName(request.getParameter("staffName"));
		staff.setStaffAddress(request.getParameter("staffAddress"));
		staff.setStaffEmailAddress(request.getParameter("staffEmail"));
		staff.setStaffPost(request.getParameter("staffPost"));
		staff.setStaffPhone(request.getParameter("staffPhone"));
		staff.setStatus(0);
		staffService.update(staff);		
		response.sendRedirect("SaveSuccessfull.jsp");
		
	}

}
