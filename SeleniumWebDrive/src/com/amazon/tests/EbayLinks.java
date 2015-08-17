package com.amazon.tests;

import java.util.List;

import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// HOW TO WORK WHEN YOU HAVE TABLE FORMAT AND WHEN YOUR UNABLE TO GET ALL URLS ON PAGE THAT MEANS THAT IS WRITTEN IN TABLE FORMAT THAT TIME IT WILL WORK 

public class EbayLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("glbfooter"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement Buy = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		
		System.out.println(Buy.findElements(By.tagName("a")).size());
		
		String text = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul")).getText();
		
		System.out.println(text);
		
		//WebElement Buy1 = driver.findElement(By.xpath("//html/body/div[5]/div/div[2]/footer"));
		
		//System.out.println(Buy.findElement(By.tagName("a")).getAttribute("href"));
	
		final List<WebElement> allLinks = Buy.findElements(By.tagName("a")); 
		for (final WebElement link : allLinks) { 
		String orgLink = link.getAttribute("href"); 
		System.out.println(orgLink); 
		}
	
	
		
		
	}

}
