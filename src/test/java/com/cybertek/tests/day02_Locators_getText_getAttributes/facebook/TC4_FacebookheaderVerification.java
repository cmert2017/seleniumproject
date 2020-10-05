package com.cybertek.tests.day02_Locators_getText_getAttributes.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_FacebookheaderVerification {

    static WebDriver driver;

    public static void openChromeBrowser(){

        // TC #4: Facebook header verification
        // 1.Open Chrome browser
        System.setProperty("webdriver.chromedriver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void hrefValueContains(String expectedInHref, String actualHref){

        if(actualHref.contains(expectedInHref)){
            System.out.println("InHrefValue verification PASSED");
        }else{
            System.out.println("InHrefValue verification  Failed");
            System.out.println("ExpectedInHrefValue: " + expectedInHref);
            System.out.println("ActualHrefValue: " + actualHref);
        }
    }

    public static void main(String[] args) {


        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify “Create a page” link href value contains text:
        // Expected: “registration_form”

       String expectedInHrefValue = "registration_form";
       String actualHrefValue = driver.findElement(By.linkText("Create a Page")).getAttribute("href");

       hrefValueContains(expectedInHrefValue, actualHrefValue);




    }
}
