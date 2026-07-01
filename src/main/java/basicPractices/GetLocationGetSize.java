package basicPractices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetLocationGetSize {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/free-online-trial");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'FirstName')]")));
        //WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(6));
        Thread.sleep(3000);
        w.sendKeys("shuabhm.herwade@coforge.com");

        //to get the size of the element
        Dimension s = w.getSize();
        int h = s.getHeight();
        int v = s.getWidth();

        System.out.println("height of the element is :" + h);
        System.out.println("width of the element is:" + v);

        //to get the location of the element x-axis and y-axis
        Point l = w.getLocation();
        int x = l.getX();
        int y = l.getY();

        System.out.println("x-axis:" + x);
        System.out.println("y-axis:" + y);

        driver.quit();


    }
}
