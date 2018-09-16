package com.sms.Model;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelStaffListReportView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> Model, Workbook workBook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setHeader("content-disposition", "attachement : filename=\"Staff_List.xls\"");

		@SuppressWarnings("unchecked")
		List<Staff> list = (List<Staff>) Model.get("Staff List");

		Sheet sheet = workBook.createSheet("Staff_List");

		Row header = sheet.createRow(0);

		header.createCell(0).setCellValue("Staff ID");
		header.createCell(1).setCellValue("Staff Name");
		header.createCell(2).setCellValue("Staff Address");
		header.createCell(3).setCellValue("Staff Post");

		int rowNum = 1;

		for(Staff staff: list) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(staff.getStaffId());
			row.createCell(1).setCellValue(staff.getStaffName());
			row.createCell(2).setCellValue(staff.getStaffAddress());
			row.createCell(3).setCellValue(staff.getStaffPost());
		}
	}

}
