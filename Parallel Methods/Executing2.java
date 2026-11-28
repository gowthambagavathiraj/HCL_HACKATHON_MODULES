package Parallels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecutingParallel2 {
	WebDriver driver;
	
	@Test
	public void firefox() {
		driver=new FirefoxDriver();
		
	}
}
