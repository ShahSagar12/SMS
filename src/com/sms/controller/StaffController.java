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




@WebServlet("/addStaff")
public class StaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StaffController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("addteacher.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Staff staff=new Staff();
		StaffService staffService=new StaffServiceImpl();
		staff.setStaffName(request.getParameter("staffName"));
		staff.setStaffAddress(request.getParameter("staffAddress"));
		staff.setStaffEmailAddress(request.getParameter("staffEmail"));
		staff.setStaffPost(request.getParameter("staffPost"));
		staff.setStaffPhone(request.getParameter("staffPhone"));
		staff.setStatus(1);
		int i=staffService.save(staff);
		if(i>0) {
			response.sendRedirect("SaveSuccessfull.jsp");
		}else {
			response.sendRedirect("addemployee.jsp");
		}
		
		
	}

}
