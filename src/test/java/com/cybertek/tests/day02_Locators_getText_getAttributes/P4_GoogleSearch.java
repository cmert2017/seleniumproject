package com.cybertek.tests.day02_Locators_getText_getAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
TC#4:	Google	search1
-Open	a	chrome browser
2-Go	to:	https://google.com
3-Write	“apple”	in	search box
4-Click	google	search	button
5-Verify	title:
Expected:	Title should	start	with	“apple
 */
public class P4_GoogleSearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","chromedriver");

//        TC#4:	Google	search1
//        -Open	a	chrome browser
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();


//        2-Go	to:	https://google.com
            String url = "https://google.com";
            driver.get(url);


//        3-Write	“apple”	in	search box
            driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

//        4-Click	google	search	button

          //  driver.findElement(By.className("gNO89b")).click();
//        5-Verify	title:
//        Expected:	Title should	start	with	“apple
            String actualTitle = driver.getTitle();
            String expectedTitle = "apple";
            if(actualTitle.contains(expectedTitle)){
                System.out.println("Passed");
            }else{
                System.out.println("Fail");
            }





    }
}
