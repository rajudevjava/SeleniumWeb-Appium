package com.amazon.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	
	//	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/SignUp");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>ss=ids.iterator();
		String parentid = ss.next();
		String chaild =ss.next();
		driver.switchTo().window(chaild);
		driver.findElement(By.xpath("html/body/section/div/div/nav/div/h4/a")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
