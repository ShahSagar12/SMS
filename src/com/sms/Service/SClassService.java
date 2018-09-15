package com.sms.Service;

import java.util.List;

import com.sms.Model.SClass;

public interface SClassService {
	void save(SClass class1);
	void update(SClass class1);
	void delete(SClass class1);

	SClass get(int id);
	List<SClass> list(); 
}
