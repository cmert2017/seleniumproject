package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageObjectMOdelPractice {


    @Test
    public void login_to_smartbear(){

        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));



    }

    @Test
    public void fill_form_using_javascript(){

        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

        WebElement usernameInput = Driver.getDriver().findElement(By.name("full_name"));
        WebElement emailInput = Driver.getDriver().findElement(By.name("email"));
        WebElement signUpbutton = Driver.getDriver().findElement(By.name("wooden_spoon"));

        BrowserUtilities.wait(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].setAttribute('value','Jane Doe')",usernameInput);
        js.executeScript("arguments[0].setAttribute('value','something@gmail.com')",emailInput);
        js.executeScript("arguments[0].click()",signUpbutton);

    }


}
