package DatasProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterXml {

    WebDriver driver;

    @Test
    @Parameters({"username", "password"})
    public void parameter(String username, String password) {

        driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.quit();
    }
}
