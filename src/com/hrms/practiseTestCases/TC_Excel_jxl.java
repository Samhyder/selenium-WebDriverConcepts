package com.hrms.practiseTestCases;

import java.io.FileInputStream;

//jxl jars are used for accessing excel sheets of older versions with
// .xls format (97-2003 ) 
import jxl.Sheet;
import jxl.Workbook;

public class TC_Excel_jxl {
	public static void main(String []args) throws Exception{
		FileInputStream file = new FileInputStream("Z:\\SoftwareTesting\\Excel\\Book1.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		
		int rowcount = st.getRows();
		System.out.println("no of rows " +rowcount);
		System.out.println("no of columns " +st.getColumns());
		for(int i = 1; i<rowcount; i++) {
		String empid = st.getCell(0,i).getContents();
		String name = st.getCell(1,i).getContents();
		String email = st.getCell(2,i).getContents();
		String no = st.getCell(3,i).getContents();
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
		}
	}
}
