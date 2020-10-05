package com.cybertek.tests.day07_webtables.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;


public class TC7_Cybertek_month_dropdown_default_value {

    @Test
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement monthDropDownElement = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(monthDropDownElement);
        String expectedMonth = LocalDate.now().getMonth().toString().toLowerCase();
        String actualMonth = select.getFirstSelectedOption().getText().toLowerCase();
        Assert.assertEquals(expectedMonth, actualMonth);

    }
}
