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
import io.appium.java_client.ios.IOSDriver;

public class TouchActionclick {
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
	driver.findElement(By.xpath("//UIANavigationBar[@name='UIView']/UIAButton[1]")).click();
	
	WebElement e = driver.findElement(By.xpath("id.....[@text='......']"));
	//e.click();
	TouchAction act = new TouchAction((MobileDriver)driver);
	//act.tap(e).perform();
	//act.longPress(e).perform();
	//act.press(e);
	//act.longPress(e).waitAction(500).perform();
	act.press(e).waitAction(500).perform();
	
	
	
	
	
}}
