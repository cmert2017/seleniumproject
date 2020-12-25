package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1GooogleTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String url = "http://google.com";

        driver.get(url);

        String actualUrl = driver.getTitle();
        System.out.println("actualUrl = " + actualUrl);
        String expectedUrl = "Google";
        System.out.println("expectedUrl = " + expectedUrl);
       // System.out.println("driver.getPageSource() = " + driver.getPageSource());
        System.out.println("driver.getClass() = " + driver.getClass());

        if(actualUrl.equals("Google")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.close();

    }
}
