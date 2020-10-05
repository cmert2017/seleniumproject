package com.cybertek.tests.day05_testNG_into_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Debugging {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    //TC #2: Selecting state from State dropdown and verifying result
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException{

        // we need to locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
        //5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualResult,expectedResult,"Actual vs expected is not equal!");
        // message is for failure message if the com.cybertek.extrapractice.test fails
        //Use all Select options. (visible text, value, index)
    }
    @Test
    public void test3_date_dropdown_verification(){
        //TC #3: Selecting date on dropdown and verifying
        //locate all the web elements/dropdowns
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //3. Select "December 1 , 1921" and verify it is selected.
        //Selecting year using text
        yearDropdown.selectByVisibleText("1921");
        //Selecting month using value
        monthDropdown.selectByValue("11");
        //select day by using index
        dayDropdown.selectByIndex(0);
        //creating expected values in one place
        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";
        //getting our actual values from the web page
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        //creating assert lines to commpare actual vs expected
        Assert.assertEquals(actualYear,expectedYear,"Actual year VS expected year not equal");
        Assert.assertEquals(actualMonth,expectedMonth,"Actual month VS expected month not equal");
        // Assert.assertTrue(true);
        Assert.assertTrue(actualDay.equals(expectedDay),"Actual day vs expected day not equal");
        //   Select year using Select month using Select day using
        //: visible text
        //: value attribute : index number
        //BREAK UNTIL 11.11AM CST - 12.11PM EST
    }
}


