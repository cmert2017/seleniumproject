package com.cybertek.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_PracticeCyberTek_Xpath {

    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 and click on it

        driver.findElement(By.xpath("//button[@name='button2']")).click();
    }
}
