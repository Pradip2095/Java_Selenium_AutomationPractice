package Window_Frame_And_Alert_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FrameHandling {


    public static void main(String[] args) throws InterruptedException {
        //Open Webdriver Instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open Url
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(3000);

        //switch to child window
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentHandle);
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("iframedemo");
        Thread.sleep(3000);

        //switch to parent window again
        driver.switchTo().window(parentHandle);
        System.out.println("Switched to parent window/frame again");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
        Thread.sleep(3000);
        driver.close();
    }

}
