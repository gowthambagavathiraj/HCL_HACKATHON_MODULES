package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	WebDriver driver;
	@Test(groups={"regression"})
	public void printingTheResults() {
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.findElement(By.id("firstname")).sendKeys("Gowtham");
		driver.findElement(By.id("lastname")).sendKeys("B");
		driver.findElement(By.id("username")).sendKeys("gowthamB");
		driver.findElement(By.id("password")).sendKeys("123456");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input"));
		ele.click();
		WebElement back=driver.findElement(By.linkText("Back to Login"));
		back.click();
	}
	}
