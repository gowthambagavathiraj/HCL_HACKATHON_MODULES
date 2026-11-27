package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMechanism {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.google.com");

	        WebElement searchBox = driver.findElement(By.name("A"));
	        searchBox.sendKeys("Selenium");

	        driver.quit();

	}

}
