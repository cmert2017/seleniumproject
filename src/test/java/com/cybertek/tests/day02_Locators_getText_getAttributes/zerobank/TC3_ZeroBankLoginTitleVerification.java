package com.cybertek.tests.day02_Locators_getText_getAttributes.zerobank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ZeroBankLoginTitleVerification {

    static WebDriver driver;

    public static void openChromeBrowser(){
        //TC #3: Zero Bank login title verification
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

        openChromeBrowser();

        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password");

        // 4.2. click at Sign in button
        driver.findElement(By.name("submit")).click();

        // 5.Verify title changed to:
        // Expected: “Zero – Account Summary”

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        titleVerification(expectedTitle, actualTitle);



    }
}
