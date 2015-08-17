package com.amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	
	static boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
	static String test,test1,test2,test3,test4,test5,test6;
	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver = new FirefoxDriver();
		
		//Open gmail 
		
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();	
		
		driver.manage().deleteAllCookies();
		
		//Click on create new gmail
		driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div[2]/div/div/p[1]/span[2]/a")).click();
		
		a=driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/img")).isDisplayed();
		
		if(a==true)
			System.out.println("Google image is present");
		
		b=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/fieldset/label[1]/input")).isDisplayed();
	
		if(b==true)
			System.out.println("First name box is present");
		
		driver.findElement(By.id("FirstName")).sendKeys("subbu");
		
		/*c=driver.findElement(By.id("lastname-placeholder")).isDisplayed();
		
		if(c==true)
			System.out.println("Last name box is present");
	/driver.findElement(By.id("LastName")).sendKeys("koneti");
	*/	
		d=driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[1]/span[1]")).isDisplayed();
		if(d==true)
			System.out.println("You can't leave this empty");
		e=driver.findElement(By.id("GmailAddress")).isDisplayed();
		if(e==true)
			System.out.println("username test is prasent");
		driver.findElement(By.id("GmailAddress")).sendKeys("sqwaeas");
		test1=driver.findElement(By.id("GmailAddress")).getAttribute("value");
		driver.findElement(By.id("GmailAddress")).sendKeys(Keys.ENTER);
		
		if(test1.length()<6)
		{
			System.out.println("username must should be 6 charecters");
		}
		f=driver.findElement(By.id("errormsg_0_LastName")).isDisplayed();
		if(f==true)
			System.out.println("Please enter your lastname");
		g=driver.findElement(By.className("atgmail")).isDisplayed();
		if(g==true)
			System.out.println("Create password test is prasent");
		driver.findElement(By.id("Passwd")).sendKeys("subbu143");
		
		test=driver.findElement(By.id("Passwd")).getAttribute("value");
		h=driver.findElement(By.id("errormsg_0_GmailAddress")).isDisplayed();
		
		if(h==true)
			System.out.println("username should not be empty");
		i=driver.findElement(By.id("confirm-password-label")).isDisplayed();
		if(i==true)
			System.out.println("confirm passoword is present");
		j=driver.findElement(By.id("PasswdAgain")).isDisplayed();
		if(j==true)
			System.out.println("Cpassword text is present");
		driver.findElement(By.id("PasswdAgain")).sendKeys("subbu143");
		test1=driver.findElement(By.id("PasswdAgain")).getAttribute("value");
		driver.findElement(By.id("PasswdAgain")).sendKeys(Keys.ENTER);
		
		k=driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed();
		System.out.println("you can't leave password field empty");
		
		if(test.equals(test1))
		{
			System.out.println("password are matching");
		}
		
		else
			System.out.println("password doesnt match");
		
		l=driver.findElement(By.id("BirthdayLabel")).isDisplayed();
		if(l==true)
		{
			System.out.println("Birthday test is present");
		}
		
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[2]/div[@id=':5']")).click();
		driver.findElement(By.id("BirthDay")).sendKeys("16");
        driver.findElement(By.id("BirthYear")).sendKeys("1978");
        
        //test3=driver.findElement(By.id("BirthYear")).getAttribute("value");
        
        //System.out.println("year is" +test3);
		
        driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div")).click();
        driver.findElement(By.xpath(".//*[@id='Gender']/div[2]/div[@id=':f']")).click();
		
        System.out.println("Enter the capcha manually and wait for 20 seconnds");
        
        Thread.sleep(20000); 
       
        driver.findElement(By.id("TermsOfService")).click();
       
        System.out.println("Enter the capcha manually and wait for 20 seconnds");
        driver.findElement(By.id("TermsOfService")).submit();
           
       
        driver.findElement(By.id("next-button")).click();
        System.out.println("Enter the verification code sent on ur registered mobile number");
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
