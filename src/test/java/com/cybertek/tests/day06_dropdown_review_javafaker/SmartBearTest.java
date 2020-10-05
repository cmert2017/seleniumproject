package com.cybertek.tests.day06_dropdown_review_javafaker;

import com.cybertek.utilities.SmartBearUtilities;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTest {


    //TC #1: Smartbear software link verification
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1-go to google
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        /*//3. Enter username: “Tester”
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //4. Enter password: “com.cybertek.extrapractice.test”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("com.cybertek.extrapractice.test");

        //5. Click to Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        */
        SmartBearUtilities.loginToSmartBear(driver);


    }


    @Test
    public void task1_login_page_links_print_test() throws InterruptedException {


        //6. Print out count of all the links on landing page

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println(allLinks.size());


        //7. Print out each link text on this page
        for(WebElement each : allLinks){
            System.out.println(each.getText()+" and its link " + each.getAttribute("href"));
        }
    }

    @Test
    public void Smartbear_software_order_placing() throws InterruptedException {
        //6. Click on Order
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Order']")).click();

        //7. Select familyAlbum from product, set quantity to 2
        WebElement productDropDown = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select productDropDownSelectElement = new Select(productDropDown);
        productDropDownSelectElement.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys("2");
        Thread.sleep(1000);

        //8. Click to “Calculate” button
        driver.findElement(By.cssSelector(".btn_dark")).click();

        //locating all of the web elements using id
        WebElement namebox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));


        //9. Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code
        Faker faker = new Faker();
        namebox.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().cityName());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replace("-", ""));

        //10. Click on “visa” radio button

        WebElement visaElement = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaElement.click();

        //11. Generate card number using JavaFaker
        WebElement creditCardBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditCardBox.sendKeys(faker.finance().creditCard().replaceAll("-", ""));

        //expiration date
        WebElement expirationDateElement = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationDateElement.sendKeys("12/25");


        //12. Click on “Process”
        WebElement processButtonElement = driver.findElement(By.className("btn_light"));
        processButtonElement.click();


        //13.Verify success message “New order has been successfully added.”

        WebElement succesMessageElement = driver.findElement(By.xpath("//div//strong"));
        String actualSuccesMessageElement = succesMessageElement.getText();

        String expectedsuccessMessage = "New orders has been successfully added.";
        Assert.assertTrue(succesMessageElement.isDisplayed());
        Assert.assertEquals(expectedsuccessMessage,actualSuccesMessageElement);

    }


    @Test
    public void TC2() throws InterruptedException {
        //TC#2: Smartbearsoftware order placing
        //1.Open browser
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: “Tester”
        // 4.Enter password: “com.cybertek.extrapractice.test”
        // 5.Click on Login button
        // 6.Click on Order
        // 7.Select familyAlbum from product, set quantity to 2
        // 8.Click to “Calculate” button
        // 9.Fill address Info with JavaFaker
        // •Generate: name, street, city, state, zip code
        // 10.Click on “visa” radio button
        // 11.Generate card number using JavaFaker
        // 12.Click on “Process”
        // 13.Verify success message “New order has been successfully added.”
        Faker faker = new Faker();
        //loginToSmartBear(driver);
        WebElement orderLink = driver.findElement(By.xpath("//ul[@id='ctl00_menu']/li[3]/a"));
        orderLink.click();
        Thread.sleep(500);
        WebElement quantityFamilyAlbum = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtQuantity"));
        quantityFamilyAlbum.sendKeys(Keys.BACK_SPACE, "2");
        Thread.sleep(500);
        WebElement calculateButton = driver.findElement(By.cssSelector("input.btn_dark"));
        calculateButton.click();
        Thread.sleep(500);
        WebElement nameInput = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName"));
        nameInput.sendKeys(faker.name().fullName());
        Thread.sleep(500);
        WebElement streetInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        streetInput.sendKeys(faker.address().streetAddress());
        Thread.sleep(500);
        WebElement cityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        cityInput.sendKeys(faker.address().city());
        Thread.sleep(500);
        WebElement stateInput = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        stateInput.sendKeys(faker.address().state());
        Thread.sleep(500);
        WebElement zipInput = driver.findElement(By.xpath("//input[contains(@name, 'Content$fmwOrder$TextBox5')]"));
        zipInput.sendKeys(faker.address().zipCode().replaceAll("-", ""));
        Thread.sleep(500);
        WebElement visaRadio = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadio.click();
        Thread.sleep(500);
        WebElement creditCardInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        //creditCardInput.sendKeys(faker.finance().creditCard().replaceAll("-", ""));
        creditCardInput.sendKeys(faker.number().digits(16));
        Thread.sleep(500);
        WebElement expiryDateInput = driver.findElement(By.xpath("//*[contains(@name,'Content$fmwOrder$TextBox1')]"));
        expiryDateInput.sendKeys("12/25");
        Thread.sleep(500);
        WebElement processButton = driver.findElement(By.cssSelector("a#ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();
        Thread.sleep(500);
        WebElement successMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message was not displayed");
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}