package com.example.ParaBank;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulSheetyAssignmentDynamicSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		String chromeDriverPath=ProjectPath+"\\driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String trip = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).getText();
		
		System.out.println(trip);
		
		WebElement element = driver.findElement(By.id("checkBoxOption3"));
		
		 String selectedvalue = element.getAttribute("value");
		 WebElement drop =  driver.findElement(By.id("dropdown-class-example"));
		Select value = new Select(drop);
		
		 value.selectByIndex(3);
		
		driver.findElement(By.id("name")).sendKeys(selectedvalue);
		driver.findElement(By.id("alertbtn")).click();
		
		
		
		String name = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		if(name.contains("option3")) {
			System.out.println(driver.switchTo().alert().getText().split(",")[0].split(" ")[1]);
		}
		driver.switchTo().alert().accept();
	}

}




/*public class Assignment {



public static void main(String[] args) {



// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

   

        WebDriver driver = new ChromeDriver();

   

        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");

}*/
