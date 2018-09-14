package com.sms.DAO;

import java.util.List;
import com.sms.Model.Attendence;


public interface AttendenceDAO {

	void save(Attendence attendence);
	void delete(Attendence attendence);
	void update(Attendence attendence);

	Attendence get(int id);
	List<Attendence> list();
}