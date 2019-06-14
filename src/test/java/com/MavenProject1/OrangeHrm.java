package com.MavenProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHrm {
	WebDriver driver;
  @Test
  public void login() {
	  WebElement UserName=driver.findElement(By.id("txtUsername"));
	  UserName.sendKeys("Admin");
	  
	  WebElement password=driver.findElement(By.id("txtPassword"));
	  password.sendKeys("admin123");
	  
	  WebElement loginBut=driver.findElement(By.id("btnLogin"));
	  loginBut.click();
  }
  @BeforeTest
  public void Setup() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
