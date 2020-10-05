package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        String url1 = "http://www.google.com";
        String url2 = "http://www.amazon.com";

        //1- Setup the web driver
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.firefoxdriver().setup();


        //2- create the instance the chrome driver
        WebDriver driverc = new ChromeDriver();
       // WebDriver driverf = new FirefoxDriver();

        driverc.manage().window().maximize();


        //3- com.cybertek.extrapractice.test if driver is working
        driverc.get(url1);

        System.out.println(driverc.getTitle());


       /* driverf.get(url2);
        System.out.println(driverf.getTitle());*/

        String actualURL = driverc.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        Thread.sleep(3000);

        driverc.navigate().refresh();
        driverc.navigate().to(url2);


        driverc.manage().window().fullscreen();
        Thread.sleep(10000);

        driverc.navigate().back();
        driverc.navigate().forward();


        driverc.close();




    }
}
