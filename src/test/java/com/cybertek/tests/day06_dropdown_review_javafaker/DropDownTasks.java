package com.cybertek.tests.day06_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DropDownTasks {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(" http://practice.cybertekschool.com/dropdown");
    }

}
