package com.cybertek.tests.day02_Locators_getText_getAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) throws Exception {


        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //setting up the browser driver
        System.setProperty("webdriver.chromedriver", "/Users/mathinformatics/IdeaProjects/seleniumproject/chromedriver");
        WebDriver driver =  new ChromeDriver();

        //2 - GO to: https://google.com
        driver.get("http://google.com");

        //3-click to Gmail from top right

        driver.findElement(By.linkText("Gmail")).click();
        WebElement we = driver.findElement(By.partialLinkText("ang"));
        System.out.println(we);


        //4-verify title contains
        String actualTitle = driver.getTitle();

        //Expected: Gmail
        String expectedTitle = "Gmail - Email from Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }



        //5-GO back to Google by using the. Backo
        driver.navigate().back();

        //6- Verify title equals:

        String actualTitle2 = driver.getTitle();
        //Expected: Google
        String expectedTitle2 = "Google";

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        Thread.sleep(5000);

        driver.close();

    }

}
