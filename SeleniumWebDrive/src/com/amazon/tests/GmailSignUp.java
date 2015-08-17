package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignUp {
	
	static boolean a,b,c,d,e,f,g,h,i;

	public static void main(String[] args) {
		
// HOW TO SIGNUP GMAIL AND THERE IS A TRICK HERE WE CAN PAUSE FOR A WHILE TO GIVE CODE TO THAT PAGE THE CODE WILL UPDATE EVERYTIME 		
		
		WebDriver driver = new FirefoxDriver();
		
		//Open gmail 
		
		driver.get("http://www.gmail.com");
		
		//Click on create new gmail
		driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[2]/div/div/p[1]/span[2]/a")).click();
		
		//click create button
		
		//driver.findElement(By.id("submitbutton")).click();
		
		//String error = driver.findElement(By.id("errormsg_0_LastName")).getText();
		
		//System.out.println(error);
		
		a=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/fieldset/label[1]/span")).isDisplayed();
		if(a==true)
			System.out.println("Name test is showing");
		//Enter first name 
		
		driver.findElement(By.id("FirstName")).sendKeys("subbu");
		b=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/fieldset/label[2]/input")).isDisplayed();
		if(b==true)
			System.out.println("firstname is entered");
		//Enter Last name
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/fieldset/label[2]/span")).click();
		//driver.findElement(By.id("LastName")).sendKeys("Koneti");
		c=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/span[2]")).isDisplayed();
		
		
		/*System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.id("errormsg_0_LastName")).getText());
		
		
		//System.out.println(driver.findElement(By.xpath("//span[@id='errormsg_0_LastName']")).getText());
		String messege = driver.findElement(By.className("errormsg")).getText();
		//System.out.println("You can't leave this empty."+messege);
		*/
		
		if(c==true)
			System.out.println("You can't leave this empty");
		
		//enter email id
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[2]/label/input")).sendKeys("subbukkkk209");
		
		
		driver.findElement(By.id("submitbutton")).click();
		
		
		
		
	}

}