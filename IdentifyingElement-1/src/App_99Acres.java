import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class App_99Acres {
	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{

		File app = new File("F:\\Whizdom-Trainings\\Tools\\Appium\\apps\\com.nnacres.app-1.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		// DesiredCapabilities capabilities =  DesiredCapabilities.android();
	      //  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	        capabilities.setCapability("deviceName","Nexus 5");
	        capabilities.setCapability("platformVersion", "4.4.4");
	        capabilities.setCapability("platformName","Android");
		   capabilities.setCapability("app", app.getAbsolutePath());
 
	       //capabilities.setCapability("appPackage", "com.google.android.apps.maps");
	       //capabilities.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		   // thread.sleep()
	       dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	       System.out.println(dr.getPageSource());
	       dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       dr.findElement(By.id("com.nnacres.app:id/selectCity")).click();
	       dr.findElement(By.id("com.nnacres.app:id/searchCity")).sendKeys("Delhi");
	       dr.hideKeyboard();
	       Thread.sleep(5000L);
	       		
	       
	       

	       
	       
	}
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	}

}
