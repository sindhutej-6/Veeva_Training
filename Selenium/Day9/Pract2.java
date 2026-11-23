package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pract2 {
    public void firsttask(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.findElement(By.linkText("Login")).click();
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,200)");
        WebElement rollno =  driver.findElement(By.name("roll_no"));
        rollno.sendKeys("24A95A6109");
        System.out.println(rollno.getAttribute("value"));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Teja");
        String pass_val = password.getAttribute("Value");
        assertEquals(pass_val,"Teja");
        //isDisplayed
        if (rollno.isDisplayed()){
            System.out.println(rollno.getText());
        }
        else {
            System.out.println("Not given");
        }
        driver.quit();
    }
    public void secondtask() throws InterruptedException {
        //isSelected
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://qapracticehub.com");
        driver1.findElement(By.linkText("Selection")).click();
        WebElement r1 = driver1.findElement(By.id("gender-male"));
        System.out.println("Before Selecting the option: "+r1.isSelected());
        r1.click();
        System.out.println("After Selecting the option: "+r1.isSelected());
        Thread.sleep(5000);
        driver1.quit();

    }
    public void thirdtask(){
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://qapracticehub.com");
        driver1.findElement(By.linkText("Inputs")).click();
        System.out.println(driver1.findElement(By.id("text-input")).isEnabled());
        driver1.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Pract2 p2 = new Pract2();
        p2.firsttask();
        p2.secondtask();
        p2.thirdtask();






    }
}
