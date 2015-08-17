package com.amazon.tests;

import java.io.PrintWriter;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.ElementNotVisibleException;

// YOUR ASSIGHNMENT IN SIMPLE PROGRAM 
 
public class FireTest {
 
	public static void main(String[] args) throws InterruptedException{
		
		 
			 
		 
		
		WebDriver drive=new FirefoxDriver();
		drive.manage().window().maximize();
		drive.get("http://www.dice.com"); 
		
		drive.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/form/fieldset/div[2]/div/div[1]/input")).sendKeys("Selenium Testers");
		drive.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/form/fieldset/div[3]/div/div[1]/input")).clear();
	
		drive.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/form/fieldset/div[3]/div/div[1]/input")).sendKeys("Los Angeles");
	    drive.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/form/fieldset/div[4]/div/div[1]/button")).click();
	
	    drive.findElement(By.xpath("//html/body/div[4]/div/div/div[1]/button")).click();
	    
	    
	    
	   
	   
	    String a=".//*[@id='position";
		String b="']";
		
		
		String c=".//*[@id='serp']/div[";
		String d="]/ul/li[1]";
		
		
		String e=".//*[@id='serp']/div[";
		String f="]/ul/li[2]";
		
				
		String Link = ".//*[@id='company";		
		String Link1 = "']";
		
		
		String ab,cd,ef; 
		for(int i=0;i<30;i++)
		{
			ab=a+(i+1)+b;
			cd=c+(i+1)+d;
			ef=e+(i+1)+f; 
			String l = Link+(i+1)+Link1; 
			System.out.printf("Job Role "+drive.findElement(By.xpath (ab)).getText());
			System.out.printf("Client Name "+drive.findElement(By.xpath (cd)).getText());
			System.out.printf("Location "+drive.findElement(By.xpath (ef)).getText());
			System.out.printf("URL : "+drive.findElement(By.xpath(l)).getAttribute("href"));
			System.out.printf("----------------------------------------------------------"
					+ ""
					+ ""); 
  
		} 
		  
	} 
}
