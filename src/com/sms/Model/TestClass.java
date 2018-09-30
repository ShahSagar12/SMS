package com.sms.Model;


import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.Service.StudentService;
import com.sms.ServiceImpl.StudentServiceImpl;




public class TestClass {

	public static void main(String[] args) throws ParseException {
		Student student=new Student();
		student.setStudentId(12);
		student.setStudentName("sagar");
		student.setFatherName("KB");
		student.setMotherName("jds");
		
	
		student.setStudentPhoneNo("975498765");
		student.setStatus(1);
		StudentService studentService=new StudentServiceImpl();
		studentService.save(student);
		
		
	

		

	}

}
