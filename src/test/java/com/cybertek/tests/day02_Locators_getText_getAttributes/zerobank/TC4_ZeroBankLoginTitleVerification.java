package com.cybertek.tests.day02_Locators_getText_getAttributes.zerobank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ZeroBankLoginTitleVerification {
    static WebDriver driver;
    public static void openChromeBrowser(){
        //TC #4: Zero Bank login title verification
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


        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);


        // 5.Click to “Account Activity” link
        driver.findElement(By.linkText("Account Activity")).click();


        // 6.Verify title changed to:
        // Expected: “Zero –Account Activity”
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();

        titleVerification(expectedTitle, actualTitle);

        // 7.Click to “Transfer Funds” link
        driver.findElement(By.linkText("Transfer Funds")).click();

        // 8.Verify title changed to:
        // Expected: “Zero –Transfer Funds”
        String expectedTitle1 = "Zero - Transfer Funds";
        String actualTitle1 = driver.getTitle();

        titleVerification(expectedTitle1, actualTitle1);


        // 9.Click to “Pay Bills” link
        driver.findElement(By.linkText("Pay Bills")).click();


        // 10.Verify title changed to:
        // Expected: “Zero -Pay Bills”
        String expectedTitle2 = "Zero - Pay Bills";
        String actualTitle2 = driver.getTitle();

        titleVerification(expectedTitle2, actualTitle2);

        // 11.Click to “My Money Map” link
        driver.findElement(By.linkText("My Money Map")).click();


        // 12.Verify title changed to:
        // Expected: “Zero –My Money Map”
        String expectedTitle3 = "Zero - My Money Map";
        String actualTitle3 = driver.getTitle();

        titleVerification(expectedTitle3, actualTitle3);


        // 13.Click to “Online Statements” link
        driver.findElement(By.linkText("Online Statements")).click();

        // 14.Verify title changed to:
        // Expected: “Zero –Online Statements”
        String expectedTitle4 = "Zero - Online Statements";
        String actualTitle4 = driver.getTitle();

        titleVerification(expectedTitle4, actualTitle4);




    }
}
