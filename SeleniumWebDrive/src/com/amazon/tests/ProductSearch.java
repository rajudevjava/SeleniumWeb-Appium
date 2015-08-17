package com.amazon.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.thoughtworks.selenium.webdriven.commands.Click;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ProductSearch {

	
    static WebDriver driver;  
    
    static List<WebElement> mainurl, suburl;  
    static List<String> uniqueurl;  
  
	
	
	@Test
	public void testcase() throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		
		    
		    /* Create a 2nd List to hold the URLs of the anchor tags.
		    List<String> allURLs = new ArrayList<String>();

		    // Iterate through all the anchors that you got.
		    for (WebElement a : anchors) {

		        // Print out the URL of the anchor.
		        System.out.println(a.getAttribute("href"));

		        // Store the URL of the List.
		        allURLs.add(a.getAttribute("href"));
		    }

		    // Now just get the URL you want to use from the list...
		    String siteURL = allURLs.get(0);
		    */
			//driver.get(siteURL);

		
	}



	private char[] getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
		
		/*
        //Go to website    
        uniqueurl = new ArrayList();  
        driver.get(websiteaddress);  
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        //get all url of page  
        mainurl = driver.findElements(By.tagName("a"));  
  
for (int k = 0; k < mainurl.size(); k++) {  
            // check url not null, empty and only current website   
            if (!(mainurl.get(k).getText().trim().equals("")) && !(mainurl.get(k).getText().trim() == null) && !(mainurl.get(k).getAttribute("href").trim() == null) && !(mainurl.get(k).getAttribute("href").trim().equals("")) && (mainurl.get(k).getAttribute("href").contains("amazon.com")) && !(mainurl.get(k).getAttribute("href").contains("@"))) {  
  
       if (!(uniqueurl.contains(mainurl.get(k).getAttribute("href").trim()))) {  
   uniqueurl.add(mainurl.get(k).getAttribute("href").trim());  
//Print urls  
 System.out.println(mainurl.get(k).getAttribute("href")); 
 
 

 // Open new tab  
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
driver.get(mainurl.get(k).getAttribute("href").trim());  
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
//get all sub page url  
suburl = driver.findElements(By.tagName("a"));  

//get all sub page url  
for (int m = 0; m < suburl.size(); m++) {  
if (!(suburl.get(m).getText().trim().equals("")) && !(suburl.get(m).getText().trim() == null) && !(suburl.get(m).getAttribute("href").equals("")) && !(suburl.get(m).getAttribute("href") == null)) {  

if (!(uniqueurl.contains(suburl.get(m).getAttribute("href").trim()))) {  
uniqueurl.add(suburl.get(k).getAttribute("href").trim());  
//Print urls  
System.out.println(suburl.get(m).getAttribute("href"));  
         }  

     }  
 }  

		
		
	}

}}

*/


