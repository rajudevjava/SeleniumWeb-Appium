package com.amazon.tests;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Draganddrop{

	
	// HOW TO DRAG AND DROP 
	
	
public static void main(String[] args){

//System.setProperty("webdriver.chrome.driver","C:\\Users\\Life's Good\\Desktop\\Testing\\chromedriver.exe");

String baseUrl="http://google.com";

//WebDriver driver=new ChromeDriver();

WebDriver driver=new FirefoxDriver();

driver.get(baseUrl);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

Actions act=new Actions(driver);

act.moveToElement(driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"))).build().perform();


act.keyDown(Keys.SHIFT).moveToElement(driver.findElement(By.xpath(".//*[@id='gs_htif0']"))).sendKeys("asdfghjkloute").build().perform();
act.contextClick(driver.findElement(By.xpath(".//*[@id='gs_htif0']"))).build().perform();

//WebElement drag1= driver.findElement(By.xpath(".//*[@id='_eEe']/a[1]"));// Draging hindi link

//WebElement drop1= driver.findElement(By.cssSelector("input[id='lst-ib']"));// Droping hindi link to search box

//act.dragAndDrop(drag1, drop1).build().perform();

//act.clickAndHold(drag1).moveToElement(drop1).release(drop1).build().perform();

}

}