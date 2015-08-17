package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lowes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
	
		
		driver.get("http://www.lowes.com");
		
		driver.manage().window().maximize();	
		
	
		
		/*String expectedTitle = " Lowers with logo Never stop Improve  ";		
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		}
		else
       {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
       }
		*/
		
		
		
		driver.findElement(By.id("Ntt")).sendKeys("Laptop");
	
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//html/body/div[3]/div[4]/div[3]/ul/li[1]/form/span/button")).click();
		
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div[5]/div[3]/ul/li[1]/div/div[2]/h3/a/span[1]")).click();
		/*driver.findElement(By.xpath("//html/body/div[2]/div/div[4]/div[3]//ul/li[1]/form/span/button")).click();
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//img[@alt='South Shore Furniture City Life Pure Black Laptop Desk']")).click();
		
		*/
		
		String model=driver.findElement(By.id("ModelNumber")).getText();
		
		System.out.println(model);
		
		driver.get("http://www.lowes.com");
		
		driver.findElement(By.id("Ntt")).clear();
		
		driver.findElement(By.id("Ntt")).sendKeys(model);
		
		driver.findElement(By.xpath("//html/body/div[3]/div[4]/div[3]/ul/li[1]/form/span/button")).click();
		
		
		driver.findElement(By.id("PL")).click();
	
		driver.findElement(By.xpath("//html/body/div[2]/div/div[5]/div/div/div[3]/div[2]/div[1]/form/ul[3]/li[2]/div/a/span")).click();
		
		/*driver.get("http://www.lowes.com");
		
		driver.findElement(By.id("nav-cart-count")).click();

		driver.findElement(By.partialLinkText("Check Out")).click();
		//driver.findElement(By.xpath("//html/body/div[17]/div[3]/div/button")).click();
		//driver.findElement(By.className("ui-icon ui-icon-closethick")).click();
		*/

		
		//driver.findElement(By.className("ui-input number text quant" )).click();
		
	//	driver.findElement(By.className("ui-input number text quant" )).clear();
		
		//Thread.sleep(10000);
		//driver.findElement(By.id("ui-input number text quant")).sendKeys("3");
		/*
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div/form[1]/div[4]/div/div[2]/div[3]/div/a[1]/span")).click();
		
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div/form[1]/div[5]/div[2]/div[2]/span/a[2]/span")).click();

		
		Thread.sleep(10000);
		
*/
		String model1=driver.findElement(By.id("ModelNumber")).getText();
		System.out.println(model1);
		
		
		if(model.equals(model1))
		{
			System.out.println("product same");
		}
		else{
			System.out.println("product is different");
		}
		
		
		Thread.sleep(10000);
		driver.close();
        
		System.out.println("Test script executed successfully.");
	
		
	}

}
