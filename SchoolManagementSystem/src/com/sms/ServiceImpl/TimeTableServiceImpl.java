package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.TimeTableDAO;
import com.sms.DAOImpl.TimeTableDAOImpl;
import com.sms.Model.Library;
import com.sms.Model.TimeTable;
import com.sms.Service.TimeTableService;

public class TimeTableServiceImpl implements TimeTableService {
	
	TimeTableDAO timeTableDAO=new TimeTableDAOImpl();
	@Override
	public void save(TimeTable timeTable) {
		
		timeTableDAO.save(timeTable);
	}

	@Override
	public void delete(TimeTable timeTable) {
		
		timeTableDAO.delete(timeTable);
	}

	@Override
	public void update(TimeTable timeTable) {
		
		timeTableDAO.update(timeTable);
	}

	@Override
	public TimeTable get(int id) {
		
		return timeTableDAO.get(id);
	}

	@Override
	public List<TimeTable> list() {
		
		return timeTableDAO.list();
	}

}
