package com.sms.DAO;

import java.util.List;

import com.sms.Model.Student;

public interface StudentDAO {
	public void save(Student student);
	public void delete(Student student);
	public void update(Student student);
	
	public Student get(int id);
	public List<Student> list();

}
