package com.cybertek.extrapractice.SelfPractice_09_27_2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropDownPractice {

    WebDriver driver;
    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/login");
       //driver.navigate().to();
        WebElement emailBox=driver.findElement(By.xpath("//span[.='Email']"));
        emailBox.sendKeys("user@phptravels.com");
        WebElement passwordBox=driver.findElement(By.xpath("//span[.='Password']"));
        passwordBox.sendKeys("demouser");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();



    }





}
