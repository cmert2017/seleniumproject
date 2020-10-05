package com.cybertek.tests.day05_testNG_into_dropdown.dropdown_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1_Verifying_Simple_dropdown_and_State_selection_dropdown_default_values extends SetupClass{


    @BeforeMethod  @Override
    public void setUp() {
        super.setUp();
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




    @AfterMethod @Override
    public void tearDown() throws InterruptedException {
        super.tearDown();
    }
}
