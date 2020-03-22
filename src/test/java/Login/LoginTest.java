package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.postman.com/");
        Thread.sleep(10000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("xxxxxxx);
        driver.findElement(By.id("password")).sendKeys("xxxxxx");
        driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();
        Thread.sleep(10000);
        driver.quit();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }
}
