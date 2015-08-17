package TestngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void useridgenerator(){
		System.out.println("This block exicute Before each test");
	
	}
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block exicute Before all testcase");
		
	}
	
	@AfterTest
	public void cokkiesclose(){
		System.out.println("This block exicute after all testcase");
	}
	
	@AfterMethod
	public void ReportAdding(){
		System.out.println("This block exicute after each test");
	}
	
	@Test
	public void openBrowser(){
		System.out.println("Exicuting Test 2");
	}

	
	@Test
	public void Flightbooking (){
		System.out.println("Exicuting Test 1");
	}
	
	
	
	
}
