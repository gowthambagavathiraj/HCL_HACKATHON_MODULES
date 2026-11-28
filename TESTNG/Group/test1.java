package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

    WebDriver driver;

    @Test(priority = 1 , groups={"smoke"})
    public void openPage() {
        driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

        String heading = driver.getTitle();

        Assert.assertEquals(heading, "Selenium Practice - Register");
    }

    @Test(priority = 2, groups={"smoke"})
    public void checkingTheFname() {
        String fname = driver.findElement(By.id("firstname"))
                .getAttribute("placeholder");

        Assert.assertEquals(fname, "First Name");
    }

    @Test(priority = 3, groups={"smoke"})
    public void checkingTheLname() {
        String lname = driver.findElement(By.id("lastname"))
                .getAttribute("placeholder");

        Assert.assertEquals(lname, "lastname");
    }

    @Test(priority = 4, groups={"smoke"})
    public void checkingTheUser() {
        String username = driver.findElement(By.id("username"))
                .getAttribute("placeholder");

        Assert.assertEquals(username, "UserName");
    }

    @Test(priority = 5, groups={"smoke"})
    public void checkingThePass() {
        String password = driver.findElement(By.id("password"))
                .getAttribute("placeholder");

        Assert.assertEquals(password, "Password");
    }
}
