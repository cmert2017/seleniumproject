package com.cybertek.extrapractice.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {


    public static void main(String[] args) throws InterruptedException {
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.navigate().to("http://zero.webappsecurity.com/login.html");

        Thread.sleep(1000);
        // 3.Enter username: username
        driver.findElement(By.tagName("input")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.name("user_password")).sendKeys("password" + Keys.ENTER);
        Thread.sleep(1000);
        // 5.Verify title changed to:
        String actualTitle = driver.getTitle();
       // String expectedTitle = "Zero - Account Summary";
        String expectedTitle = "Zero –Account Summary";

        // Expected: “Zero –Account Summary”
        Thread.sleep(1000);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");


        }
    }
}
