package com.cybertek.tests.day07_webtables.Tasks;

import com.cybertek.utilities.BrowserUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC8_Cybertek_month_dropdown_listofdefault_values_verification {

    @Test
    public void CyberTekRegistration_Test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        BrowserUtilities.wait(10);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement monthDropDownElement = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(monthDropDownElement);


        //version1
        List<WebElement> actualOptions = select.getOptions();
        List<String> expectedOptions = new ArrayList<>();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        expectedOptions.addAll(Arrays.asList(months));

        Assert.assertEquals(BrowserUtilities.getElementsText(actualOptions), expectedOptions);


        //version 2
       /* List<WebElement> actualOptions = select.getOptions();
        List<String >  actualOptinsAsString = new ArrayList<>();

        for (WebElement each : actualOptions) {
            actualOptinsAsString.add(each.getText());
        }

        for (String s : actualOptinsAsString) {
            System.out.println(s);
        }


        List<String> expectedOptions = new ArrayList<>();
      //  String[] months2 = new DateFormatSymbols().getMonths();
        String[] months = {"january", "February","March","April","May","June","July","August","September","October", "November", "December" };
        expectedOptions.addAll(Arrays.asList(months));
        System.out.println(Arrays.toString(months));
        System.out.println(expectedOptions);
        for (int i = 0; i < expectedOptions.size(); i++) {
            if(!expectedOptions.get(i).equalsIgnoreCase(actualOptinsAsString.get(i))){
                Assert.assertTrue(false);
                return;
            }
        }
        Assert.assertTrue(true);
    }*/

    }
}

