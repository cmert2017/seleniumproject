package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class P3_Checkbox_Practice {
    public static void main(String[] args) {
        //Practice:	Cybertek	Checkboxes

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 1.Go	to	http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // 2.Confirm	checkbox	#1	is	NOT	selected	by	default
        WebElement checkBoxElement1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        if(!checkBoxElement1.isSelected()){
            System.out.println("Checkbox is not selected. Verification  is PASSED");
        }else{
            System.out.println("Checkbox is  selected. Verification  is FAILED");

        }
        // 3.Confirm	checkbox	#2	is	SELECTED	by	default.
        WebElement checkBoxElement2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(checkBoxElement2.isSelected()){
            System.out.println("Checkbox is  selected. Verification  is PASSED");
        }else{
            System.out.println("Checkbox is  not selected. Verification  is FAILED");

        }

        // 4.Click	checkbox	#1	to	select	it.
        driver.findElement(By.xpath("//form/input[1]")).click();

        // 5.Click	checkbox	#2	to	deselect	it.
        driver.findElement(By.xpath("//form/input[2]")).click();
        // 6.Confirm	checkbox	#1	is	SELECTED.
        if(checkBoxElement1.isSelected()){
            System.out.println("Checkbox1 is selected. Verification is PASSED");
        }else{
            System.out.println("Checkbox2 is not  selected.Verification is FAILED");
        }

        // 7.Confirm	checkbox	#2	is	NOT
        if(!checkBoxElement2.isSelected()){
            System.out.println("Checkbox2 is not  selected. Verification is PASSED");
        }else{
            System.out.println("Checkbox2 is  selected.Verification is FAILED");
        }

        driver.manage().window().setSize(new Dimension(450,630));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.close();

    }
}
