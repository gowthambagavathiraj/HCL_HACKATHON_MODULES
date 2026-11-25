package SeleniumStarter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        System.out.println("Chrome launched");

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        System.out.println("Website opened: " + driver.getTitle());

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        System.out.println("Button clicked");

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert message: " + alert.getText());

        alert.accept();

        driver.quit();
    }
}
