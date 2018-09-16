package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.SubjectDAO;
import com.sms.DAOImpl.SubjectDAOImpl;
import com.sms.Model.Subject;
import com.sms.Service.SubjectService;

public class SubjectServiceImpl implements SubjectService{
	SubjectDAO subjectDAO = new SubjectDAOImpl();


	@Override
	public void save(Subject subject) {
		subjectDAO.save(subject);

	}

	@Override
	public void delete(Subject subject) {
		subjectDAO.delete(subject);

	}

	@Override
	public void update(Subject subject) {
		subjectDAO.update(subject);

	}

	@Override
	public Subject get(int id) {
		return subjectDAO.get(id);
	}

	@Override
	public List<Subject> list() {
		return subjectDAO.list();
	}
}