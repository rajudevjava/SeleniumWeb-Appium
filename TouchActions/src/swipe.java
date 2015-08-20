import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class swipe {
	AndroidDriver driver;
	String contact = "sksksls";
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
	
	List<WebElement> subbu = driver.findElements(By.id("----"));
	
	//for(WebElement raj:subbu){
		//System.out.println(raj.getText());
		
	//}
	
	//android.swipe(startx, starty, endx, endy, duration);
	WebElement lastElement = subbu.get(subbu.size()-1);
	int x = lastElement.getLocation().x;
	int y = lastElement.getLocation().y;
	while(isfrnd(subbu)){
		
	
	android.swipe(x, y, x, y-200, 2000);
	}
	
	WebElement e = driver.findElement(By.xpath("id.....[@text='"+contact+"']"));
	//e.click();
	TouchAction act = new TouchAction((MobileDriver)driver);
	act.tap(e).perform();
	
	
	}
	
	public boolean isfrnd(List<WebElement>subbu){
	for(WebElement raj:subbu){
	if(raj.getText().equals(contact))
		return true;
			
			
		//}
	}
	
	return false;}

}