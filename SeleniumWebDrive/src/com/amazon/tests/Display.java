package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.Assert;


// WHEN YOUR CLICKING SOMTHING HOW DO YOU KNOW WHETHER SOME FIELDS ARE HIDIDNG OR NOT  



public class Display {

	public static void main(String[] args) {
		
		
       WebDriver driver = new FirefoxDriver();
		
		driver.get("http://us.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println("before clicking multiple city radio button");
		
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]")).isDisplayed());
		
		
		driver.findElement(By.xpath("//html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p/label[3]")).click();
		System.out.println("before clicking multiple city radio button");
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]")).isDisplayed());
		
		
		
		
		int count = driver.findElements(By.xpath(".//*[@id='multi_city_bton']/span")).size();
		
		if(count==0){
			System.out.println("verified");
		}
		
		

	}

}
