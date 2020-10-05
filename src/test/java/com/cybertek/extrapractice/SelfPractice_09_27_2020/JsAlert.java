package com.cybertek.extrapractice.SelfPractice_09_27_2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JsAlert {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }


    @Test
    public void jsAlert_practice() throws InterruptedException {

        WebElement promtAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promtAlertButton.click();

        Alert alert = driver.switchTo().alert();


        Thread.sleep(3000);
        alert.sendKeys("hello");

        Thread.sleep(3000);
        alert.accept();

        //verification of confirmation
        WebElement verificationTextElement = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(verificationTextElement.isDisplayed(),"REsult text is not displayed");

    }



}
