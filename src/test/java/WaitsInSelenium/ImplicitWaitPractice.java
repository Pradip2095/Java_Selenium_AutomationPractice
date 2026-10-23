package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitPractice {

    @Test
    public void implicitWaitTest() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("9766882167");
        driver.findElement(By.name("pass")).sendKeys("Facebook@123");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
