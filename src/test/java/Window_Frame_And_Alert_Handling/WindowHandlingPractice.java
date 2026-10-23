package Window_Frame_And_Alert_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandlingPractice {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Windows.html");
        //driver.findElement(By.partialLinkText("Open New Tabbed Windows ")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();

        String parentWindow = driver.getWindowHandle();
        Set<String> listOfWindows = driver.getWindowHandles();

        Iterator itr = listOfWindows.iterator();
        while(itr.hasNext()){
            String childWindow = itr.next().toString();
            if(!childWindow.equals(parentWindow)){
                driver.switchTo().window(childWindow);
                System.out.println("Page Title: " + driver.getTitle());
                driver.findElement(By.xpath("//h2[text()='Getting Started']")).isDisplayed();
                driver.switchTo().window(parentWindow);
                String test = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText().trim();
                Assert.assertEquals(test, "Automation Demo Site");
                driver.quit();
            }
        }
    }
}
