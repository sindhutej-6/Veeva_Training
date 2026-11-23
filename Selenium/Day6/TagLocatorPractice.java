package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocatorPractice {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement ele = driver.findElement(By.tagName("H1"));
        System.out.println(ele.getText());
        WebElement ele2  = driver.findElement(By.tagName("H2"));
        System.out.println(ele2.getText());
        WebElement ele3 = driver.findElement(By.tagName("INPUT"));
        System.out.println(ele3.getAttribute("placeholder"));
        
    }
}
