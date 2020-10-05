package com.cybertek.tests.day07_webtables.Tasks;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
Note: Use JavaFaker when possible.
1. Open browser
2. Go to website: http://practice.cybertekschool.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
 */
public class TC6_Cybertek_registration_form_confirmation {

    @Test
    public void CyberTekRegistration_Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        Faker faker = new Faker();
        WebElement firstNameElement = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameElement.sendKeys(faker.name().firstName()+ Keys.TAB + faker.name().lastName() +Keys.TAB +faker.name().username()+Keys.TAB);


    }
}
