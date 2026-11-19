
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class ThirdDay {
    static WebDriver driver;                                   // current browser
    static List<WebDriver> allDrivers = new ArrayList<>();     // keeps every opened browser

    public static void main(String[] args) throws InterruptedException {
        chrome_method();
    }

    static void chrome_method() throws InterruptedException {
        driver = new ChromeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        edge_method();
        firefox_method();
        stopping_method();
    }

    static void edge_method() throws InterruptedException {
        driver = new EdgeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void firefox_method() throws InterruptedException {
        driver = new FirefoxDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void stopping_method() {
        for (WebDriver d : allDrivers) {
            d.quit();
        }
        allDrivers.clear();
    }
}

