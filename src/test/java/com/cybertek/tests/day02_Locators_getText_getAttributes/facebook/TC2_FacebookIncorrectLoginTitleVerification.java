package com.cybertek.tests.day02_Locators_getText_getAttributes.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_FacebookIncorrectLoginTitleVerification {

    static WebDriver driver;

    public static void openChromeBrowser(){

        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        System.setProperty("webdriver.chromedriver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    public static void titleVerification(String expectedTitle, String actualTitle){

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification Failed");
            System.out.println("Expected title: " + expectedTitle);
            System.out.println("Actual title: " + actualTitle);
        }
    }


    public static void main(String[] args) throws InterruptedException {


        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("myUserName");

        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("myPassWord"+ Keys.TAB+Keys.ENTER);

        //4.1: Alternative way for Keys.Enter:  Click at the Log In button
       // driver.findElement(By.name("login")).click();


        // 5.Verify title changed to:
        // Expected: “Log into Facebook | Facebook”
        Thread.sleep(5000);
        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        titleVerification(expectedTitle, actualTitle);





    }
}
