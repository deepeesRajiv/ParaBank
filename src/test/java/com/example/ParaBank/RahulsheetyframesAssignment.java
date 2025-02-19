package com.example.ParaBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulsheetyframesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
	System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
	
  
	}

}
