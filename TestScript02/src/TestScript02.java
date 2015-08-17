/*
 * Time to create a more professional Script
 * 1) All parameters will will be saved in File Util.java - Helps in easy code maintenance
 * 2) We will move the code to launch Webdriver in a separate method as SetUp. Helps in code understanding
 */

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;




public class TestScript02 {

	
    

    public static void setUp() throws Exception {
	
		WebDriver driver = new FirefoxDriver();
	driver.get("http://www.demo.guru99.com");
	driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
  

	    driver.findElement(By.name("uid")).clear(); // Good practice to clear a field before use
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");  // Enter username

	   
	    driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");  // Enter Password

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();

	  	String actualTitle = driver.getTitle();
		if (actualTitle.contains("Guru99 Bank Manager HomePage")) {
				    System.out.println("Test case: Passed");
		} 
		else {
				    System.out.println("Test case : Failed");
		}
				
	    driver.close();
	    
	

    }

}

        

