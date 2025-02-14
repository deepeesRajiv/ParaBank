package com.example.ParaBank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Readingexcel {

	WebDriver driver;
	
	public Readingexcel(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

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
		//System.out.println(rows);
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int r=1;r<=rows;r++)
		{
		XSSFRow row = 	sheet.getRow(r);
//			for(int c=0;c<cols;c++) {
//			XSSFCell cell=	row.getCell(c);
//			
			String name = row.getCell(0).getStringCellValue();
			String lastname = row.getCell(2).getStringCellValue();
			System.out.println(lastname);
			
//			switch(cell.getCellType())
//			{
//			case STRING : System.out.println(cell.getStringCellValue());break;
//			case NUMERIC : System.out.println(cell.getNumericCellValue());break;
//			
//			}
			
	       
			}
			System.out.println();
		}
		
		//using iterator method
		
	/*Iterator iterator = 	sheet.iterator();
	
	while(iterator.hasNext())
	{
	XSSFRow	row = (XSSFRow) iterator.next();
	
	 Iterator cellIterator = row.cellIterator();
	 
	 while (cellIterator.hasNext()) {
		 XSSFCell cell =  (XSSFCell) cellIterator.next();
		 switch(cell.getCellType())
			{
			case STRING : System.out.println(cell.getStringCellValue());break;
			case NUMERIC : System.out.println(cell.getNumericCellValue());break;
			
			}
			}
			System.out.println();
	 }
	//System.out.println();
	}*/
		
	}
//}


