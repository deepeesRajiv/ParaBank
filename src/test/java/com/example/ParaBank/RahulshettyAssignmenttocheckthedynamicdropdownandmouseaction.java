package com.example.ParaBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RahulshettyAssignmenttocheckthedynamicdropdownandmouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		
		Actions act = new Actions(driver);
		//div//fieldset//input[@id='autocomplete']
		
act.moveToElement((driver.findElement(By.xpath("//div//fieldset//input[@id='autocomplete']")))).build().perform();
Thread.sleep(2000);
act.moveToElement((driver.findElement(By.xpath("//div//fieldset//input[@id='autocomplete']")))).contextClick().build().perform();	
Thread.sleep(3000);
WebElement clickable = driver.findElement(By.xpath("//div//fieldset//input[@id='autocomplete']"));
new Actions(driver).doubleClick(clickable).perform();
	
	}

}
