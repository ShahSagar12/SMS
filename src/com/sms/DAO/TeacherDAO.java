package com.sms.DAO;

import java.util.List;

import com.sms.Model.Teacher;

public interface TeacherDAO {
	public int save(Teacher teacher);
	public void delete(Teacher teacher);
	public void update(Teacher teacher);
	
	public Teacher get(int id);
	public List<Teacher> list();
	

}
