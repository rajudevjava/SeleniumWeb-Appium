package TestngFiles;

import org.testng.annotations.Test;

public class Grouptst {

	

	@Test
	public void openBrowser(){
		System.out.println("Exicuting Test 2");
	}
	@Test(groups={"priority1"})
	public void Flightbooking (){
		System.out.println("Exicuting Test 1");
	}
	@Test(groups={"priority2"})
	public void Flightcancell (){
		System.out.println("Exicuting Test 1");
	}
	
	
}
