package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Staff;
import com.sms.Model.StaffAccount;

/**
 * Servlet implementation class StaffAccountController
 */
@WebServlet("")
public class StaffAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StaffAccountController() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("addemployee.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Staff staff=new Staff();
		
		StaffAccount staffAccount=new StaffAccount();
		
		staffAccount.setStaff_Salary(request.getParameter(""));
	}

}
