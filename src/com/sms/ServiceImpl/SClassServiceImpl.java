package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.SClassDAO;
import com.sms.DAOImpl.SClassDAOImpl;
import com.sms.Model.SClass;
import com.sms.Service.SClassService;

public class SClassServiceImpl implements SClassService {
	private SClassDAO sClassDAO = new SClassDAOImpl();

	@Override
	public void save(SClass class1) {
		sClassDAO.save(class1);
	}

	@Override
	public void update(SClass class1) {
		sClassDAO.update(class1);
	}

	@Override
	public void delete(SClass class1) {
		sClassDAO.delete(class1);
	}

	@Override
	public SClass get(int id) {
		return sClassDAO.get(id);
	}

	@Override
	public List<SClass> list() {
		return sClassDAO.list();
	}

}
