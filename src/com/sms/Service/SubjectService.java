package com.sms.Service;

import java.util.List;

import com.sms.Model.Subject;

public interface SubjectService {
	void save(Subject subject);
	void delete(Subject subject);
	void update(Subject subject);

	Subject get(int id);
	List<Subject> list();
}
