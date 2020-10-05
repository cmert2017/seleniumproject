package com.cybertek.tests.day05_testNG_into_dropdown.dropdown_introduction;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5_Selecting_value_from_nonselect_dropdown extends SetupClass{
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }


    @Test
    public void nonSelectDropDown() {
        // 3. Click to non-select dropdown
        driver.findElement(By.cssSelector("a.btn.btn-secondary.dropdown-toggle")).click();
        //4. Select Facebook from dropdown
        driver.findElement(By.xpath("//a[.='Facebook']")).click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle =  driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }


    @Override  @AfterMethod
    public void tearDown() throws InterruptedException {
        super.tearDown();
    }
}
