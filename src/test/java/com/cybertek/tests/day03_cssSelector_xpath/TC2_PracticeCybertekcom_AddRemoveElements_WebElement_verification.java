package com.cybertek.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification

USE XPATH  and/orCSS Selector LOCATOR FOR ALL WEBELEMENT LOCATORS
Better if you do with both for practice purposes.

 */
public class TC2_PracticeCybertekcom_AddRemoveElements_WebElement_verification {

    public static void main(String[] args)throws Exception{
        //1. Open Chrome browser
        System.setProperty("Webdriver.chromedriver","chromedriver");
        WebDriver driver = new ChromeDriver();


        //2.  Go to  http://practice.cybertekschool.com/add_remove_elements
        driver.navigate().to("http://practice.cybertekschool.com/add_remove_elements/");



        //3. Click to “Add Element” button
        driver.findElement(By.xpath("//button[contains(@onclick,'add')]")).click();




        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.cssSelector("div#elements>button.added-manually"));
        System.out.println("Before clicking: deleteButton.isDisplayed() = " + deleteButton.isDisplayed());


        Thread.sleep(3000);
        //5. Click to “Delete” button.
        deleteButton.click();

        Thread.sleep(3000);


        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("After clicking: deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
       }catch(StaleElementReferenceException e){
            //System.out.println(e.getMessage());
            System.out.println("After clicking: deleteButton.isDisplayed() = " + false);
            System.out.println("Error message:"+e.getLocalizedMessage().substring(0, 70));
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
