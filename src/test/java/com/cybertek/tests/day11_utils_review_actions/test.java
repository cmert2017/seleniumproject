package com.cybertek.tests.day11_utils_review_actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

    @Test
    public void googleSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement searchElement = driver.findElement(By.xpath("    //input[@name='q']"));
        searchElement.sendKeys("hi");

    }
}
