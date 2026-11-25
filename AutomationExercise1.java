package SeleniumStarter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercise1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("name")).sendKeys("Gowtham");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("privatecenter@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		WebElement rMr=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[1]/label"));
		rMr.click();
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		WebElement day=driver.findElement(By.id("days"));
		Select drop=new Select(day);
		drop.selectByVisibleText("18");
		
		WebElement month=driver.findElement(By.id("months"));
		Select drop1=new Select(month);
		drop1.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.id("years"));
		Select drop2=new Select(year);
		drop2.selectByVisibleText("2006");
		
		WebElement news=driver.findElement(By.xpath("//label[@for='newsletter']"));
		if(!(news.isSelected())){
			news.click();
		}
		
		WebElement op=driver.findElement(By.xpath("//label[@for='optin']"));
		if(!(op.isSelected())){
			op.click();
		}
		
		driver.findElement(By.id("first_name")).sendKeys("Gowtham");
		driver.findElement(By.id("last_name")).sendKeys("B");
		driver.findElement(By.id("company")).sendKeys("ABC Company");
		driver.findElement(By.id("address1")).sendKeys("Kollapatti"
				+ ", Oddanchatram");
		driver.findElement(By.id("address2")).sendKeys("Karudayampalayam"
				+ ", Karur");
		
		WebElement country=driver.findElement(By.id("country"));
		Select c1=new Select(country);
		c1.selectByVisibleText("Canada");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("city")).sendKeys("Dindigul");
		driver.findElement(By.id("zipcode")).sendKeys("624619");
		driver.findElement(By.id("mobile_number")).sendKeys("8675062180");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("privatecenter@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
