package com.sms.Model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestClass {

	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		

	}

}
