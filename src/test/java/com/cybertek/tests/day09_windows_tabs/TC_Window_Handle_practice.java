package com.cybertek.tests.day09_windows_tabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

/*
1. Create a new class called: WindowHandlePractice
2. Create new com.cybertek.extrapractice.test and make set ups
3. Go to : http://practice.cybertekschool.com/windows
4. Assert: Title is “Practice”
5. Click to: “Click Here” text
6. Switch to new Window.
7. Assert: Title is “New Window”

 */
public class TC_Window_Handle_practice {

    WebDriver driver;

    @BeforeMethod
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }


    @BeforeClass
    public void beforeClass() {
        
    }

    @Test
    public void windowHandlingPractice_Test(){
        driver.get("http://practice.cybertekschool.com/windows");

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.equalsIgnoreCase("Practice"));

        System.out.println("actualTitle = " + actualTitle);

        String mainHandle = driver.getWindowHandle();

        WebElement click_hereElement = driver.findElement(By.linkText("Click Here"));
        for (int i = 0; i < 10; i++) {
            click_hereElement.click();
        }

        String titleAfterClick =  driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        Set<String> windowHandles = driver.getWindowHandles();


        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println(windowHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        String titleAfterSwitchToNewTab = driver.getTitle();
        System.out.println("titleAfterSwitchToNewTab = " + titleAfterSwitchToNewTab);

/*
        //assertion fails and it throws exception and execution will stop.
        Assert.assertTrue(3>4, "great");


       //softAssert will not throw exception so executuon continues after assertion fails
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(4>3,"again great");
       */

        driver.switchTo().window(mainHandle);

        driver.close();

    }




    @Test
    public void p6_Window_Handle_practice(){

        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if(driver.getCurrentUrl().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }


        }


    }






}
