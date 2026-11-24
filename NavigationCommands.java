import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Navigate to YouTube
        driver.navigate().to("https://www.youtube.com");

        // Go back
        driver.navigate().back();

        // Go forward
        driver.navigate().forward();

        // Refresh page
        driver.navigate().refresh();

        driver.quit();
    }
}
