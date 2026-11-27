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

        // 1. JS Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert simpleAlert = driver.switchTo().alert();

        System.out.println("Alert message: " + simpleAlert.getText());

        simpleAlert.accept();

        System.out.println("JS Alert accepted");

        // 2. JS Confirm
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert confirmAlert = driver.switchTo().alert();

        System.out.println("Confirm message: " + confirmAlert.getText());

        confirmAlert.dismiss(); // Click Cancel

        System.out.println("JS Confirm dismissed");

        // 3. JS Prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert promptAlert = driver.switchTo().alert();

        System.out.println("Prompt message: " + promptAlert.getText());

        promptAlert.sendKeys("Gowtham");

        promptAlert.accept();

        System.out.println("JS Prompt accepted");

        driver.quit();
    }
}
