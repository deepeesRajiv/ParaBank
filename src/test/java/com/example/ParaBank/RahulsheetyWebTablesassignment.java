package com.example.ParaBank;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulsheetyWebTablesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		
		List<WebElement> valuerow =  driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		
		 int noOfRows = valuerow.size();
		 System.out.println(noOfRows);
		 
		 List<WebElement> valuecol =  driver.findElements(By.xpath("//table[@class='table-display']//th"));
			
		 int noOfCols = valuecol.size();
		 System.out.println(noOfCols);
		 
		 List<WebElement>  rwdata  =  driver.findElements(By.xpath("//table[@class='table-display']//tr[3]//td"));
		
		 for(int i=0;i<rwdata.size();i++) {
			System.out.println(rwdata.get(i).getText());
			//String name = driver.findElements(By.xpath("//table[@class='table-display']//tr[3]//td[i]")).toString();
		//System.out.println(name);
		 }
		 
		 
		 
		 
		 
		 
	}

}

/*
code by rahulshetty

mport java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class A3 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}





Lecture thumbnail
0:00 / 0:00
Your submission
RD
Rajiv Deshpande
Posted A few seconds ago
Complete the Assignment and Post the code here

String ProjectPath=System.getProperty("user.dir");		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";		System.setProperty("webdriver.chrome.driver", chromeDriverPath);		WebDriver driver = new ChromeDriver();		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		driver.manage().window().maximize();		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);				JavascriptExecutor js =  (JavascriptExecutor)driver;				js.executeScript("window.scrollBy(0,600)");				List<WebElement> valuerow =  driver.findElements(By.xpath("//table[@class='table-display']//tr"));				 int noOfRows = valuerow.size();		 System.out.println(noOfRows);		 		 List<WebElement> valuecol =  driver.findElements(By.xpath("//table[@class='table-display']//th"));					 int noOfCols = valuecol.size();		 System.out.println(noOfCols);		 		 List<WebElement>  rwdata  =  driver.findElements(By.xpath("//table[@class='table-display']//tr[3]//td"));				 for(int i=0;i<rwdata.size();i++) {			System.out.println(rwdata.get(i).getText());
How did you do on this exercise?

Take a moment to reflect on what you learned from this exercise

RD
Add feedback...
I learned...
Play
102. How to Perform Scrolling with in table and Window level using JavaScriptExecutor
13min
Play
103. How to handle table Grids in webpage
10min
Play
104. Parsing String and comparing with Generated Sum value -Exercise
7min
Start
Assignment 7: Web Tables Assignment
Start
Assignment 8: Autocomplete Dropdown Assignment
Start
Quiz 7: Quiz - Check Your Knowledge

*/