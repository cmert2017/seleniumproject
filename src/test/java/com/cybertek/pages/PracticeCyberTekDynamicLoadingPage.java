package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeCyberTekDynamicLoadingPage {

    public PracticeCyberTekDynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath= "//input[@type='username']")
    public WebElement usernameInputbox;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath="//div[@id='flash']")
    public WebElement errorMessage;

    @FindBy(xpath="//div[@id='loading']")
    public WebElement loadingBar;

    @FindBy(xpath="//button[.='Start']")
    public WebElement startButton;


}

