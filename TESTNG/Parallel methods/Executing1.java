package Parallels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Executing {
	WebDriver driver;
	@Test
	public void chrome() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void edge() {
		driver=new EdgeDriver();
	}
	
	
	
}
