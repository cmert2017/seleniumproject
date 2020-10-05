package com.cybertek.extrapractice.SelfPractice_09_27_2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IframePractice {

    @Test
    public void iframe_testing(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='seleniumhq']"));
        driver.switchTo().frame(iframeElement);

        List<WebElement> linkElements = driver.findElements(By.xpath("//a"));
        for (WebElement each : linkElements) {
            System.out.println(each.getText());

        }



    }
}
