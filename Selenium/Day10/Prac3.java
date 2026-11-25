package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Prac3 {
    public void singleSelect(WebDriver driver) throws InterruptedException {
        WebElement dropdownele = driver.findElement(By.id("course"));
        Select selectdropdownEle = new Select(dropdownele);
        List<WebElement> options =  selectdropdownEle.getOptions();
        for(WebElement option : options){
            System.out.println(option.getText());
        }
        selectdropdownEle.selectByValue("java");
        selectdropdownEle.selectByIndex(2);
        selectdropdownEle.selectByVisibleText("Python");
        WebElement selectedOption = selectdropdownEle.getFirstSelectedOption();
        System.out.println("The Selected Text is: "+selectedOption.getText());

        Thread.sleep(6000);
    }

    public void multiSelect(WebDriver driver) throws InterruptedException {
        WebElement multiDropDownEle = driver.findElement(By.id("ide"));
        Select selectMultiOptions = new Select(multiDropDownEle);
        List<WebElement> list = selectMultiOptions.getOptions();
        //printing all available options on console
        System.out.println("The Available Options are:");
        for(WebElement option: list){
            System.out.println(option.getText());
        }
        // select multiple options
        selectMultiOptions.selectByValue("vs");
        selectMultiOptions.selectByVisibleText("Eclipse");
        selectMultiOptions.selectByIndex(3);

        //printing all selected options on console
        List<WebElement> selectOptions = selectMultiOptions.getAllSelectedOptions();
        System.out.println("The selected options are:");
        for(WebElement option:selectOptions){
            System.out.println(option.getText());
        }

        //now deselecting the options one by one or we can deselect all at once using deselectAll();
        selectMultiOptions.deselectByVisibleText("Eclipse");
        selectMultiOptions.deselectByValue("vs");
        selectMultiOptions.deselectByIndex(3);
       //selectMultiOptions.deselectAll();
        Thread.sleep(8000);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Prac3 single = new Prac3();
        single.singleSelect(driver);
        Prac3 multi = new Prac3();
        multi.multiSelect(driver);
        driver.quit();
    }
}
