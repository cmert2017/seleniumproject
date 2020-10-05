package com.cybertek.tests.day02_Locators_getText_getAttributes.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_FacebookHeaderVerification {

    static WebDriver driver;

    public static void openChromeBrowser(){

        // TC #3: Facebook header verification
        // 1.Open Chrome browser
        System.setProperty("webdriver.chromedriver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void headerVerification(String expectedTitle, String actualTitle){

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Header verification PASSED");
        }else{
            System.out.println("Header verification Failed");
            System.out.println("Expected header: " + expectedTitle);
            System.out.println("Actual header: " + actualTitle);
        }
    }

    public static void main(String[] args) {

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify header text is as expected:
        // Expected: “Connect with friends and the world around you on Facebook."
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.className("_8eso")).getText();


        headerVerification(expectedHeader, actualHeader);




    }
}
