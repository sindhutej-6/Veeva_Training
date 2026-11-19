
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDay {

    public static void main(String[] args) throws InterruptedException {

        // 1. Setup the driver automatically
        WebDriverManager.chromedriver().setup();

        // 2. Open the Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Go to the university website
        driver.get("https://maya.adityauniversity.in/");

        // 4. Make the browser window full screen (Best Practice)
        driver.manage().window().maximize();

        // 5. Wait for 3 seconds to let the page load
        Thread.sleep(3000);

        // 6. Find the "Login" link by its exact text and click it
        driver.findElement(By.xpath("//a[.='Login']")).click();

        // 7. Wait for 4 seconds for the login page/form to appear
        Thread.sleep(4000);

        // 8. Scroll down the page using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        // 9. Wait for 2 seconds
        Thread.sleep(2000);

        // 10. Find the Roll Number field by its 'name' attribute and click it (to focus) and enter rollnumber
        WebElement RollNumValue = driver.findElement(By.name("roll_no"));
        RollNumValue.click();
        RollNumValue.sendKeys("24A95A6109");

        // 11. Wait for 10 seconds
        Thread.sleep(10000);

        // 12. Find the Password field by its 'name' attribute and type "Abc"
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc");

        // 13. Always close the browser at the end to free up computer memory!
        driver.quit();
    }
}
