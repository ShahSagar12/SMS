package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.TeacherDAO;
import com.sms.DAOImpl.TeacherDAOImpl;
import com.sms.Model.Teacher;
import com.sms.Service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	TeacherDAO teacherDAO=new TeacherDAOImpl();
	@Override
	public int save(Teacher teacher) {
		
		return teacherDAO.save(teacher);
		
	}

	@Override
	public void delete(Teacher teacher) {
		teacherDAO.delete(teacher);
		
	}

	@Override
	public void update(Teacher teacher) {
		teacherDAO.update(teacher);
		
	}

	@Override
	public Teacher get(int id) {
		
		return teacherDAO.get(id);
	}

	@Override
	public List<Teacher> list() {
		
		return teacherDAO.list();
	}

	
}
