package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitPractice {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/login?");
        System.out.println("Page Title: " + driver.getTitle());

        //Fluent Wait.
        FluentWait fwait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class)
                .withMessage("this is fluent wait.");

        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("0123456789");

        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));

        //Click on continue button on flipkart login page
        fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
        WebElement element = driver.findElement(By.xpath("//button[text()='Continue']"));
        element.click();

        //Closing Browser after execution
        driver.quit();
    }



}
