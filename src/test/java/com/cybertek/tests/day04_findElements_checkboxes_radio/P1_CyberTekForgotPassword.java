package com.cybertek.tests.day04_findElements_checkboxes_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_CyberTekForgotPassword {

    public static void main(String[] args) throws InterruptedException {
        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        System.setProperty("webdriver.chromedriver","chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));
        //b. “Forgot password” header
        WebElement elementOfForgotPasswordHEader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //c. “E-mail” text
        WebElement elementOfEmailText = driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement elementOfEmailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //e. “Retrieve password” button
        WebElement elementOfRetrievePassword = driver.findElement(By.cssSelector("button#form_submit"));
        driver.findElement(By.cssSelector("button#form_submit")).click();
        //driver.findElement(By.cssSelector("button#form_submit>i")).click();

        //f. “Powered by Cybertek School” text
        WebElement elementOfPoweredByText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all WebElements are displayed.
        if(homeLink.isDisplayed() && elementOfEmailInputBox.isDisplayed() && elementOfEmailText.isDisplayed() &&
        elementOfForgotPasswordHEader.isDisplayed()&&elementOfRetrievePassword.isDisplayed()&& elementOfPoweredByText.isDisplayed()){
            System.out.println("Verification Test: Passed");
        }else{
            System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
            System.out.println("elementOfEmailInputBox.isDisplayed() = " + elementOfEmailInputBox.isDisplayed());
            System.out.println("elementOfEmailText.isDisplayed() = " + elementOfEmailText.isDisplayed());
            System.out.println("elementOfForgotPasswordHEader.isDisplayed() = " + elementOfForgotPasswordHEader.isDisplayed());
            System.out.println("elementOfPoweredByText.isDisplayed() = " + elementOfPoweredByText.isDisplayed());
            System.out.println("elementOfRetrievePassword.isDisplayed() = " + elementOfRetrievePassword.isDisplayed());
        }


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //listing all the elements which have link
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        for (WebElement each: elements){
            System.out.println(each.getText());
        }

        //Better if you do with both XPATH and CSS

        Thread.sleep(3000);
        driver.close();
    }
}
