package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2CyberTekVerifications {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "http://practice.cybertekschool.com";
        driver.get(url);
        System.out.println("Verification #1");
        String expectedResult1 = "cybertekschool";
        String actualResult1 = driver.getCurrentUrl();
        System.out.println("Expected Result: URL contains "+ expectedResult1);
        System.out.println("Actual Result: URL is "+ actualResult1);
        if(actualResult1.contains(expectedResult1)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        System.out.println("Verification #2");
        String expectedResult2 = "Practice";
        String actualResult2 = driver.getTitle();
        System.out.println("Expected Result: title is "+ expectedResult2);
        System.out.println("Actual Result: title is "+ actualResult2);
        if(actualResult2.equals(expectedResult2)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        System.out.println(driver.getWindowHandle());
        System.out.println();

        driver.close();
    }
}
