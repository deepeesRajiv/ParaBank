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
		 
		 driver.findElement(By.xpath("//p//a[text()='Register']")).click();
		Readingexcel read =  new Readingexcel(driver);
		
		read.excelaccess_data();
		
	
				
				
				
			}
			
	}
	
//}
