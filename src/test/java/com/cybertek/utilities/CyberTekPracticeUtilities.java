package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CyberTekPracticeUtilities {




        @BeforeMethod
        public static void setUp(WebDriver driver) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://practice.cybertekschool.com/");

        }

        @AfterMethod
        public static void tearDown(WebDriver driver) throws InterruptedException {
            Thread.sleep(3000);
            driver.close();
        }
    }


