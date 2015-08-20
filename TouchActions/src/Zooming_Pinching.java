import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Zooming_Pinching {
	
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
	
	AndroidDriver android=(AndroidDriver)driver;
	
	android.zoom(500,800);
	android.zoom(500,800);
	android.zoom(500,800);
	
	android.pinch(500,800);

}}
