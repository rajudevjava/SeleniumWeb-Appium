package com.amazon.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

// SAME ONE BUT IT WILL STORE IN EXCEL FILE
public class DiceExcel {

	public static void main(String[] args) throws IOException,RowsExceededException, WriteException, InterruptedException {
		
		File fExcel = new File("/Users/ksubbu/Desktop/employe/subbu.xls");
		
		
		WritableWorkbook writableBook = Workbook.createWorkbook(fExcel);
		
		writableBook.createSheet("Data", 0);
		
		WritableSheet writableSheet = writableBook.getSheet(0); 
		
	   
	    
	    
	    
	    
	    
	    

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
		
		for(int j=0 ; j<100 ; j++){
			Label lines = new Label(0, j++, "data");
		    writableSheet.addCell(lines);
		}

		String Tit = "//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
		String Tit1= "]/h3/a";
		

    	String Loc1 ="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
    	String Loc2 = "]/ul/li[2]";
    	

    	String Cli ="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
    	String Cli1="]/div";
    	
    	String sub ="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
    	String sub1="]/ul/li[1]/a";
		
    	
       // String result = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]")).getText();

        //System.out.println(driver);
	/*
		String post = driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/ul/li[3]")).getText();
		System.out.println("Whenjob posted:"+post);
*/
		String ab="//html/body/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[";
		String c="]/ul/li[3]";
		
		String cd,e,T,T1,L,L1,C,C1,S,S1;
		
	    String j,time,hours="Hours",m,title,position="String",l,loca,location="String",c1,clin,client="String",s,sit,subbu="String";
	   for(int z=0; z<50; z++){
        for (int i = 1; i < 30 ; i++)
        {
        	

        	T1=Integer.toString(i);
			T=Tit+T1+Tit1;
			position=driver.findElement(By.xpath(T)).getText();
			if(position.contains(position))
			{
				m=(Tit+(i+1)+Tit1);
				String Pos=driver.findElement(By.xpath(m)).getText();
				//System.out.println("Position Name" +Pos);
				 Label data1 = new Label(0, z++, Pos);
				 
				 
				 
				 writableSheet.addCell(data1);
	
            }
			
			
			S1=Integer.toString(i);
			S=sub+S1+sub1;
			subbu=driver.findElement(By.xpath(S)).getText();
			if(subbu.contains(subbu))
			{
				s=(sub+(i+1)+sub1);
				String name=driver.findElement(By.xpath(s)).getText();
				//System.out.println("Client Name:" + name);
				Label data2 = new Label(0, z++, name);
			    writableSheet.addCell(data2);
			}
			
			
			
			
			e=Integer.toString(i);
			
        	cd=ab+e+c;
        	time=driver.findElement(By.xpath(cd)).getText();
        	if(time.contains(hours))
        		
        	{
        		j=(ab+(i+1)+c);
        		String post1 =driver.findElement(By.xpath(j)).getText();
        		
        	    //System.out.println("Whenjob posted:"+ post1);


        		//System.out.println("Dice result"+ i+1);
        	    Label data3 = new Label(0, z++, post1);
        	    writableSheet.addCell(data3);

        	}
        	
        	L1=Integer.toString(i);
        	
        	L=Loc1+L1+Loc2;
        	loca=driver.findElement(By.xpath(L)).getText();
        	if(loca.contains(loca))
        	{
        		
        		l=(Loc1+(i+1)+Loc2);
        		String locati=driver.findElement(By.xpath(l)).getText();
        	    //System.out.println("Location:" + locati);
        		  Label data4 = new Label(0, z++, locati);
          	    writableSheet.addCell(data4);

        	}
        	
        	
        	C1=Integer.toString(i);
        	
        	c1=Cli+C1+Cli1;
        	clin=driver.findElement(By.xpath(c1)).getText();
        	//System.out.println("Disciption" + clin);
        	Label data5 = new Label(0, z++, clin);
      	    writableSheet.addCell(data5);
        	
        	
        	System.out.println(""
        			+ ""
        			+ ""
        			+ "");

			
	}}
	    
        
	    
	    
	    
	    
	    
	    
	    
	    
	  
	    
		writableBook.write();
		
		writableBook.close();
		
		
		
		
		
		
		
		
	}

}
