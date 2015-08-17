import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProject {
public static void main(String[] args) {
	

	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://www.demo.guru99.com/V4/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.getTitle();

	  WebElement login = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
	  WebElement pass = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
	  login.clear();
	  login.sendKeys("mngr16731");
	  pass.sendKeys("UvajUje");
	  driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  
	
}
	
}
