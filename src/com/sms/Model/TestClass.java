package com.sms.Model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sms.Service.LibraryService;
import com.sms.ServiceImpl.LibraryServiceImpl;

public class TestClass {

	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		LibraryService libraryService=new LibraryServiceImpl();
		Library library=new Library();
		library.setLibId(10);
		library.setBookName("The Leader");
		library.setIssuedDate(java.sql.Date.valueOf(date));
		library.setExpiryDate(java.sql.Date.valueOf("2019-12-12"));;
		
		library.setFine(100);
		library.setStatus(1);
		
		
		libraryService.save(library);
		

	}

}
