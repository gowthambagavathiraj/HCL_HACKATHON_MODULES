package Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingAnnotation {

	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTERMETHOD");
	}

	@Test
	public void testcase1() {
		System.out.println("Executing test 1");
	}


	@Test
	public void testcase2() {
		System.out.println("Executing test 2");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFOREMETHOD");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORECLASS");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AFTERCLASS");
	}
}
