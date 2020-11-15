package com.cybertek.tests.day14_excel_io;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderPractice {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;
    @FindBy(id = "prependedInput2")
    private WebElement passwordElement;
    public DataProviderPractice(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @Test(dataProvider = "usersTestData")
    public void ddtLoginTest1(String userName,String passWord){
        //login
        usernameElement.sendKeys(userName);
        passwordElement.sendKeys(passWord, Keys.ENTER);
        System.out.println(Driver.getDriver().getTitle());
    }

    @DataProvider
    public Object[][] usersTestData(){

        return new Object[][]{
                {"storemanager85", "UserUser123"},
                {"salesmanager110", "UserUser123"},
                {"user153", "UserUser123"},
                {"storemanager85", "UserUser123"}
        };
    }

    @Test(dataProvider = "userTestDataFromExcel")
    public void ddtLoginTest2(String execute, String username, String password, String firstname, String lastname){

        System.out.println("User name is: "+ firstname + " " + lastname + ", execute ? " + execute);
        if(execute.equals("y")) {
            usernameElement.sendKeys(username);
            passwordElement.sendKeys(password, Keys.ENTER);
            System.out.println(Driver.getDriver().getTitle());
        }else{
            throw new SkipException("Test was skipped");
            }
    }


    @DataProvider
    public Object[][] userTestDataFromExcel(){
        ExcelUtil excelUtil = new ExcelUtil("vytrack_testusers.xlsx", "QA3-short");
        return excelUtil.getDataArray();
    }


    @BeforeMethod
    public void setup(){
        PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
       Driver.closeDriver();
    }


}
