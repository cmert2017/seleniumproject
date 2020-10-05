package com.cybertek.tests.day09_windows_tabs.smartbeartask;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
TC #10: SmartBear edit order
1. Open browser and login to SmartBear
2. Click to edit button from the right for “Steve Johns”
3. Change name to “Michael Jordan”
4. Click Update
5. Assert “Michael Jordan” is in the list
 */
public class TC_10_SmartBear_edit_order {

    WebDriver driver;

    @Test
    public void editOrder() throws InterruptedException, IOException {
        driver = WebDriverFactory.getDriver("chrome");
        SmartBearUtilities.loginToSmartBear(driver);

        WebElement editButton = driver.findElement(By.xpath("(//table[@class='SampleTable']//td[2])[3]//following-sibling::td[11]/input"));
        editButton.click();

        WebElement nameBoxToBeChanged = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));

        nameBoxToBeChanged.clear();
        nameBoxToBeChanged.sendKeys("Michael Jordan");

        WebElement updateButton = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']"));
        updateButton.click();



        List<WebElement> allNamesAfterUpdate = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));


       //Asserting update-version1
       /* for (WebElement eachName : allNamesAfterUpdate) {
            if(eachName.getText().equals("Michael Jordan")){
                Assert.assertEquals(eachName.getText(),"Michael Jordan","update was not successful");
                return;
            }
        }
       Assert.fail("The name couldnt be added ");*/


        //Asserting update-version2
        List<String> nameElementAsString = new ArrayList<>();
        for (WebElement nameElement : allNamesAfterUpdate) {
            nameElementAsString.add(nameElement.getText());
        }

        Assert.assertTrue(nameElementAsString.contains("Michael Jordan"));
    }
}
