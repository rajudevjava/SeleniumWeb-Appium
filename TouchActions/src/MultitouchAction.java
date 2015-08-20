import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultitouchAction {

	AndroidDriver driver;
	@Test
	public void launchApp1() throws MalformedURLException{
		
		
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platformVersion", "8.1");
    cap.setCapability("platformName", "iOS");
    cap.setCapability("deviceName", "iPhone 5s");
	File app = new File(System.getProperty("user.dir")+"//app/UICatalog.app");
	cap.setCapability("app", app.getAbsolutePath());
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	
	WebElement img = driver.findElement(By.xpath(""));
	System.out.println(img.getLocation().x);
	System.out.println(img.getLocation().y);
	int ceneterX = img.getLocation().x+ (img.getSize().width/2);

	int ceneterY = img.getLocation().x+ (img.getSize().height/2);
	
	System.out.println(centerX+"-----"+ceneterY);
	
	
	MultitouchAction multi =  new MultitouchAction((MobileDriver)driver);
	
	TouchAction act1 =new TouchAction((MobileDriver)driver);
	act1.press(ceneterX, ceneterY-10).moveTo(ceneterX, ceneterY-200).release();
	TouchAction act2 =new TouchAction((MobileDriver)driver);
	act1.press(ceneterX, ceneterY+10).moveTo(ceneterX, ceneterY+200).release();
	
	multi.addact1().add(act2).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}