package com.example.ParaBank;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankRegisterPageTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=FB264E1EAE16A12E4D4A13B5B7CB3451");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//selenium_training_loginpages page = new selenium_training_loginpages(driver);
		//page.loginApplication("rahulshettyacademy" , "learning");
		 System.out.println("The browser is success opened and maximised");
		 
		 driver.findElement(By.xpath("//p//a[text()='Register']")).click();
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
				
				
				
				
				
			}
			
	}
	
}
