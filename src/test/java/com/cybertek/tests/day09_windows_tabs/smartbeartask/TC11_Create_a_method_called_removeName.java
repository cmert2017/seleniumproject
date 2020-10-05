package com.cybertek.tests.day09_windows_tabs.smartbeartask;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

/*
TC #11 : Create a method called removeName()
1. Accepts two parameters: WebDriver, String name
2. Method will remove the given name from the list of Smartbear
3. Create a new TestNG com.cybertek.extrapractice.test, and call your method.
4. Assert that your method removed the given name

 */
public class TC11_Create_a_method_called_removeName {


    @Test
    public void removeNameTest() throws InterruptedException, IOException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        SmartBearUtilities.loginToSmartBear(driver);
        SmartBearUtilities.removeName(driver, "Mark Smith");
    }

}
