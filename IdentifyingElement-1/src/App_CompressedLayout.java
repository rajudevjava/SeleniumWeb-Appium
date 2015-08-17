import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class App_CompressedLayout {
	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{

		File app = new File("F:\\Whizdom-Trainings\\Tools\\Appium\\apps\\com.qihoo.security-1.apk");
		    DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName","Nexus 5");
	        capabilities.setCapability("platformVersion", "4.4.4");
	        capabilities.setCapability("platformName","Android");
		    capabilities.setCapability("app", app.getAbsolutePath());
 
	    
		   // thread.sleep()
	       dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	       dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       //dr.findElement(By.id("com.qihoo.security:id/main_appbox_btn")).click();
	       //dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.qihoo.security:id/main_appbox_btn\")");
	       //dr.findElement(By.xpath("//android.widget.Button[@id='com.qihoo.security:id/main_appbox_btn']"));
	       List<WebElement> buttons = dr.findElements(By.xpath("//android.widget.Button"));
	       System.out.println("Total = "+buttons.size());
	       for(WebElement button:buttons){
	    	   System.out.println(button.getText());
	       }
	       //xxxxx Phone Cleaner xxxxx
	       // Phone Cleaner XXXXXXXXX
	       //XXXXXX Phone Cleaner
	       dr.findElement(By.xpath("//android.widget.Button[contains(@text,'Phone Cleaner')]"));
	      // dr.findElement(By.xpath("//android.widget.Button[contains(@id,'com.qihoo.security:id/main_appbox_btn')]"));
	       
	       Thread.sleep(5000L);
	       		
	       
	       

	       
	       
	}
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	}
}
