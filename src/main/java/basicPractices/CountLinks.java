package basicPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CountLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@value,'Google Search')])[2]")));
        /*//String s = w.getText();
        Thread.sleep(5000);
        System.out.println("Captured text is : " + s);*/

        List<WebElement> x = driver.findElements(By.tagName("a"));
        int links = x.size();
        System.out.println("Number of links available: " + links);

        for (WebElement x1 : x) {
            System.out.println(x1.getAttribute("href"));
        }
        driver.quit();
    }
}
