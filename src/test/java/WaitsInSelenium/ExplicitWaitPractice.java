package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitPractice {

    @Test
    public void flipkartLoginTest() throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();

        //Explicit Wait object created
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
        driver.get("https://www.flipkart.com/login?");
        System.out.println("Page Title: " + driver.getTitle());

        //This line of code will wait for visibility of element by specified path.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']"))).sendKeys("1234546789");

        //Click on continue button on flipkart login page
        WebElement element = driver.findElement(By.xpath("//button[text()='Continue']"));
        element.click();

        Thread.sleep(5000);

        //Closing Browser after execution
        driver.close();

    }
}
