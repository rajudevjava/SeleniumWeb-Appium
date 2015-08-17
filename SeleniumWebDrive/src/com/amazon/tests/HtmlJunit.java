package com.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlJunit {

	// WHEN YOU WANT TO DO A TEST IN HTML THIS IS VERY EASSY IT WONT OPEN DRIVER JUST IT WILL PRINT THE OUTPUT 
	
	@Test
	public void testing(){

		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());
		
	}
	

}
