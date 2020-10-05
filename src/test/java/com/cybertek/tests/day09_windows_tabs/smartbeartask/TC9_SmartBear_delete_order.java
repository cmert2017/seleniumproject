package com.cybertek.tests.day09_windows_tabs.smartbeartask;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/*
TC #9: SmartBear delete order
1. Open browser and login to SmartBear
2. Delete “Mark Smith” from the list
3. Assert it is deleted from the list
 */
public class TC9_SmartBear_delete_order {
    WebDriver driver;

    @Test
    public void deleteOrder() throws InterruptedException, IOException {
        driver = WebDriverFactory.getDriver("chrome");
        SmartBearUtilities.loginToSmartBear(driver);

        WebElement toBeDeletedElement = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        toBeDeletedElement.click();


        WebElement deleteButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        deleteButton.click();

        Thread.sleep(3000);

        List<WebElement> allNamesAfterDeletetion = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));

      //version1
        /*  for (WebElement eachName : allNamesAfterDeletetion) {
            if(eachName.getText().equals("Mark Smith")){
                Assert.fail("The name was not deleted");
            }
        }
        Assert.assertTrue(true,"This element is already deleted");*/

       /* //version2
        for (WebElement eachName : allNamesAfterDeletetion) {

            Assert.assertTrue(!eachName.getText().equalsIgnoreCase("Mark Smith"),"This element is already deleted");

        }
*/


        //version3
        for (WebElement eachName : allNamesAfterDeletetion) {

        Assert.assertNotEquals(eachName.getText(), "Mark Smith");

        }

/*
        //version4
        for (WebElement eachName : allNamesAfterDeletetion) {

            Assert.assertFalse(eachName.getText().equalsIgnoreCase("Mark Smith") );

        }
        */



    }

       /* @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.close();
        }*/
}
