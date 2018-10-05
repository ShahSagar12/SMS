package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.StudentDAO;
import com.sms.DAOImpl.StudentDAOImpl;
import com.sms.Model.Student;
import com.sms.Service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDAO studentDAO=new StudentDAOImpl();
	
	@Override
	public int save(Student student) {

		 return studentDAO.save(student);
	}

	@Override
	public void delete(Student student) {

		studentDAO.delete(student);
	}

	@Override
	public void update(Student student) {
		
		studentDAO.update(student);
	}

	@Override
	public Student get(int id) {
		
		return studentDAO.get(id);
	}

	@Override
	public List<Student> list() {
		
		return studentDAO.list();
	}

	@Override
	public List<Student> list(int id) {
		
		return studentDAO.list();
	}

	
	
	

}
