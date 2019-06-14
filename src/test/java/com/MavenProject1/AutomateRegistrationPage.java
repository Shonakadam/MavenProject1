package com.MavenProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AutomateRegistrationPage {
	WebDriver driver;
  @Test
  public void f() {
	  

			WebElement signin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			signin.click();
			//signin
			//WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
			//Email.sendKeys("monu123@gmail.com");
			
			//WebElement pass=driver.findElement(By.xpath("//input[@name='passwd']"));
		//pass.sendKeys("pass123");
			
		//WebElement sigin=driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		//	sigin.click();
	  
	 // driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();

		//WebElement emailid = driver.findElement(By.xpath("//input[@//input[@name='email_create']]"));
		//emailid.sendKeys("monika123@gmail.com");

		//WebElement create = driver.findElement(By.xpath("//input[@name='SubmitCreate']"));
		//create.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
