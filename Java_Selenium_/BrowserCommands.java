package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		String text=driver.getPageSource();
		System.out.println("Source -- "+text);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title -- "+driver.getTitle());
		driver.close();
		

	}

}
