package com.sms.Service;

import java.util.List;

import com.sms.Model.Student;

public interface StudentService {
	public int save(Student student);
	public void delete(Student student);
	public void update(Student student);
	
	public Student get(int id);
	public List<Student> list();
	public List<Student> list(int id);
	

}
