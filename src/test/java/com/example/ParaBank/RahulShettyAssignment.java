package com.example.ParaBank;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.assertj.core.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RahulShettyAssignment {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div//label//input[@value='user']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[@id='okayBtn'")));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//button[@id='okayBtn']")).click();
		
		WebElement drop = driver.findElement(By.xpath("//div//select[@class='form-control']"));
		drop.click();
		
		Select pick =  new Select(drop);
		pick.selectByIndex(2);
		driver.findElement(By.xpath("//div//select[@class='form-control']")).click();
		
		driver.findElement(By.xpath("//span//input[@id='terms']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		
		String[] ArrayOfProduct = { "iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		List<WebElement> product = driver.findElements(By.xpath("//div//h4[@class='card-title']"));
		
		
		for(int i=0;i<product.size();i++) {
			String name = product.get(i).getText();
			List listofproducts =  Arrays.asList(ArrayOfProduct);
			
			if(listofproducts.contains(name)) {
				driver.findElement(By.xpath("//div//button[text()='Add ']")).click();
			}
		}
		
		driver.findElement(By.xpath("//div//a[@class='nav-link btn btn-primary']")).click();
	}

}
