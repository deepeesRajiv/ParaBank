package com.example.ParaBank;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Readingexcel {

	WebDriver driver;
	
	public Readingexcel(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void excelaccess_data() throws IOException, InterruptedException {
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
		driver.findElement(By.id("customer.firstName")).sendKeys(name);
		String lastname = row.getCell(1).getStringCellValue();
		driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
		String address = row.getCell(2).getStringCellValue();
		driver.findElement(By.id("customer.address.street")).sendKeys(address);
		String city = row.getCell(3).getStringCellValue();
		driver.findElement(By.id("customer.address.city")).sendKeys(city);
		String state = row.getCell(4).getStringCellValue();
		driver.findElement(By.id("customer.address.state")).sendKeys(state);
		String Zipcode = row.getCell(5).getStringCellValue();
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(Zipcode);
		String phone = row.getCell(6).getStringCellValue();
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);
		String ssn = row.getCell(7).getStringCellValue();
		driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
		
		String username = row.getCell(8).getStringCellValue();
		driver.findElement(By.id("customer.username")).sendKeys(username);
		String password = row.getCell(9).getStringCellValue();
		driver.findElement(By.id("customer.password")).sendKeys(password);
		String confirm = row.getCell(10).getStringCellValue();
		driver.findElement(By.id("repeatedPassword")).sendKeys(confirm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td//input[@type='submit']")).click();
		
			
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


