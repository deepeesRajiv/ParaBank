package com.example.ParaBank;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulSheetyAssignmentMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div//a[text()='Click Here']")).click();
		
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String> windowid = windows.iterator();
		
		String parentid =windowid.next();
		String childid = windowid.next();
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.findElement(By.xpath("//div//h3[text()='New Window']")).getText());
		
		driver.switchTo().window(parentid);
		
		System.out.println(driver.findElement(By.xpath("//div//h3[text()='Opening a new window']")).getText());
		
		
		
	}

}
