package com.cybertek.tests.day07_webtables.Tasks;

import com.cybertek.utilities.SmartBearUtilities;
import org.testng.annotations.Test;

/*
• Create a method named verifyOrder in SmartBearUtils class.
• Method takes WebDriver object and String(name).
• Method should verify if given name exists in orders.
• This method should simply accepts a name(String), and assert whether
given name is in the list or not.
• Create a new TestNG com.cybertek.extrapractice.test to com.cybertek.extrapractice.test if the method is working as expected.
 */
public class Practice4_MethodVerifyOrder___ extends SetUp{


        @Test
        public void verifyOrder(){
            String nameToSearch = "Mark ";
           SmartBearUtilities.verifyOrder(driver , nameToSearch);

        }
}
