package com.cybertek.tests.day07_webtables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();

        /*WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));


        WebDriver driver1 = new FirefoxDriver();

        driver1.get("http://www.google.com");

        driver1.findElement(By.xpath(""));
        driver1.findElement(By.xpath(""));
        driver1.findElement(By.xpath(""));
        driver1.findElement(By.xpath(""));
        driver1.findElement(By.xpath(""));
        driver1.findElement(By.xpath(""));
    */


        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver = new SafariDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.xpath(""));




    }

}
