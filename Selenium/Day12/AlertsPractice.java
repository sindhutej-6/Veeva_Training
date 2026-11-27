package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //alert box
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
        WebElement res =  driver.findElement(By.id("result"));
        System.out.println(res.getText());

        //confirmation box - accept(ok)
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(res.getText());
        //confirmation box - dismiss(cancel)
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(res.getText());

        //prompt box
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.sendKeys("Automation with selenium-java");
        alert.accept();
        System.out.println(res.getText());

        driver.quit();

    }
}
