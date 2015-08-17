package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovi {
	
	@BeforeTest

	public void beforelogin()

	{

	System.out.println("about to run facebooklogin test");

	}

	@Test(dataProvider = "getData")

	public void facebookLogin(String userid, String password)

	{

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanakadurga\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.facebook.com/");

	//loacting object by id attribute

	driver.findElement(By.id("email")).sendKeys(userid);

	//locating object by name attribute

	driver.findElement(By.name("pass")).sendKeys(password);

	driver.findElement(By.id("email")).clear();

	driver.findElement(By.name("pass")).clear();

	// driver.findElement(By.xpath("//input[@value ='Log In']")).click();

	}

	@DataProvider

	public Object[][] getData()

	{

	Object[][] parameter = new Object[2][2];

	parameter[0][0] ="subbuk@gmail.com";

	parameter[0][1] = "abackd";

	parameter[1][0] = "raju.dev@gmail.com";

	parameter[1][1] = "12345";

	return parameter;

	}

	}


