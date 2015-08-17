import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class App_ContactManager {
	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{

		File app = new File("F:\\Whizdom-Trainings\\Tools\\Appium\\apps\\ContactManager.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("deviceName","Nexus 5");
         capabilities.setCapability("platformVersion", "4.4.4");
         capabilities.setCapability("platformName","Android");
	     capabilities.setCapability("app", app.getAbsolutePath());
         dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
         dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
         //dr.findElement(By.id("com.example.android.contactmanager:id/addContactButton")).click();
         
         //int s = dr.findElements(By.className("android.widget.Button")).size();
         //System.out.println(s);
         //dr.findElement(By.className("android.widget.Button")).click();
         
         // xpath -does not work
        // dr.findElement(By.xpath("//android.widget.Button[@id='com.example.android.contactmanager:id/contactList']")).click();
       //  int s=dr.findElements(By.xpath("//android.widget.Button[@id='com.example.android.contactmanager:id/contactList']")).size();
       //  System.out.println(s);
       //  dr.findElement(By.xpath("//android.widget.Button[text()='Add Contact']")).click();
         
         // UI Automator prop / functions
         // http://developer.android.com/tools/help/uiautomator/index.html#options
        // dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.example.android.contactmanager:id/addContactButton\")").click();
        // dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")").click();
         int s = dr.findElementsByAndroidUIAutomator("UiSelector().index(1)").size();
         System.out.println(s);
         dr.findElementByAndroidUIAutomator("UiSelector().text(\"Add Contact\")").click();;
         
         
         
         Thread.sleep(5000);
	}
	
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	}
}
