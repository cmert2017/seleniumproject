package com.cybertek.tests.day02_Locators_getText_getAttributes.zerobank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_ZeroBankLinkTextVerification {
    static WebDriver driver;

    public static void openChromeBrowser(){

        //TC #2: Zero Bank link text verification
        // 1.Open Chrome browser
        System.setProperty("webdriver.chromedriver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void verification(String expected, String actual){

        if(actual.equalsIgnoreCase(expected)){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification Failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
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

        openChromeBrowser();

        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Verify link text from top left:Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        WebElement actualLinkElement = driver.findElement(By.className("brand"));
        String actualLinkText = actualLinkElement.getText();
        verification(expectedLinkText, actualLinkText);


        // 4.Verify link hrefattribute value contains:
        // Expected: “index.html"
        String expectedInHrefValue = "index.html";
        String actualHrefValue = actualLinkElement.getAttribute("href");
        hrefValueContains(expectedInHrefValue, actualHrefValue);



    }
}
