package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.AttendenceDAO;
import com.sms.DAOImpl.AttendenceDAOImpl;
import com.sms.Model.Attendence;
import com.sms.Service.AttendenceService;

public class AttendenceServiceImpl implements AttendenceService{
	private AttendenceDAO attendenceDAO = new AttendenceDAOImpl();

	@Override
	public void save(Attendence attendence) {
		attendenceDAO.save(attendence);

	}

	@Override
	public void delete(Attendence attendence) {
		attendenceDAO.delete(attendence);
	}

	@Override
	public void update(Attendence attendence) {
		attendenceDAO.update(attendence);
	}

	@Override
	public Attendence get(int id) {
		return attendenceDAO.get(id);
	}

	@Override
	public List<Attendence> list() {
		return attendenceDAO.list();
	}
}

