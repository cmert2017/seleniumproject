package com.cybertek.tests.day12_review_jsexecuter_pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC #16: Double Click Test
1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.
 */
public class TC_16_Double_Click_Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");



        }



        @Test
    public void double_click(){
            driver.switchTo().frame("iframeResult");
            WebElement doubleClickElement = driver.findElement(By.xpath("//p[.='Double-click me to change my text color.']"));

            Actions action = new Actions(driver);
            action.doubleClick(doubleClickElement).perform();

            String expected = "red";
            String actual = doubleClickElement.getAttribute("style");
            Assert.assertTrue(actual.contains(expected));
        }

}
