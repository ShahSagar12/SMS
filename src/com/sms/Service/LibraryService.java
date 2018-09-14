package com.sms.Service;

import java.util.List;

import com.sms.Model.Library;

public interface LibraryService {
	
	void save(Library library);
	void delete(Library library);
	void update(Library library);
	
	
	
	List<Library> list();
	Library get(int id);

}
