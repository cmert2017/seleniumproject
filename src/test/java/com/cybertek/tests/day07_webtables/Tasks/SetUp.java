package com.cybertek.tests.day07_webtables.Tasks;

import com.cybertek.utilities.SmartBearUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class SetUp {

    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        SmartBearUtilities.loginToSmartBear(driver);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        SmartBearUtilities.tearDown(driver);
    }
}
