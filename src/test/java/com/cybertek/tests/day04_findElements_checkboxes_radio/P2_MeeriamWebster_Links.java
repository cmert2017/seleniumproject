package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_MeeriamWebster_Links {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        // 3. Print out the texts of all links
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> elementsOfLinks = driver.findElements(By.xpath("//body//a"));

        for(WebElement each: elementsOfLinks){
            System.out.println(each.getText());

        }
        //4. Print out how many link is missing text
        int numOfEmptyLinks=0;
        for(WebElement each: elementsOfLinks){
            if(each.getText().isEmpty()){
             numOfEmptyLinks++;
            }
        }
        System.out.println("numOfEmptyLinks = " + numOfEmptyLinks);
       /* int numOfLinks=0;
        for (WebElement each: elementsOfLinks){
            if(each.isDisplayed()){
                numOfLinks++;
            }
        }

        System.out.println("num of missing Links = " + ( elementsOfLinks.size()- numOfLinks));
*/

        //5. Print out how many link has text



        //6. Print out how many total link

    }
}
