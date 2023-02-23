package com.kiran1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exp4 {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.get("https://www.google.com/");

        // Locate the search box using an absolute path
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));


        searchBox.sendKeys("What is meant by Selenium");

        // Submit the search
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchButton.click();

        searchBox = driver.findElement(By.xpath("//input[@name='q']"));


        searchBox.sendKeys(" what is selenium");


        searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
        searchButton.click();


    }

}

