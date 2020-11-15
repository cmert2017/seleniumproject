package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
//TC #17: Context Click – HOMEWORK
//1. Go to https://the-internet.herokuapp.com/context_menu
// 2. Right click to the box.
//3. Alert will open.
//4. Accept alert
//No assertion needed for this practice.
 */
public class TC17_Context_Click {

    @Test
    public void context_click(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement rectangleBox = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(rectangleBox).perform();

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();

        WebElement context_menu = Driver.getDriver().findElement(By.tagName("h3"));
        actions.moveToElement(context_menu).click().perform();




    }


}
