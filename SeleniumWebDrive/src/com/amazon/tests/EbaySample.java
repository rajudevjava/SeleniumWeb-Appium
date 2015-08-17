package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com");
		//locating by ID
		driver.findElement(By.id("gh-ac")).sendKeys("Watches");
		//locating by name
		driver.findElement(By.id("gh-btn")).click();
		//drive.findElement(By.id("gh-btn")).click();
		Thread.sleep(10000);
		//Locating By LinkText
		driver.findElement(By.partialLinkText("Auction")).click();
		
		
		
		//driver.findElement(By.partialLinkText("Auction")).clear();
		
		driver.findElement(By.partialLinkText("Buy It Now")).click();
		
		
		/*driver.findElement(By.id("gh-ac")).clear();
		
		driver.findElement(By.id("gh-ac")).sendKeys("HpLaptop");
		
		driver.findElement(By.partialLinkText("HP Laptop With Windows 8")).click();
		
		Thread.sleep(10000);
		
		driver.close();
	*/
		
		//System.out.println(driver.findElement(By.xpath("//img[@height='255']")).getAttribute("src");
		//);
		//Thread.sleep(10000);
		
		driver.close();
		

	}

}
