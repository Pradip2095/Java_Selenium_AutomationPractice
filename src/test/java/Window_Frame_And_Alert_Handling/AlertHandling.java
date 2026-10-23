package Window_Frame_And_Alert_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertHandling {

    public static void main(String[] args) throws InterruptedException {

        //Open Webdriver Instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open Url
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //Generate Alert using alter button
        driver.findElement(By.id("alertBox")).click();

        //Alter class to handle Alert
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert Text: " + text);
        Thread.sleep(3000);
        alert.accept();

        //close window
        driver.quit();
    }
}
