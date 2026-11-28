package DatasProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	WebDriver driver;
	@Test(dataProvider="login")
	public void setTheData(String name,String pass) {
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		driver.findElement(By.id("email"+name));
		driver.findElement(By.id("password"+pass));
	}
	
	@DataProvider(name="login")
	public Object[][] demoData() {
		return new Object[][]{
			{"Gowtham","12345678"},
			{"Ganesh","12345"},
		};
	}
}
