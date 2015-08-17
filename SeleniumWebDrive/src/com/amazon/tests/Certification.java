package com.amazon.tests;

import java.util.concurrent.TimeUnit;



// WHEN YOU GET CERTIFICATE POPUP SOME THING LIKE THAT HOW TO RESPOND 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Certification {

	public static void main(String[] args) {
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver driver = new FirefoxDriver(prof);
		
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getTitle();
		
		
		

	}

}
