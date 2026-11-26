package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 500);");
		 
		 WebElement ele=driver.findElement(By.linkText("View Product"));
		 js.executeScript("arguments[0].click()", ele);
		 //scroll down
		 js.executeScript("window.scrollBy(0, 500);");
		 //scroll up
		 js.executeScript("window.scrollBy(0, -500)");
		 
		 //scroll top of the page
		 js.executeScript("window.scrollTo(0, 0)");
		 //Enter the text
		 WebElement textbox = driver.findElement(By.id("username"));
		 js.executeScript("arguments[0].value='Gowtham';", textbox);
	}

}
