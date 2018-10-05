
package com.sms.Model;


import com.sms.Service.StudentService;
import com.sms.ServiceImpl.StudentServiceImpl;

public class TestClass {

	public static void main(String[] args) {
		Student student=new Student();
		StudentService studentService=new StudentServiceImpl();
		studentService.get(student.getStudentId());
		System.out.println("Success");
		
		
	}

}
