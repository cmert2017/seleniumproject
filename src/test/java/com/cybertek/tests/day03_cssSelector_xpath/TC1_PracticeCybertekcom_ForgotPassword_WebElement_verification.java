package com.cybertek.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
/*
XPATH and CSSSelector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
Better if you do with both XPATHand CSSselector for practice purposes.
 */
public class TC1_PracticeCybertekcom_ForgotPassword_WebElement_verification {

    public static void main(String[] args) throws Exception{
        //1. Open Chrome browser
        System.setProperty("Webdriver.chromedriver","chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a.Locating "Home" Link

        //by absolute xpath
         //WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        //by relative xpath
        //WebElement homelink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //by relative xpath
        //WebElement homeLink = driver.findElement(By.xpath("//*[@class='nav-link']"));

        //by relative xpath
        //WebElement homeLink = driver.findElement(By.xpath("//*[@class='nav-link']"));

        //by relative xpath
        //WebElement homeLink = driver.findElement(By.xpath("//*[@href='/']"));

        //by cssSelector
        WebElement homeLink = driver.findElement(By.cssSelector("ul.navbar-nav  li:last-child a.nav-link"));

        //4.verification of Whether the WebElement is displayed or not
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        //Extra Part1
        System.out.println("homeLink.getText() = " + homeLink.getText());
        System.out.println("homeLink.getSize() = " + homeLink.getSize());
        System.out.println("homeLink.getLocation() = " + homeLink.getLocation());
        System.out.println("homeLink.getTagName() = " + homeLink.getTagName());

        //Extra Part2
        System.out.println("Before homeLink click, the driver.getTitle() = " + driver.getTitle());
        System.out.println("Before homeLink click, driver.getCurrentUrl() = " + driver.getCurrentUrl());
        homeLink.click();
        System.out.println("After homeLink click, the driver.getTitle() = " + driver.getTitle());
        System.out.println("After homeLink click, driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //navigate back to forgot password page
        driver.navigate().back();
        System.out.println("============================================================");

        //3.b.Locating "Forgot Password" Header
        //by Absolute  xpath
        //WebElement forgotPasswordHeader = driver.findElement(By.xpath("/html/body/div/div/div/div/h2"));

        //by Relative xpath
        //WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2"));

         //by cssSelector
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div.example>h2"));

        //4.verification of Whether the WebElement is displayed or not
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        //Extra Part
        System.out.println("forgotPasswordHeader.getText() = " + forgotPasswordHeader.getText());
        System.out.println("forgotPasswordHeader.getSize() = " + forgotPasswordHeader.getSize());
        System.out.println("forgotPasswordHeader.getLocation() = " + forgotPasswordHeader.getLocation());
        System.out.println("forgotPasswordHeader.getTagName() = " + forgotPasswordHeader.getTagName());

        System.out.println("============================================================");

        //3.c.Locating "E-mail" text
        //by cssSelector
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

         //by Relative xpath
        //WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));

        //4.verification of Whether the WebElement is displayed or not
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());

        //Extra Part
        System.out.println("forgotPasswordHeader.getText() = " + forgotPasswordHeader.getText());
        System.out.println("forgotPasswordHeader.getSize() = " + forgotPasswordHeader.getSize());
        System.out.println("forgotPasswordHeader.getLocation() = " + forgotPasswordHeader.getLocation());
        System.out.println("forgotPasswordHeader.getTagName() = " + forgotPasswordHeader.getTagName());

        System.out.println("============================================================");
        //3.d.Locating E-mail input box
        //by cssSelector
         WebElement emailInputBox = driver.findElement(By.cssSelector("input[required='']"));
         emailInputBox.sendKeys("myEmail@domain.com");

         //by Relative xpath
         //WebElement emailInputBox = driver.findElement(By.xpath("//*[contains(@pattern,'[a-z')]"));
         //emailInputBox.sendKeys("myEmail@domain.com");



        //4.verification of Whether the WebElement is displayed or not
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());

        //Extra Part
        System.out.println("emailInputBox.getText() = " + emailInputBox.getText());
        System.out.println("emailInputBox.getSize() = " + emailInputBox.getSize());
        System.out.println("emailInputBox.getLocation() = " + emailInputBox.getLocation());
        System.out.println("emailInputBox.getTagName() = " + emailInputBox.getTagName());

        System.out.println("============================================================");
        //3.e.Locating “Retrieve password” button
        //by cssSelector
         WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));
         retrievePasswordButton.click();

         //by Relative xpath
         //WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[contains(@id,'s')]"));



        //4.verification of Whether the WebElement is displayed or not
        System.out.println("retrievePasswordButton.isDisplayed() = " + emailInputBox.isDisplayed());

        //Extra Part
        System.out.println("retrievePasswordButton.getText() = " + retrievePasswordButton.getText());
        System.out.println("retrievePasswordButton.getSize() = " + retrievePasswordButton.getSize());
        System.out.println("retrievePasswordButton.getLocation() = " + retrievePasswordButton.getLocation());
        System.out.println("retrievePasswordButton.getTagName() = " + retrievePasswordButton.getTagName());

        System.out.println("============================================================");

         //3.f.Locating “Powered by Cybertek School” text
         //by cssSelector
          WebElement poweredByCybertekSchoolText = driver.findElement(By.cssSelector("div[style^='tex']"));

        //by Relative xpath
         //WebElement poweredByCybertekSchoolText = driver.findElement(By.xpath("//*[@style='text-align: center;']"));


         //4.verification of Whether the WebElement is displayed or not
         System.out.println("poweredByCybertekSchoolText.isDisplayed() = " + emailInputBox.isDisplayed());

         //Extra Part
         System.out.println("poweredByCybertekSchoolText.getText() = " + poweredByCybertekSchoolText.getText());
         System.out.println("poweredByCybertekSchoolText.getSize() = " + poweredByCybertekSchoolText.getSize());
         System.out.println("poweredByCybertekSchoolText.getLocation() = " + poweredByCybertekSchoolText.getLocation());
         System.out.println("poweredByCybertekSchoolText.getTagName() = " + poweredByCybertekSchoolText.getTagName());

         System.out.println("============================================================");




        //Extra Practice: Printing all the webElements whose tagName is a on the current page
        List<WebElement> a = driver.findElements(By.tagName("a"));
        for(WebElement each: a){
            System.out.println(each.getText());
        }
        Thread.sleep(5000);
        driver.close();
    }
}
