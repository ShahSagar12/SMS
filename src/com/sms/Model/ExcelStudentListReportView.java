package com.sms.Model;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelStudentListReportView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> Model, Workbook workBook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setHeader("content-disposition","attachement : filename=\"student_list.xls\"");

		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) Model.get("StudentList");

		Sheet sheet = workBook.createSheet("Student List");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Student ID");
		header.createCell(1).setCellValue("Student Name");
		header.createCell(2).setCellValue("Student Address");
		header.createCell(3).setCellValue("Father Name");

		int rowNum = 1;

		for(Student student : list) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(student.getStudentId());
			row.createCell(1).setCellValue(student.getStudentName());
			row.createCell(2).setCellValue(student.getStudentAddress());
			row.createCell(3).setCellValue(student.getFatherName());
		}
	}
}
