package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://leetcode.com/accounts/login/");
        driver.findElement(By.name("username")).sendKeys("24A95A6109");
        driver.findElement(By.name("password")).sendKeys("24A95A6109");

        driver.navigate().to("https://demoqa.com/elements");
        driver.findElement(By.linkText("Buttons")).click();
        driver.findElement(By.id("doubleClickBtn")).click();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}
