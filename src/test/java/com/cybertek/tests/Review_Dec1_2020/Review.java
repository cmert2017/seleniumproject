package com.cybertek.tests.Review_Dec1_2020;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Review {

    @Test
    public void review(){


        Driver.getDriver().get("http://google.com");

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

        //js.executeScript("scrollBy(0,250)", );

    }

}
