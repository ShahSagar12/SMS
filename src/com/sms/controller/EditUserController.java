package com.sms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Model.User;
import com.sms.Service.UserService;
import com.sms.ServiceImpl.UserServiceImpl;


@WebServlet("/EditUser")
public class EditUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditUserController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	User user=new User();
	UserService userService=new UserServiceImpl();
	user.setUserName(request.getParameter(""));
	user.setUserPassword(request.getParameter(""));
	userService.update(user);
	response.sendRedirect("");
	
		
	}

}
