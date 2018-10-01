
package com.sms.Model;

import java.util.List;

import com.sms.Service.StudentService;
import com.sms.ServiceImpl.StudentServiceImpl;

public class TestClass {

	public static void main(String[] args) {
		
		StudentService studentService=new StudentServiceImpl();
		List<Student> allStudent=studentService.list();
		for(Student student:allStudent) {
			System.out.println("Id"+student.getStudentId());
			System.out.println(""+student.getStudentName());
			System.out.println(""+student.getFatherName());
			System.out.println(""+student.getMotherName());
			System.out.println(""+student.getStudentAddress());
			System.out.println(""+student.getStatus());
			
		}
	}

}
