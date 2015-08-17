package com.amazon.tests;

import java.util.ArrayList;  
import java.util.List;  
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
  
  
public class GetallURLS {  
  
    static WebDriver driver;  
  
    static List<WebElement> mainurl, suburl;  
    static List<String> uniqueurl;  
  
    public static void main(String[] a) throws InterruptedException {  
        // Initialize Firefox driver   
        driver = new FirefoxDriver();  
        //Maximize browser window   
        driver.manage().window().maximize();  
  
        String websiteaddress = "http://www.google.com";  
        //Go to website    
        uniqueurl = new ArrayList();  
        driver.get(websiteaddress);  
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        //get all url of page  
        mainurl = driver.findElements(By.tagName("a"));  
  
for (int k = 0; k < mainurl.size(); k++) {  
            // check url not null, empty and only current website   
            if (!(mainurl.get(k).getText().trim().equals("")) && !(mainurl.get(k).getText().trim() == null) && !(mainurl.get(k).getAttribute("href").trim() == null) && !(mainurl.get(k).getAttribute("href").trim().equals("")) && (mainurl.get(k).getAttribute("href").contains("google.com")) && !(mainurl.get(k).getAttribute("href").contains("@"))) {  
  
       if (!(uniqueurl.contains(mainurl.get(k).getAttribute("href").trim()))) {  
   uniqueurl.add(mainurl.get(k).getAttribute("href").trim());  
//Print urls  
 System.out.println(mainurl.get(k).getAttribute("href"));  
  
                    // Open new tab  
  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
  driver.get(mainurl.get(k).getAttribute("href").trim());  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
// get all sub page url  
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
  // close open tab  
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");  
// Move default window  
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
driver.switchTo().defaultContent();  
                    Thread.sleep(7000);  
  
                }  
            }  
        }  
        driver.quit();  
    }  
  
}  