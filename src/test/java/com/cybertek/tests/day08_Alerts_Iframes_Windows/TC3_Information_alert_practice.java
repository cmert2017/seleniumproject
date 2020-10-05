package com.cybertek.tests.day08_Alerts_Iframes_Windows;
/*
Open browser
2.Go to website: http://practice.cybertekschool.com/javascript_alerts
3.Click to “Click for JS Prompt” button
4.Send “hello”text to alert
5.Click to OK button from the alert
6.Verify “You entered:  hello” text is displayed.


 */

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

public class TC3_Information_alert_practice {

    WebDriver driver;

    @BeforeMethod
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }


    @Test
    public void  Alert_Test(){


        WebElement promptAlertElement = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

        promptAlertElement.click();

        Alert alert =  driver.switchTo().alert();
        driver.switchTo().window("");

        alert.sendKeys("hello");
        alert.accept();

        WebElement textMessageElement = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "You entered: hello";
        String actualText = textMessageElement.getText();

        Assert.assertEquals(actualText,expectedText);
    }
}
