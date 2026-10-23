package DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownPractice {


    /* Methods To Select Element
     * getByIndex()
     * getByValue()
     * getByVisibleText()
     */
    public static void main(String[] args) throws InterruptedException {
        //Open Webdriver Instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open Facebook login page
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        //Open create new account link
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();

        //Select day from dropdown
        WebElement day = driver.findElement(By.xpath("//span[text()='Day']"));
        Select select = new Select(day);
        select.selectByVisibleText("4");
        Thread.sleep(5000);

    }
}
