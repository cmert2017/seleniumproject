package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.pages.Login7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Go to http://practice.cybertekschool.com/dynamic_loading/7
2. Wait until title is “Dynamic Title”
3. Assert : Message “Done” is displayed.
4. Assert : Image is displayed.
Note: Follow POM
 */
public class Synchronization_Practices {

    @Test(description = "synchronization sample")
    public void TC_40_Dynamically_Loaded_Page_Elements_7(){
        String url = "http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);

        Login7Page login7Page = new Login7Page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        Assert.assertTrue(login7Page.doneMessage.isDisplayed());


    }
}
