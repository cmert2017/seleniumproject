package com.cybertek.tests.day08_Alerts_Iframes_Windows;

import com.cybertek.utilities.BrowserUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. V erify “Y ou successfuly clicked an alert” text is displayed.
 */
public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }


    @Test
    public void p1_information_alert_practice(){

        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        warningAlertButton.click();

        Alert alert = driver.switchTo().alert();

        BrowserUtilities.wait(3);
        alert.accept();

        //verification of confirmation
        WebElement verificationTextElement = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(verificationTextElement.isDisplayed(),"REsult text is not displayed");

    }


    @Test
    public void p1_information_confirm_practice(){

        WebElement confirmAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmAlertButton.click();

        Alert alert = driver.switchTo().alert();

        BrowserUtilities.wait(3);
        //we can either accept or dismiss

        alert.accept();
        //alert.dismiss();


        //locating the result text
        WebElement resultMessage = driver.findElement(By.xpath("result"));

        // Assert
        Assert.assertTrue(resultMessage.isDisplayed(),"Text is not displayed. Verification FAILED ");



    }


}
