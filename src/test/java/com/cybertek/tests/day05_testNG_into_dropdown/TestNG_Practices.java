package com.cybertek.tests.day05_testNG_into_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    //1-go to google
        driver.get("https://google.com");
    }


    @Test
    public void google_title_verification(){
    //2-Verify title is google
        System.out.println("google_title_verification is running");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Titles are not matching");

    }


    @Test
    public void google_search_title_verification(){
        System.out.println("public void google_search_title_verification");
        //search apple
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle),"Title does not contains search value ");
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
