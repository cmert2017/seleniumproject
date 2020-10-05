package com.cybertek.tests.day05_testNG_into_dropdown.dropdown_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3_Selecting_date_on_dropdown_and_verifying extends SetupClass{
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    @BeforeMethod @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void selectingDate(){
        //3. Select “December 1 , 1921” and verify it is selected.
        //   Select year using  : visible text
        //   Select month using  : value attribute
        //   Select day using  : index number

        //selecting year
        WebElement selectYearElement = driver.findElement(By.cssSelector("select#year"));
        Select simpleDropDownElement = new Select(selectYearElement);
        simpleDropDownElement.selectByVisibleText("1921");



        //selecting month
        WebElement selectMonthElement = driver.findElement(By.cssSelector("select#month"));
        Select simpleDropDownElement2 = new Select(selectMonthElement);
        simpleDropDownElement2.selectByValue("11");

        //selecting day
        WebElement selectDayElement = driver.findElement(By.cssSelector("select#day"));
        Select simpleDropDownElement3 = new Select(selectDayElement);
        simpleDropDownElement3.selectByIndex(0);
    }

    @AfterMethod  @Override
    public void tearDown() throws InterruptedException {
        super.tearDown();
    }
}
