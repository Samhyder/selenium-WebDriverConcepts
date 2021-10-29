package com.hrms.practiseTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC_Excel_POI {
	public static void main(String []args) throws Exception{
		FileInputStream file = new FileInputStream("Z:\\SoftwareTesting\\Excel\\sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Sheet1");
		
		System.out.println(st.getSheetName());
		System.out.println(st.getLastRowNum());
		
		System.out.println("Before updating cell data " + st.getRow(2).getCell(1));
		//Writing the data to excel file
		XSSFCell cell = st.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		file.close();
		FileOutputStream fileOut  = new FileOutputStream("Z:\\SoftwareTesting\\Excel\\sample.xlsx");
		wb.write(fileOut);
		System.out.println("Updated data after writing in Excel" + st.getRow(2).getCell(1));
		fileOut.close();
		}
}
