package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_SeleniumEasy_Checkbox_Verification_Section1 {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3. Verify “Success – Check box is checked” message is NOT displayed.
        WebElement checkboxElement = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if(checkboxElement.isSelected()){
            System.out.println("Success – Check box is checked is displayed. verification is FAILED");
        }else{
            System.out.println("Success – Check box is checked is not displayed. verification is PASSED");

        }
        //4. Click to checkbox under “Single Checkbox Demo” section
        checkboxElement.click();

        //5. Verify “Success – Check box is checked” message is displayed.
        WebElement successTextElement = driver.findElement(By.xpath("//div[@id='txtAge']"));
        try{
        if(successTextElement.isDisplayed()){
            System.out.println("Success – Check box is checked is displayed. verification is PASSED");
        }
        }catch(Exception e){
            System.out.println("Success – Check box is checked is bot displayed. verification is FAILED");

        }
        Thread.sleep(3000);
        driver.close();
    }
}
