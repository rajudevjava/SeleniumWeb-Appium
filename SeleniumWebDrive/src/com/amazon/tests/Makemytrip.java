package com.amazon.tests;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Makemytrip {

public static void main(String[] args) throws InterruptedException {

// THERE ARE SOME FUNCTIONS LIKE (ISDISPLAYED,ISSELECTED,ISENABLED THESE ALL BOOLEAN STATEMENTS YOU WILL KNOW WHTHERE THAT IS DISPALYED OR NOT IN A SINGLE SYNTAX 

WebDriver driver=new FirefoxDriver();

//Is displayed is used when particular object is in code base but it is in visible mode or not

driver.get("http://www.makemytrip.com/");

driver.findElement(By.id("from_typeahead1")).sendKeys("h");
driver.findElement(By.xpath(".//*[@id='one_round_default']/div/div[1]/div/div[1]/span/span/div[1]/span/div/p")).click();
driver.findElement(By.id("to_typeahead1")).sendKeys("b");
driver.findElement(By.xpath(".//*[@id='one_round_default']/div/div[3]/div/div[1]/span/span/div[1]/span/div[1]/p")).click();
driver.findElement(By.id("start_date_sec")).click();
Thread.sleep(2000);

List<WebElement> subbu = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[3]"));
for(WebElement sr : subbu){
	 System.out.println(sr.getText());
}

//ssss


	}

}
