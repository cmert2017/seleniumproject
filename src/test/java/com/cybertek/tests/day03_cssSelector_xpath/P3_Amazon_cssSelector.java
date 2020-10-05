package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Amazon_cssSelector {
/*
TC #3: Amazon link number verification
1. Open Chrome browser
2. Go to https://www.amazon.com
3. Enter search term (use cssSelectorto locate search box)
4. Verify title contains search term
 */
    public static void main(String[] args) throws InterruptedException {

      //WebDriver driver = WebDriverFactory.getDriver("Chrome");
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        //driver.findElement(By.cssSelector("input..nav-a.nav-a-2.icp-link-style-2")).sendKeys("Wooden"+ Keys.ENTER);;
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Wooden"+ Keys.ENTER);

        String expectedITitle = "Wooden";
        String actualTitle = driver.getTitle();



        WebDriverFactory.titleContainsVerification(actualTitle,expectedITitle);



    }
}
