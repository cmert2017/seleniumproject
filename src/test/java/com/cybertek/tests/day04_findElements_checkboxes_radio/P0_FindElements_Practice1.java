package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");
        List<WebElement> elementsOfLinks = driver.findElements(By.xpath("//body//a"));
        // 3.Print out the texts of all links
        for(WebElement each: elementsOfLinks){
            System.out.println(each.getText());
        }

        // 4.Print out how many total link
        System.out.println("elementsOfLinks.size() = " + elementsOfLinks.size());


    }
}
