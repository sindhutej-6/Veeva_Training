package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SingleWindowTabPractice {
    public void singlewindowhandling(WebDriver driver, String ParentWindowId) throws InterruptedException {
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String h:windowHandles){
            if(!h.equals(ParentWindowId)){
                driver.switchTo().window(h).manage().window().maximize();
                driver.findElement(By.id("firstName")).sendKeys("Tejaswi");
                Thread.sleep(3000);
                driver.findElement(By.id("lastName")).sendKeys("Kalisetti");
                Thread.sleep(3000);
                driver.findElement(By.id("femalerb")).click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,300)");

                driver.findElement(By.id("englishchbx")).click();
                driver.findElement(By.id("registerbtn")).click();
                System.out.println(driver.findElement(By.id("msg")).getText());
                driver.close();
            }
        }

    }
    public void singletabhandling(WebDriver driver,String ParentWindowId) throws InterruptedException {
        driver.findElement(By.id("newTabBtn")).click();
        Set<String> WindowHandles = driver.getWindowHandles();
        for(String h:WindowHandles){
            if(!h.equals(ParentWindowId)){
                driver.switchTo().window(h).manage().window().maximize();
                System.out.println("The Child ID: "+h);
                driver.findElement(By.id("alertBox")).click();
                Alert alert = driver.switchTo().alert();
                System.out.println("Alert message: "+alert.getText());
                alert.accept();
                System.out.println(driver.findElement(By.id("output")).getText());
                driver.close();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        String ParentWindowId = driver.getWindowHandle();
        //single tab
        SingleWindowTabPractice ob1 = new SingleWindowTabPractice();
        ob1.singletabhandling(driver,ParentWindowId);
        driver.switchTo().window(ParentWindowId);
        System.out.println("The Parent window Id: "+driver.getWindowHandle());
        driver.findElement(By.id("name")).sendKeys("TejaswiKalisetti");
        Thread.sleep(3000);

        //singlewindow
        ob1.singlewindowhandling(driver,ParentWindowId);
        driver.switchTo().window(ParentWindowId);
        System.out.println("The Parent window Id: "+driver.getWindowHandle());
        driver.findElement(By.id("name")).sendKeys("TejaswiKalisetti");
        Thread.sleep(3000);


        driver.quit();
    }
}
