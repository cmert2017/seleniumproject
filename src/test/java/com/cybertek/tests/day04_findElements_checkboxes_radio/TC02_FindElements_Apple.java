package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC02_FindElements_Apple {

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.apple.com

        driver.get("https://www.apple.com");

        //3. Click to iPhone
        driver.findElement(By.xpath("//div[@class='ac-gn-content']/ul[2]/li[4]/a")).click();

        //4. Print out the texts of all links
        List<WebElement> listOfLinksOfElements = driver.findElements(By.xpath("//body//a"));

        //5. Print out how many link is missing text
        int linksWithoutText = 0;
        int linksWithText = 0;
        for(WebElement eachLink : listOfLinksOfElements ){
            if(eachLink.getText().isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }

        System.out.println("Number of linksWithoutText = " + linksWithoutText);

        // 6. Print out how many link has text
        System.out.println("Number of linksWithText = " + linksWithText);

        //7. Print out how many total link
        System.out.println("Total Number of Links: " + listOfLinksOfElements.size());

    }

}
