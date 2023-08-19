package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		//get test data from excel:
		Xls_Reader reader = new Xls_Reader("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");

		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println("Total number of columns present in RegTestData is ==== " + colCount);
		
		System.out.println(reader.getCellRowNum("RegTestData", "firstname", "John"));
		
	}

}
