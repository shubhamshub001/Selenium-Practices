package basicPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SingleCheckBox {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
        driver.findElement(By.xpath("(//span[@class='rc-tree-switcher rc-tree-switcher_close'])[1]")).click();
        driver.findElement(By.xpath("//span[@aria-label='Select Notes']")).click();
        Thread.sleep(5000);


        class screenShot(WebDriver driver, String fileName) {

            //take screenshot of entire page
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            //To save screenshot
            File dest = new File("D:\\SHUBHAM" + fileName + ".png");
            // FileUtils.copyFile(src, dest);

        }
    }
}


//tomato, onion, curryleaves, coriander, tordaal, sambar-powder, rice, drumstick.