package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
TC #16: Hover Test
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
 */
public class TC16_Drag_And_Drop {

    @Test
    public void drag_and_drop() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement sourceDragableElement = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetDragableElement = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(sourceDragableElement);
        actions.dragAndDrop(sourceDragableElement,targetDragableElement).perform();

        Thread.sleep(300);
        String expected = "You did great!";
        String actual = targetDragableElement.getText();

        Assert.assertEquals(actual,expected);


    }

    @Test
    public void drag_and_drop_longerWay() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement sourceDragableElement = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetDragableElement = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(sourceDragableElement);

        Thread.sleep(3000);
        actions.clickAndHold(sourceDragableElement).perform();

        Thread.sleep(5000);
        actions.moveToElement(targetDragableElement).perform();

        Thread.sleep(3000);
        actions.release().perform();

        String expected = "You did great!";
        String actual = targetDragableElement.getText();

        Assert.assertEquals(actual,expected);


    }

}
