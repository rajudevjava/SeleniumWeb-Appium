import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.WinUser.LASTINPUTINFO;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TouchEvents {

	AndroidDriver driver;
	@Test
	public void launchApp() throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformVersion", "8.1");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("deviceName", "iPhone 5s");
		File app = new File(System.getProperty("user.dir")+"//app/UICatalog.app");
		cap.setCapability("app", app.getAbsolutePath());
		
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.findElements(By.id("----")).get(0);
	List<WebElement> dragSections = driver.findElements(By.id(""));
	List<WebElement> allnames = driver.findElements(By.id(""));
	WebElement e1=dragSections.get(0);
	WebElement e2=dragSections.get(3);
	
	
	WebElement LastElement=dragSections.get(dragSections.size()-1);
	
	
	
	
	
	for(WebElement name:allnames){
		System.out.println(name.getText());
		
	}
	
	TouchAction act = new TouchAction((MobileDriver)driver);
	act.longPress(e1).moveTo(e2).release().perform();
	
	System.out.println("--------------");
	
	//update list 
	for (WebElement name:allnames){
		System.out.println(name.getText());
	}
	
	
	
	LastElement=dragSections.get(dragSections.size()-1);
	int x = LastElement.getLocation().x;
	int y = LastElement.getLocation().y;
	
	while(true){
		String topElement = allnames.get(0).getText();
		act.longPress(LastElement).moveTo(x,y+100).release().perform();
		String newTopElement = allnames.get(0).getText();
		if(newTopElement.equals(topElement))
			break;
	}
	
	
	
	
	
	}

}
