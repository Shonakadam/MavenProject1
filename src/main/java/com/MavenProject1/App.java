package com.MavenProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       //System.setProperty("webdriver.gecko.driver", "Resoures/geckodriver.exe");
       // System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
    	System.setProperty("webdriver.ie.driver", "Resoures/IEDriverServer.exe");
       // WebDriver driver= new ChromeDriver();
    	//WebDriver driver= new FirefoxDriver();
    	WebDriver driver= new InternetExplorerDriver();
        driver.get("https://www.eclipse.org/m2e/");
        driver.quit();
    }
}
