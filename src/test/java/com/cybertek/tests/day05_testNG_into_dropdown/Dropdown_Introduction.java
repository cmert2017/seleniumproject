package com.cybertek.tests.day05_testNG_into_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {

    WebDriver driver;



    @BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1-go to google
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_test_1(){
    // 3.Verify “Simple dropdown” default selected value is correct
        // Expected: “Please select an option”
        WebElement dropDownElement = driver.findElement(By.cssSelector("#dropdown"));
        Select simpleDropDown = new Select(dropDownElement);
        String actualSelectedOption = simpleDropDown.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Please select an option";
        Assert.assertEquals(actualSelectedOption,expectedSelectedOption,"they are not equal");
        // 4.Verify “State selection” default selected value is correct
        // Expected: “Select a State”
        WebElement stateSelectionElement = driver.findElement(By.cssSelector("select#state"));
        Select simpleDropDown2 = new Select(stateSelectionElement);
        String expectedSelectedOption2 = "Select a State";
        String actualSelectedOption2 = simpleDropDown2.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption2,expectedSelectedOption2,"They are not equal");

    }


    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
