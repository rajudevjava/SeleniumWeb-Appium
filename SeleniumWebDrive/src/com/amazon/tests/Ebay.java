package com.amazon.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

// HOW DROP DOWN YOU CAN SELECT WITHOUT ANY FINDING ELEMENT


public class Ebay {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.ebay.com");
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.findElement(By.id("gh-logo")).isDisplayed());
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='gh-cat']")));

	    
		//dropdown.selectByVisibleText("Art");
		dropdown.selectByIndex(4);
		
		System.out.println(driver.findElement(By.id("gh-cat")).isSelected());
		
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("camera");
		
		driver.findElements(By.id("glbfooter")).size();
		
		//String links = driver.findElement(By.xpath("//html/body/div[5]/div/div[2]/footer/div[2]/table/tbody/tr/td[2]/ul")).getAttribute("a");
		
		//System.out.println(links);
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
		
		
		
		
	}

}
