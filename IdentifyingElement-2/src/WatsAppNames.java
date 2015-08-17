import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class WatsAppNames {
	AndroidDriver driver;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{

		File app = new File("F:\\Whizdom-Trainings\\Tools\\Appium\\apps\\com.whatsapp-2.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName","Nexus 5");
	        capabilities.setCapability("platformVersion", "4.4.4");
	        capabilities.setCapability("platformName","Android");
		    capabilities.setCapability("app", app.getAbsolutePath());
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    List<WebElement> headings = driver.findElements(By.id("com.whatsapp:id/conversations_row_contact_name"));
		    System.out.println(headings.size());
	       	Thread.sleep(5000);
	       	
	       	for(WebElement e : headings){
	       		System.out.println(e.getText());
	       		e.click();
	       		driver.sendKeyEvent(AndroidKeyCode.BACK);
	       		//
	       	}
	       	
	       	
	       	
	       	
	       
	}
	@AfterTest
	public void quit(){
		if(driver!=null)
			driver.quit();
	}

}
