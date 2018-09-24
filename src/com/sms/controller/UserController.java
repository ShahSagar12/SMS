package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.Role;
import com.sms.Model.User;
import com.sms.Service.UserService;
import com.sms.ServiceImpl.UserServiceImpl;


@WebServlet("/User")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public UserController() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("registration.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		Role role=new Role();
		role.setRoleName(request.getParameter(""));
		UserService userService=new UserServiceImpl();
		user.setUserName(request.getParameter(""));
		user.setUserPassword(request.getParameter(""));
		user.setRole(role);

		if(userService.save(user)!=0) {
			System.out.println("Saving Successful");
			response.sendRedirect("index.jsp");

		}else {
			response.sendRedirect("registration.jsp");	
		}
	}
}
