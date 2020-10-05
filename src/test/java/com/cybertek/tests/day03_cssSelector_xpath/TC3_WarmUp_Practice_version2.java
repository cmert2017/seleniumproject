package com.cybertek.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_WarmUp_Practice_version2 {
    static WebDriver driver;

    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void urlContainsVerification(String actualURL, String expectedinURL){
        if(actualURL.contains(expectedinURL)){
            System.out.println("URL contains com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("URL contains com.cybertek.extrapractice.test FAILED");
            System.out.println(actualURL);
            System.out.println(expectedinURL);
        }
    }

    public static void contentVerification(String actualContent, String expectedContent){
        if(actualContent.equalsIgnoreCase(expectedContent)){
            System.out.println("Content com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("Content com.cybertek.extrapractice.test FAILED");
            System.out.println(expectedContent);
            System.out.println(actualContent);
        }
    }


    public static void main(String[] args) {

        String url= "http://practice.cybertekschool.com/forgot_password";
        navigateTo(url);

        driver.findElement(By.name("email")).sendKeys("myemail@gmail.com"+ Keys.ENTER);

        String expectedinURL = "email_sent";
        String actualURL= driver.getCurrentUrl();
        urlContainsVerification(actualURL,expectedinURL);


        String expectedContent = "Your e-mail's been sent!";
        String actualContent = driver.findElement(By.name("confirmation_message")).getText();
        contentVerification(actualContent, expectedContent);

    }
}
