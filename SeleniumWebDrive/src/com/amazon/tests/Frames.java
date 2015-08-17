package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
	
// SOME TIMW HTML THEY WILL WRITEN BY USINGS FRAMES YOU CAN USE THIS SINGLE SYNTAX FOR THAT 
		
		
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		driver.getPageSource();
		//driver.findElement(By.className("input_password")).sendKeys("1000");
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("1000");

	}

}
