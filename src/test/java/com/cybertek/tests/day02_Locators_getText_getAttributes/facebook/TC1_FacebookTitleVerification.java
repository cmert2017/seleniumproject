package com.cybertek.tests.day02_Locators_getText_getAttributes.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_FacebookTitleVerification {
    static WebDriver driver;

    public static void openChromeBrowser(){

        //TC #1: Facebook title verification
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

    public static void main(String[] args) {

        openChromeBrowser();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify title:
        // Expected: “Facebook -Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        titleVerification(expectedTitle, actualTitle);

        driver.close();






    }
}
