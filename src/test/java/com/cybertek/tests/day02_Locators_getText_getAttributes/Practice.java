package com.cybertek.tests.day02_Locators_getText_getAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        WebElement  h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        driver.close();

    }
}
