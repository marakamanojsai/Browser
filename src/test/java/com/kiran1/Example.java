package com.kiran1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Example {
    @Test
    public void test() {
        WebDriver driver;
        System.out.println("Welcome");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("9701803169");
        driver.findElement(By.id("pass")).sendKeys("kiran.456");
        driver.findElement(By.name("login")).click();

    }
}
