package com.sms.DAO;

import java.util.List;

import com.sms.Model.Library;
import com.sms.Model.TimeTable;

public interface TimeTableDAO {
	public void save(TimeTable timeTable);
	public void delete(TimeTable timeTable);
	public void update(TimeTable timeTable);
	
	public TimeTable get(int id);
	public List<TimeTable> list();

}