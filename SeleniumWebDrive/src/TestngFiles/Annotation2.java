package TestngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation2 {

	
	
	@BeforeSuite
	public void testing2()
	{
		System.out.println("First it will exicute");
	}
	
	@AfterSuite
	public void testafter()
	{
		System.out.println("It will exicute after all test");
	}
	
	
}
