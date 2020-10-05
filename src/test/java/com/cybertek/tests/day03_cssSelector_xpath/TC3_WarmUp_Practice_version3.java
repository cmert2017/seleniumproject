package com.cybertek.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC3_WarmUp_Practice_version3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();

//        ChromeDriver driver2 = new ChromeDriver();
//        driver2 = new FirefoxDriver();

        String url= "http://practice.cybertekschool.com/forgot_password";
        driver.get(url);

        driver.findElement(By.name("email")).sendKeys("myemail@gmail.com"+ Keys.ENTER);

        String expectedinURL = "email_sent";
        String actualURL= driver.getCurrentUrl();

        if(actualURL.contains(expectedinURL)){
            System.out.println("URL contains com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("URL contains com.cybertek.extrapractice.test FAILED");
            System.out.println(actualURL);
            System.out.println(expectedinURL);
        }

        String expectedContent = "Your e-mail's been sent!";
        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));
        String actualContent = confirmation_message.getText();

        if(actualContent.equalsIgnoreCase(expectedContent)){
            System.out.println("Content com.cybertek.extrapractice.test PASSED");
        }else{
            System.out.println("Content com.cybertek.extrapractice.test FAILED");
            System.out.println(expectedContent);
            System.out.println(actualContent);
        }

        //verify if the web element is displayed or not
        if(confirmation_message.isDisplayed()){
            System.out.println("Web element is displayed");
        }
        else{
            System.out.println("Web element is not displayed");
        }


        driver.close();
    }
}
