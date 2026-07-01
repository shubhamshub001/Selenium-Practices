package basicPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KeyBoardAction {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        WebElement name = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        name.sendKeys("shubhamherwade33@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
        pass.sendKeys("Ojsmvcbztgfdsyga");
        driver.findElement(By.xpath("(//div[@role='none'])[1]")).click();
        WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));

        //String errorMessage = driver.findElement(By.xpath("//span[contains(.,'The email address or mobile number'')]")).getText();
        WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement error = w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,\"The email address or mobile number\")]")));

        System.out.println(error.getText());
        // String ActualErrorMessage = "The email address or mobile number you entered isn't connected to an account. ";
        /* System.out.println("Expected error message is " + error);*/


        driver.quit();
    }

}
