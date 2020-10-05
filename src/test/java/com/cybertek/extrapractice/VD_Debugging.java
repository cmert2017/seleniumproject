package com.cybertek.extrapractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VD_Debugging {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://fdworlds.net");
        driver.manage().window().maximize();
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("Чисто для форума");
        driver.findElement(By.id("subm")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("22021989");
        driver.findElement(By.id("subm")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='0']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//td[.='6']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//td[.='0']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//td[.='5']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//td[.='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("subm")).click();
        Thread.sleep(5000);

        //driver.findElement(By.xpath("//div[.='Выйти из зала']")).click();
        WebElement element = driver.findElement(By.xpath("//td[@width='40%']/../td[2]/div[1]"));
        System.out.println(element.isDisplayed());
        System.out.println(element.getText());
        element.getLocation();
        // driver.findElement(By.xpath("//td[@width='40%']/../td[2]")).click();
        //driver.findElement(By.xpath("//td[@align='center']/../td[2]/div[1]")).click();
        //driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/div")).click();
        //driver.findElement(By.cssSelector("body > table:nth-child(2) > tbody > tr > td.main_window_td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table:nth-child(1) > tbody > tr > td:nth-child(2) > div")).click();
        Thread.sleep(5000);



    }
}
