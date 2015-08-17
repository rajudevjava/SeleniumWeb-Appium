package com.amazon.tests;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.Equals;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tes {
	
@Test
	public void test() {
		
		WebDriver driver = new FirefoxDriver();
		

		driver.manage().window().maximize();
		driver.get("http://www.lowes.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		Actions mo = new Actions(driver);
		
		mo.moveToElement(driver.findElement(By.xpath(".//*[@id='header-block']/div[3]/ul/li[2]/a/span[1]"))).build().perform();
		mo.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-departments']/ul/li[4]/a"))).click().build().perform();

		//driver.findElement(By.className("category-name fetched")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='categories']/div[3]/div[2]/a/img")).click();
		/*
		String s = "/html/body/div[1]/div[5]/div[1]/div/div[4]/div[4]/ul/li[";
		String S1 = "]/div/div[3]/p";
		String b;
		for(int i =0 ; i<30 ; i++){
			b = s+(i+1)+S1;
		String l =driver.findElement(By.xpath(b)).getText();
			System.out.println(l);
			
		}
		
		*/
		driver.findElement(By.xpath(".//*[@id='item_3127579']/div/div[2]/h3/a/span[1]")).click();
		WebElement r = driver.findElement(By.xpath(".//*[@id='pricing']/span"));
		String raju = r.getText();
		System.out.println(raju);
		Assert.assertEquals("$8.97", raju);
		String model = driver.findElement(By.xpath(".//*[@id='ModelNumber']")).getText();
       System.out.println(model);
		driver.findElement(By.xpath(".//*[@id='Ntt']")).clear();
        driver.findElement(By.xpath(".//*[@id='Ntt']")).sendKeys(model);
        driver.findElement(By.xpath(".//*[@id='frmQuickSearch']/span/button")).click();
		
	}

}
