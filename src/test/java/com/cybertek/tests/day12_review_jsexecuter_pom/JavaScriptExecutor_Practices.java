package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {
    @Test
    public void scroll_using_jsexecutor_1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i <10 ; i++) {
            BrowserUtilities.wait(1);
            js.executeScript("window.scrollBy(0,250)");

        }
    }


    @Test
    public void scroll_using_jsexecutor_2(){

        Driver.getDriver().get("http://practice.cybertekschool.com/large");
       // WebElement cybertek_schoolLinkedText = Driver.getDriver().findElement(By.linkText("Cybertek School"));
       // WebElement cybertek_schoolLinkedText = Driver.getDriver().findElement(By.xpath("//div[@class='large-4 large-centered columns']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Dimension size = Driver.getDriver().manage().window().getSize();
        System.out.println("size = " + size);

        for (int i = 0; i <size.getWidth() ; i+=110) {
            BrowserUtilities.wait(1);
            js.executeScript("window.scrollBy("+ (i/7)+","+i+")");
        }

    }

    @Test
    public void scroll_using_jsexecutor_2_() throws InterruptedException {
        //get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        //locating cybertek school link
        WebElement cybertekLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //use js executor to scroll 'Cybertek School' link intoView
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //use scrollIntoView function from JavaScript to scroll to a specific web element
        BrowserUtilities.wait(5);
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekLink);
        BrowserUtilities.wait(5);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

     
     

    }

}
