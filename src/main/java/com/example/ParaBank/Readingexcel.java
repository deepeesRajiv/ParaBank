package com.example.ParaBank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String excelFielpath = ".//datafiles//RegistrationData_ParaBank.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFielpath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
         
	//get sheet by name 	
		XSSFSheet sheet= workbook.getSheet("Sheet1");
	
		//XSSFSheet sheet= workbook.getSheetAt(0); // get sheet with index
		
		//using for loop read the rows and column
		
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<rows+1;r++)
		{
		XSSFRow row = 	sheet.getRow(r);
			for(int c=0;c<cols;c++) {
			XSSFCell cell=	row.getCell(c);
			switch(cell.getCellType())
			{
			case STRING : System.out.println(cell.getStringCellValue());break;
			case NUMERIC : System.out.println(cell.getNumericCellValue());break;
			
			}
			}
			System.out.println();
		}
	}

}
