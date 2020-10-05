package com.cybertek.tests.day05_testNG_into_dropdown.dropdown_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC4_Selecting_value_from_multiple_select_dropdown extends SetupClass{
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    @BeforeMethod @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void multipleSelectDown() throws InterruptedException {
    // 3. Select all the options from multiple select dropdown.
        WebElement multipleSelectDropDownElement = driver.findElement(By.cssSelector("select[name='Languages']"));
        Select multipleDropDownElement = new Select(multipleSelectDropDownElement);
        /*for (int i = 0; i < 6; i++) {
            multipleDropDownElement.selectByIndex(i);
        }*/

        List<WebElement> allOptions = multipleDropDownElement.getOptions();


        // 4. Print out all selected values.
        for(WebElement each: allOptions){
            Thread.sleep(500);
            each.click();
            System.out.println(each.getText());
        }

        //5. Deselect all values.
        multipleDropDownElement.deselectAll();

        for (WebElement eachOption : allOptions){
            Assert.assertTrue(!eachOption.isSelected());
        }


    }

    @AfterMethod @Override
    public void tearDown() throws InterruptedException {
        super.tearDown();
    }
}
