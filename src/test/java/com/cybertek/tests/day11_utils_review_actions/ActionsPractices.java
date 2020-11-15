package com.cybertek.tests.day11_utils_review_actions;
/*
//TC    #15:   Hover  Test
//1. Go    to http://practice.cybertekschool.com/hovers
//2. Hover over   to first  image
//3. Assert:
//a. "name:    user1" is displayed
//4. Hover over   to second image
//5. Assert:
//a. "name:    user2" is displayed
//6. Hover over   to third  image
//7. Confirm:
//a. "name:    user3" is displayed
 */

import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void testActions() {

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]/child::div/h5"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]/child::div/h5"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]/child::div/h5"));


        Actions  actions = new Actions(Driver.getDriver());

        BrowserUtilities.wait(3);
        actions.moveToElement(img1).perform();

        Assert.assertTrue(user1.isDisplayed(),"User1 1 is NOT displayed! Verification failed!!!");


        BrowserUtilities.wait(3);
        actions.moveToElement(img2).perform();

        Assert.assertTrue(user2.isDisplayed(),"User2 1 is NOT displayed! Verification failed!!!");


        BrowserUtilities.wait(3);
        actions.moveToElement(img3).perform();

        Assert.assertTrue(user3.isDisplayed(),"User3 1 is NOT displayed! Verification failed!!!");



        Driver.getDriver().close();
    }
}
