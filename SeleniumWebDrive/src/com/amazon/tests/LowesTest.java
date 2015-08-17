package com.amazon.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

public class LowesTest {

	@Test
	public void product() throws MalformedURLException{
		
		DesiredCapabilities rd = DesiredCapabilities.firefox();
		rd.setCapability("Verstion", "5");
		rd.setCapability("Platform", "XP");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://rajudevjava:ced38344-fc2b-4129-a325-cd163f8c0b9d.saucelabs.com:80/wd/hub"), rd);
		
		driver.get("http://www.lowes.com");
		driver.getTitle();
		
		Actions mo = new Actions(driver);
		
		mo.moveToElement(driver.findElement(By.id("nav-heading"))).build().perform();
		
		driver.findElement(By.className("category-name fetched")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='categories']/div[3]/div[2]/a/img")).click();
		
		String s = "/html/body/div[1]/div[5]/div[1]/div/div[4]/div[4]/ul/li[";
		String S1 = "]/div/div[3]/p";
		String b;
		for(int i =0 ; i<30 ; i++){
			b = s+(i+1)+S1;
		String l =driver.findElement(By.xpath(b)).getText();
			System.out.println(l);
			
		}
		
		
	}

}
