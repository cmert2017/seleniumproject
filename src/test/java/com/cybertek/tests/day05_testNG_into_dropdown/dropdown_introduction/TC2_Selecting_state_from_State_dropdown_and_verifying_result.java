package com.cybertek.tests.day05_testNG_into_dropdown.dropdown_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2_Selecting_state_from_State_dropdown_and_verifying_result extends  SetupClass{
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    @Override @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Test
    public void stateDropDown() throws InterruptedException {
        //3. Select Illinois
        WebElement stateDropDownElement = driver.findElement(By.cssSelector("select#state"));
        Select simpleDropDown1 = new Select(stateDropDownElement);
        simpleDropDown1.selectByVisibleText("Illinois");
        //simpleDropDown1.selectByIndex(14);
        //simpleDropDown1.selectByValue("IL");

        //4. Select Virginia
        Thread.sleep(3000);
        simpleDropDown1.selectByValue("VA");

        //5. Select California
        Thread.sleep(3000);
         simpleDropDown1.selectByIndex(5);
        //simpleDropDown1.selectByVisibleText("California");
        simpleDropDown1.selectByValue("CA");

        //6. Verify final selected option is California.
        String expectedSelectedOption = "California";
        String actualSelectedOption = simpleDropDown1.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);
        //Use all Select options. (visible text, value, index)
    }

    @Override @AfterMethod
    public void tearDown() throws InterruptedException {
        super.tearDown();
    }
}
