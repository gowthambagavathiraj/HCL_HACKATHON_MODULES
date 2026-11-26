package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testdojo.dev/elements/interactions?utm_source=chatgpt.com");
		//right click
		WebElement rclick=driver.findElement(By.id("interact-rightclick-target"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		//double click
		WebElement dclick=driver.findElement(By.id("interact-dblclick-btn"));
		act.doubleClick(dclick).perform();
		//drag and drop
		WebElement source=driver.findElement(By.id("interact-drag-item"));
		WebElement dest=driver.findElement(By.id("interact-drop-zone"));
		act.dragAndDrop(source, dest).perform();
		//hold for particular seconds
		WebElement hold=driver.findElement(By.id("interact-hold-btn"));
		act.clickAndHold(hold).pause(Duration.ofSeconds(2)).release().perform();
		//hover
		WebElement mouse=driver.findElement(By.id("interact-mouse-target"));
		act.moveToElement(mouse).perform();
		//scroll
		act.scrollByAmount(0, 500).perform();
		}

}
