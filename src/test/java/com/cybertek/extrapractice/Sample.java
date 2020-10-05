package com.cybertek.extrapractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Sample {

    @Test
    public void setupMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://login2.nextbasecrm.com/");
    }


   /* @Test
    public void nameTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("Slack/Cybertek/Class-Chat");
        String expectedName = "Cihat";
        String actualName = driver.findElement(By.linkText("Cihan")).getText();

        Assert.assertEquals(actualName,expectedName, "These two names are almost same except the last letter");
    }*/
}
