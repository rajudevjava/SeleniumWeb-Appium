package com.amazon.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tr_and_Td {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
		driver.get("http://www.espncricinfo.com/the-ashes-2015/engine/match/743969.html");
		

		WebElement table = driver.findElement(By.className("score-table"));
		//finding rows in table 
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("rows :"+rows.size());
	
		List<WebElement>colm = table.findElements(By.tagName("td"));
		System.out.println("coloum :"+colm.size());
	
		
		int i=0;
		for(WebElement coul:rows){
	    List<WebElement> col = coul.findElements(By.tagName("td"));
	    i++;
	    System.out.println("no of coloumns in "+i+"th row are "+col.size());
	    //finding cell value
	    
	    for(WebElement text:col){
	    	System.out.println(text.getText());
	    }
	    
	 }
	
	 
		
		
		
		
	}

}
