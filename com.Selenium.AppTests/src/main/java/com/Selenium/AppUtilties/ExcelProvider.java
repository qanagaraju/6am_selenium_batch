package com.Selenium.AppUtilties;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider {

	public static XSSFWorkbook wb;
	
	public ExcelProvider() {
		
		File file = new File("./myFiles/login.xlsx");
		
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("File loaded successfully");
		}
		
	}
	
	
	public String getStringdata(int SheetIndex,int Rownum,int Column) {
		
		return wb.getSheetAt(SheetIndex).getRow(Rownum).getCell(Column).getStringCellValue();
		
		
	}
	
	public String getStringdata(String SheetName,int Rownum,int Column) {
		
		return wb.getSheet(SheetName).getRow(Rownum).getCell(Column).getStringCellValue();
		
	}
	
	
	
	

}
