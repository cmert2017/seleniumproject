package com.cybertek.extrapractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws  Throwable {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        String url1 = "http://www.google.com";
        String url2 = "http://www.amazon.com";

        driver.get(url1);

        Thread.sleep(3000);

        driver.navigate().to(url2);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.manage().window().maximize();
        //driver.manage().window().wait(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getNetworkConnection());
        System.out.println(driver.getCapabilities());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getKeyboard());
        System.out.println(driver.getMouse());

        System.out.println(driver.getLocalStorage());

        Thread.sleep(3000);

        driver.close();

    }
}
