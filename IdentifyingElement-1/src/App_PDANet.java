import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class App_PDANet {
	AndroidDriver dr;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{
		File app = new File("F:\\Whizdom-Trainings\\Tools\\Appium\\apps\\com.pdanet-1.apk");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nexus 5");
        capabilities.setCapability("platformVersion", "4.4.4");
        capabilities.setCapability("platformName","Android");
	     capabilities.setCapability("app", app.getAbsolutePath());
        dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        int s = dr.findElements(By.className("android.widget.CheckBox")).size();
        List<WebElement> checkBoxList = dr.findElements(By.className("android.widget.CheckBox"));
        System.out.println(checkBoxList.get(0).getAttribute("checked"));
        checkBoxList.get(0).click();
        System.out.println(s);
       // Thread.sleep(3000);
        // wait for checkbox to be selected
        checkBoxList = dr.findElements(By.className("android.widget.CheckBox"));
        WebDriverWait wait = new WebDriverWait(dr, 7);
        wait.pollingEvery(1, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkBoxList.get(0), true));
        for(WebElement checkBox: checkBoxList){
       // for(int i=0;i<checkBoxList.size();i++){
        //	WebElement checkBox = checkBoxList.get(i)
        	System.out.println(checkBox.getAttribute("checked"));
        }
        
        
        /*
        List<WebElement> checkableCheckboxes=dr.findElementsByAndroidUIAutomator("UiSelector().checkable(true)");
        System.out.println(checkableCheckboxes.size());
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.CheckBox\").instance(1).enbaled(true)").click();
        int s = dr.findElementsByAndroidUIAutomator("UiSelector().checked(true)").size();
        System.out.println(s); // 1
         */
        
        Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void quit(){
		if(dr!=null)
			dr.quit();
	}
}
