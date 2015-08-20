package com.amazon.tests;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SouceLabTest {
	@Test
public void setup() throws MalformedURLException
{
	DesiredCapabilities dc= DesiredCapabilities.firefox();
	dc.setCapability("version", "5");
	dc.setCapability("platform", "XP");

WebDriver driver = new RemoteWebDriver(
                new URL("http://raju.devjava:ced38344-fc2b-4129-a325-cd163f8c0b9d@ondemand.saucelabs.com:80/wd/hub"),
                dc);

driver.get("http://ebay.com");
System.out.println(driver.getTitle());

	
	
}   //http://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub
	
	//http://raju.devjava:ced38344-fc2b-4129-a325-cd163f8c0b9d@ondemand.saucelabs.com:80/wd/hub
}