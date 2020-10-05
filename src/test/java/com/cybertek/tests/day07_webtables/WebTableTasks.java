package com.cybertek.tests.day07_webtables;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
TC#3: Smartbear software order verification
1. Open browser and login to Smartbear software
2. Click on View all orders
3. Verify Susan McLaren has order on date “01/05/2010”
 */
public class WebTableTasks {

    @Test
    public void verify_susans_order_sate() throws InterruptedException, IOException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SmartBearUtilities.loginToSmartBear(driver);
        WebElement susansDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        System.out.println(susansDate.getText());

        String expectedDate = "01/05/2010";
        String actualDate = susansDate.getText();

        Assert.assertEquals(actualDate,expectedDate);

        Assert.fail("I was failing this com.cybertek.extrapractice.test on purpose");

        //TODO: fix this locator



    }



}
