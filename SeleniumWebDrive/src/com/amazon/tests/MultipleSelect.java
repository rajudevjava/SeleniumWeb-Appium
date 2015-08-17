package com.amazon.tests;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleSelect {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://jsbin.com/osebed/2");
		
		//Select fruit =new Select(driver.findElement(By.id("banana")));
		
	/*	
		package com.amazon.tests;

		import java.util.List;

		import org.apache.bcel.generic.Select;
		import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;


		public class DiceExample {

			
			@Test
			public void testcase() throws InterruptedException {
				
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
				
				
				
					
				
			   
		       // String result = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]")).getText();

		        //System.out.println(driver);
			/*
				String post = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/ul/li[3]")).getText();
				System.out.println("Whenjob posted:"+post);
		*/
		
		
		
		
		
		
		
		
		
		
		/*
				String ab="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
				String c="]/ul/li[3]";
				
				String cd,e,T,T1;
			    String j,time,hours="Hours",m,title,position="String";
			    
		        for (int i = 1; i < 30 ; i++)
		        {
		        	e=Integer.toString(i);
		        	
		        	
		        	T1=Integer.toString(i);
					T=Tit+T1+Tit1;
					position=driver.findElement(By.xpath(T)).getText();
					if(position.contains(position))
					{
						m=(Tit+(i+1)+Tit1);
						String Pos=driver.findElement(By.xpath(m)).getText();
						System.out.println(Pos);
		            }
					
					
		        	cd=ab+e+c;
		        	time=driver.findElement(By.xpath(cd)).getText();
		        	if(time.contains(hours))
		        		
		        	{
		        		j=(ab+(i+1)+c);
		        		String post1 =driver.findElement(By.xpath(j)).getText();
		        		
		        	    System.out.println("Whenjob posted:"+ post1);

		        	}
		        	
					
					
					
					
					
					
					
					
					
					
			}
		}}
*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
