package com.amazon.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		
		/*	
		PrintWriter outFile = new PrintWriter(new FileWriter("trilogy.txt"));
        //Create a generator object to create random numbers
         Random gen = new Random ();

        //Create a scanner object to scan user input.
         Scanner scan = new Scanner(System.in);

         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
         //get current date time with Date()
        // Date date = new Date();
         outFile.println(dateFormat.format(date));
         outFile.println();
		
*/
		
		
		
 		WebDriver driver = new FirefoxDriver();
 		
 		driver.get("https://www.dice.com/jobs/advancedSearch.html");
 		
 		driver.manage().window().maximize();
 		
 	    driver.manage().deleteAllCookies();
 		
 		Thread.sleep(3000);
 		driver.findElement(By.id("monetate_lightbox_mask")).click();
 		
 		
 		driver.findElement(By.id("for_one")).click();
 		// enter the keyword in search field
 		driver.findElement(By.id("for_one")).sendKeys("java developer");
 		// select preferences 
 		
 		driver.findElement(By.id("jtype")).clear();
 		
 		driver.findElement(By.id("jtype")).sendKeys("Contracts");
 		driver.findElement(By.id("sort2")).click();
 		driver.findElement(By.id("telecommute2")).click();
 		
 		JavascriptExecutor js = (JavascriptExecutor) driver;

 		WebElement a = driver.findElement(By.xpath("//div[@id='limitS']/a"));

 		js.executeScript("arguments[0].setAttribute('style', 'left: 99%;')",a);
 		
 		
 		
 	
 		driver.findElement(By.xpath("//input[@class='btn btn-lg btn-primary btn-block dice-btn']")).click();
 	
 		Thread.sleep(3000);
 		//driver.findElement(By.id("monetate_lightbox_mask")).click();
 		
 		

 		String Tit = "//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
 		String Tit1= "]/h3/a";
 		

     	String Loc1 ="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
     	String Loc2 = "]/ul/li[2]";
     	

     	String Cli ="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
     	String Cli1="]/div";
     	
     	
 		
 			
 		
 	   
        // String result = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]")).getText();

         //System.out.println(driver);
 	/*
 		String post = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/ul/li[3]")).getText();
 		System.out.println("Whenjob posted:"+post);
 */
 		String ab="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
 		String c="]/ul/li[3]";
 		
 		String cd,e,T,T1,L,L1,C,C1;
 	    String j,time,hours="Hours",m,title,position="String",l,loca,location="String",c1,clin,client="String";
 	    
         for (int i = 1; i < 30 ; i++)
         {
         	

         	T1=Integer.toString(i);
 			T=Tit+T1+Tit1;
 			position=driver.findElement(By.xpath(T)).getText();
 			if(position.contains(position))
 			{
 				m=(Tit+(i+1)+Tit1);
 				String Pos=driver.findElement(By.xpath(m)).getText();
 				System.out.println("Position Name" +Pos);
 	
             }
 			e=Integer.toString(i);
 			
         	cd=ab+e+c;
         	time=driver.findElement(By.xpath(cd)).getText();
         	if(time.contains(hours))
         		
         	{
         		j=(ab+(i+1)+c);
         		String post1 =driver.findElement(By.xpath(j)).getText();
         		
         	    System.out.println("Whenjob posted:"+ post1);


         	}
         	
         	L1=Integer.toString(i);
         	
         	L=Loc1+L1+Loc2;
         	loca=driver.findElement(By.xpath(L)).getText();
         	if(loca.contains(loca))
         	{
         		
         		l=(Loc1+(i+1)+Loc2);
         		String locati=driver.findElement(By.xpath(l)).getText();
         	    System.out.println("Location:" + locati);

         	}
         	
         	
         	C1=Integer.toString(i);
         	
         	c1=Cli+C1+Cli1;
         	clin=driver.findElement(By.xpath(c1)).getText();
         	System.out.println("Disciption" + clin);
         	
         	System.out.println(""
         			+ ""
         			+ ""
         			+ "");
         }
		
		
		
		
	}

}
