package TestNG;
import org.testng.annotations.Test;

public class LoginPage {

	/*
	 * TestNG:
	 * its a unit testing framework
	 * Test Next Generation
	 * prior to TestNG, we had JUnit
	 * 
	 * It will generate a report
	 * 
	 * it comes with various annotations
	 * Reports
	 * Priority
	 * Dependency
	 * Grouping of TC
	 * Data Provider
	 * Assertions
	 * 
	 * 
	 * 
	 * while adding annotation
	 * error:
	 * add TestNG library
	 * then Import Test
	 */
	
	@Test(groups = "android")
	public void android1() {
		System.out.println("this belong to group android");
		
	}	
	@Test(groups = "android")
	public void android2() {
		System.out.println("this belong to group android");
		
	}
	@Test(groups = "ios")
	public void ios1() {
		System.out.println("this belong to group ios");

	}
	@Test(groups = "ios")
	public void ios2() {
		System.out.println("this belong to group ios");

	}
	@Test(groups = "android")
	public void android3() {
		System.out.println("this belong to group android");

	}
	@Test(groups = "linux")
	public void linux1() {
		System.out.println("this belong to group linux");
	
	}

	}