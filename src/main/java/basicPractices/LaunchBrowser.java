package basicPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchBrowser {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String s = driver.getTitle();
        System.out.println("Title of the page is:" + s);
        driver.manage().window().maximize();
        driver.quit();
    }
}



