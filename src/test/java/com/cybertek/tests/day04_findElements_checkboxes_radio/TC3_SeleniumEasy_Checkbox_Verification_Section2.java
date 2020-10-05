package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC3_SeleniumEasy_Checkbox_Verification_Section2 {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3. Verify “Check All” button text is “Check All”
        WebElement checkAllButtonElement = driver.findElement(By.xpath("//input[@id='check1']"));

        Thread.sleep(3000);
        String expectedValue = "Check ALL";
        String actualValue = checkAllButtonElement.getAttribute("value");
        if(actualValue.equalsIgnoreCase(expectedValue)){
            System.out.println("Check ALL verification is passed");
        }else{
            System.out.println("Check ALL verification didnt passed");
            System.out.println(expectedValue);
            System.out.println(actualValue);
        }


        //4. Click to “Check All” button
        checkAllButtonElement.click();
        //5. Verify all check boxes are checked
        List<WebElement> checkboxElements = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int i =0;
        for(WebElement eachcheckbox : checkboxElements){
            if(eachcheckbox.isSelected()){
                System.out.println("Check" + i + " is selected");
                i++;
            } else {
                System.out.println("Check" + i + " is not selected");
                i++;

            }
        }
        //6. Verify button text changed to “Uncheck All”
        String expectedValue1 = "Uncheck All";
        String actualValue1 = checkAllButtonElement.getAttribute("value");
        if(actualValue.equalsIgnoreCase(expectedValue)){
            System.out.println("Uncheck ALL verification is passed");
        }else{
            System.out.println("Uncheck ALL verification didnt passed");
            System.out.println(expectedValue);
            System.out.println(actualValue);
        }

        Thread.sleep(3000);
        driver.close();
    }
}
