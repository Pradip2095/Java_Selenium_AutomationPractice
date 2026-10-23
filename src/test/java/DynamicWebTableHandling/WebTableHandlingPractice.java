package DynamicWebTableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTableHandlingPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open web application of bse india
        driver.get("https://www.bseindia.com/markets");
        Thread.sleep(5000);
        //get list of elements from table
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='main-tab-container']//table//tbody//tr//td[1]"));

        //using for loop
//        for(int i = 0; i<elements.size(); i++){
//            String value = elements.get(i).getText().trim();
//            System.out.println(value);
//        }

        //using Iterator
        Iterator<WebElement> itr = elements.iterator();
        int row = 1;
        while (itr.hasNext()) {
            itr.next();
            System.out.println(
            driver.findElement(By.xpath("//div[@class='main-tab-container']//table//tbody//tr[" + row + "]//td[1]")).getText());

            row++;
        }

        driver.quit();

    }
}
