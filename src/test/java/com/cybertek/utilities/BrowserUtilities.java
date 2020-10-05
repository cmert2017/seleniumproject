package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtilities {

    /**
     Accepts a list of Web Element
      @param list<WebElement>
      @return List<String>
      Method should be returning a list of Strings
     */
    public static List<String> getElementsText(List<WebElement> list){

        List<String> webelementsAsString = new ArrayList<>();

        for (WebElement each : list) {
            webelementsAsString.add(each.getText());
        }
        return webelementsAsString;

    }


    /**
     * Create a utility method named: wait
     * static method
     *
     * @param sec
     * @return void
     * The integer number that I pass as parameter should be accepted as SECONDS
     * Handle checked exception with try/catch
     */
    public static void wait(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }


}
