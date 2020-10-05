package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC3_PracticeCybertekcom_AddRemoveElements_WebElement_verification {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button 50 times
        for (int i = 0; i < 50; i++) {
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }
        //4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> ListOfDeleteElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int numOfDisplayedDeleteButton=0;
        for(WebElement eachDeleteButton : ListOfDeleteElements){
            if(eachDeleteButton.isDisplayed()){
                numOfDisplayedDeleteButton++;
            }
        }
        if(numOfDisplayedDeleteButton==50){
            System.out.println("There are "+numOfDisplayedDeleteButton +" delete buttons. Verification of number of 50 delete button is Passed");
        }else{
            System.out.println("There are "+numOfDisplayedDeleteButton +" delete buttons. Verification of number of 50 delete button is Failed");

        }

        //5. Click to ALL “Delete” buttons to delete them.
        for(WebElement eachDeleteButton : ListOfDeleteElements){
            eachDeleteButton.click();
            }

        //6. Verify “Delete” button is NOT displayed after clicking.

        try{
            for(WebElement eachDeleteButton : ListOfDeleteElements){
                if(eachDeleteButton.isDisplayed()){
                    numOfDisplayedDeleteButton++;
                }
            }
            if(numOfDisplayedDeleteButton>0){
                System.out.println("There are left "+ numOfDisplayedDeleteButton+ "delete buttons. Verification is Failed");
            }
        }catch (Exception e){
            System.out.println("There are no delete button left. Verification is passed");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
