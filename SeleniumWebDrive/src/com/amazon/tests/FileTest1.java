package com.amazon.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class FileTest1 {

	@Test
	public void subbu() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.id("lst-ib")).sendKeys("subbu");
		Thread.sleep(1000);
		 WebElement subbu = driver.findElement(By.id("resultStats"));
	       System.out.println(subbu.getText());

	
	    
	}


}
