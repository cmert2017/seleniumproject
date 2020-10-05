package com.cybertek.tests.day02_Locators_getText_getAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #5: EtsyTitle Verification
1.Open Chrome browser
2.Go to https://www.etsy.com
3.Search for “wooden spoon”
4.Verify title:
Expected: “Wooden spoon | Etsy”
 */
public class P5_EtsyTitleVerification {
    public static void main(String[] args) {

        //1.Open Chrome browser
        System.setProperty("webdriver.chrome","chromedriver");
        WebDriver driver = new ChromeDriver();


        //2.Go to https://www.etsy.com

        driver.get("http://etsy.com");
        driver.findElement(By.id("abc7")).getText();

        //3.Search for “wooden spoon”
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wood spoon"+ Keys.ENTER);

        //4.Verify title:
        //Expected: “Wooden spoon | Etsy”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Etsy title verification Passed");
        }else{
            System.out.println("Etsy title verification Passed");

        }

        driver.close();
    }
}
