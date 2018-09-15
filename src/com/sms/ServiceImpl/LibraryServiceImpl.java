package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.LibraryDAO;
import com.sms.DAOImpl.LibraryDAOImpl;
import com.sms.Model.Library;
import com.sms.Service.LibraryService;

public class LibraryServiceImpl implements LibraryService {
	
	LibraryDAO libraryDAO=new LibraryDAOImpl();
	@Override
	public void save(Library library) {
		
		libraryDAO.save(library);

	}

	@Override
	public void delete(Library library) {
		
		libraryDAO.delete(library);
	}

	@Override
	public void update(Library library) {
		
		libraryDAO.update(library);

	}

	@Override
	public List<Library> list() {
		
		return libraryDAO.list();
	}

	@Override
	public Library get(int id) {
		
		return libraryDAO.get(id);
	}

}
