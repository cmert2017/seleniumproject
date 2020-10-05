package com.cybertek.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//Mini-Task:
    //#1- Create a new class called : SmartBearUtilities
public class SmartBearUtilities {


    //#2- Create a static method called loginToSmartBear

    /**
     * This method help us to login into smartbear website
     * @param driver
     * @throws InterruptedException
     */
     public static void loginToSmartBear(WebDriver driver) throws InterruptedException, IOException {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            String url = properties.getProperty("smartbearUrl");


         //#3- This method simply logs in to SmartBear when you call it.
         //#4- Accepts WebDriver type as parameter
         driver.get(url);

         Thread.sleep(3000);
         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
         //4. Enter password: “com.cybertek.extrapractice.test”
         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("com/cybertek/extrapractice/test");

         //5. Click to Login button
         driver.findElement(By.id("ctl00_MainContent_login_button")).click();

     }


     public static void verifyOrder(WebDriver driver , String name){

        //first way
         //List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
         //List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));
         List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
         List<String> nameElementAsString = new ArrayList<>();
         for (WebElement nameElement : nameElements) {
             nameElementAsString.add(nameElement.getText());
         }

         Assert.assertTrue(nameElementAsString.contains(name));



         //second way
        /*
        List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
        int actualCountName = 0;
         for(WebElement each : nameElements){
             System.out.println(each.getText());
             if(each.getText().equalsIgnoreCase(name)){
                 actualCountName++;
             }
         }*/
        /* int expectedCountName = 1 ;
         Assert.assertTrue(actualCountName >= expectedCountName,"The name is not in the list");
*/



         /*//third way
         List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
         for (WebElement nameElement : nameElements) {
             if(nameElement.getText().equalsIgnoreCase(name)){
                 Assert.assertTrue(true);
                 return;
             }

         }
         Assert.fail("The name is not in the list");
         */


     }


     public static List<String> printNamesAndCities(WebDriver driver){

         List<WebElement> nameElements = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
         List<WebElement> cityElements = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]/following-sibling::td[5]"));
         List<String>  namesAndCities = new ArrayList<>();
         for (int i = 0 , j = 1; i < nameElements.size(); i++ , j++) {
            System.out.println("Name"+j+ ": "+nameElements.get(i).getText()+","+ " City"+j+": "+cityElements.get(i).getText());
            namesAndCities.add("Name"+j+ ": "+nameElements.get(i).getText()+","+ " City"+j+": "+cityElements.get(i).getText());
         }

         return namesAndCities;
     }


    /**
     * This methods deletes the given name  from the list
     * @param driver
     * @param name
     * @throws InterruptedException
     */
     public static void removeName(WebDriver driver, String name) throws InterruptedException {
         WebElement toBeRemovedElement = driver.findElement(By.xpath("//td[.='"+name+"']/preceding-sibling::td"));
         toBeRemovedElement.click();

         WebElement deleteButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
         deleteButton.click();

         Thread.sleep(3000);

         List<WebElement> allNamesAfterDeletetion = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));

         for (WebElement eachName : allNamesAfterDeletetion) {
             if(eachName.getText().equals(name)){
                 Assert.fail("The name was not deleted");
             }
         }
         Assert.assertTrue(true,name + " is already deleted");

     }



    public static void tearDown(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
