package com.cybertek.tests.day08_Alerts_Iframes_Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
//TC #4 : Iframe practice
//1. Create a new class called: IframePractice
//2. Create new com.cybertek.extrapractice.test and make set ups
//3. Go to: http://practice.cybertekschool.com/iframe
//4. Assert: "Your content goes here." Text is displayed.
//5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor
 */
public class IframePractice {


    WebDriver driver;

    @BeforeMethod
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }


    @Test
    public void  p4_Iframe_practice(){

        // 3 ways of locating and switching and IFRAME
        //1 - Byindex
        driver.switchTo().frame(0);

        //2 - By Id or NAme :  passing id attribute value
        driver.switchTo().frame("mce_0_ifr");



        //3 - By webElement
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElement);


        //locating paragraph
        WebElement expectedElement = driver.findElement(By.xpath("//p"));

        //Assert that the com.cybertek.extrapractice.test elemenet is dispalyed on the page
        Assert.assertTrue(expectedElement.isDisplayed());


    }

}
