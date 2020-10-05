package com.cybertek.tests.day02_Locators_getText_getAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #6: Zero Bankheader verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify header text
Expected: “Log in to ZeroBank”
 */
public class P6_HeaderVerification {
    public static void main(String[] args) {
        //1.Open Chrome browser
        System.setProperty("Webdriver.chromedriver","chromedriver");
        WebDriver driver = new ChromeDriver();


        //2.Go to http://zero.webappsecurity.com/login.html
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        //3.Verify header text
        String actualHeader = driver.findElement(By.tagName("h3")).getText();
        String expectedHeader = "Log in to ZeroBank";
        //Expected: “Log in to ZeroBank”

        System.out.println("driver.findElement(By.tagName(\"h3\")).getAttribute(\"id\") = " + driver.findElement(By.tagName("h3")).getAttribute("id"));

        if (actualHeader.equals(expectedHeader)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        driver.close();


    }
}
