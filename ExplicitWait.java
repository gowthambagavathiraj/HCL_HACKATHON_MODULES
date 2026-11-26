package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.automationexercise.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//if the element is not found wait until the seconds
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Signup / Login")));
	
	
	WebElement loginButton = wait.until(
		    ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login"))
		);

		loginButton.click();
	
	
	
	driver.quit();

	}

}

