package com.sms.DAO;

import java.util.List;

import com.sms.Model.SClass;

public interface SClassDAO {
	void save(SClass class1);
	void update(SClass class1);
	void delete(SClass class1);

	SClass get(int id);
	List<SClass> list(); 
}
