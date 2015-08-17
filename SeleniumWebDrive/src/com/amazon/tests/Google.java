package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Close;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.QuitAction;

public class Google {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.dice.com/jobs?q=java&l=Dallas%2C+TX");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		String g = ".//*[@id='position";
		String gh ="']";	
		String a;
		for(int i=0; i<50; i++){
			a = g+(i+1)+gh;
			System.out.println(driver.findElement(By.xpath(a)).getAttribute("href"));
			
		}
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		

	}

}
