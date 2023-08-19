package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("C:\\Users\\fatim\\eclipse-workspace\\Test1\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
			
			String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
			
			String email = reader.getCellData("RegTestData", "email", rowNum);
			
			String password = reader.getCellData("RegTestData", "password", rowNum);
			
			Object ob[] = {firstname, lastname, email, password};
			myData.add(ob);
		}
		
		return myData;
		
	}

}
