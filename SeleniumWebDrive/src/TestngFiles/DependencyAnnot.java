package TestngFiles;

import org.testng.annotations.Test;

public class DependencyAnnot {
	

	@Test
	public void openBrowser(){
		System.out.println("Exicuting Test 2");
	}

	
	@Test(dependsOnMethods={"openBrowser"}, alwaysRun=true )
	public void Flightbooking (){
		System.out.println("Exicuting Test 1");
	}

	@Test(timeOut=5000)
	public void Timerelated(){
		System.out.println("if we want to skipp this  Test ");
	}
	
	
	@Test(enabled=false)
	public void iferror(){
		System.out.println("if we want to skipp this  Test ");
	}

	
	
	
}
