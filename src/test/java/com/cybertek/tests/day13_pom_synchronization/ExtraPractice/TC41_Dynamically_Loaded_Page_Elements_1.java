package com.cybertek.tests.day13_pom_synchronization.ExtraPractice;

import com.cybertek.pages.PracticeCyberTekDynamicLoadingPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Go to http://practice.cybertekschool.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert “Your username is invalid!” text is displayed.
Note: Follow POM
 */
public class TC41_Dynamically_Loaded_Page_Elements_1 {

        PracticeCyberTekDynamicLoadingPage practiceCyberTekDynamicLoadingPage;

    @Test(description = "practicing POM exercises")
    public void practicingPOM(){
        String url = ConfigurationReader.getProperty("practiceCyberTekDynamicLoading");
        Driver.getDriver().get(url);
        practiceCyberTekDynamicLoadingPage = new PracticeCyberTekDynamicLoadingPage();

        practiceCyberTekDynamicLoadingPage.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOf(practiceCyberTekDynamicLoadingPage.loadingBar));
        Assert.assertTrue(practiceCyberTekDynamicLoadingPage.usernameInputbox.isDisplayed(), "User input bos is not displayed");
        String username= "tomsmith";
        String password= "incorrectpassword";
        practiceCyberTekDynamicLoadingPage.usernameInputbox.sendKeys(username);
        practiceCyberTekDynamicLoadingPage.passwordBox.sendKeys(password);

        practiceCyberTekDynamicLoadingPage.submitButton.click();

        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = practiceCyberTekDynamicLoadingPage.errorMessage.getText();


        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "Errormessage is not displayed");
    }

}
