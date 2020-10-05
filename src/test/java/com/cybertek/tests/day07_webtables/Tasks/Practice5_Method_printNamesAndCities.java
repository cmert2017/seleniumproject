package com.cybertek.tests.day07_webtables.Tasks;
/*
• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
• Create a new TestNG com.cybertek.extrapractice.test to com.cybertek.extrapractice.test if the method is working as expected.
• Output should be like:
• Name1: name , City1: city
• Name2: name , City2: city
 */

import com.cybertek.utilities.SmartBearUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Practice5_Method_printNamesAndCities extends  SetUp{

    @Test
    public void printNamesAndCities_Test(){
         List<String> namesAndCities= SmartBearUtilities.printNamesAndCities(driver);
       String[] cities = {"Las Vegas, NV","Whitestone, British","Salmon Island","Bringtone, TX", "Earlcastle","Milltown, WI","Hillsberry, UT","Greentown, CA"};
       String[] names = {"Paul Brown","Mark Smith","Steve Johns","Charles Dodgeson","Susan McLaren","Bob Feather","Samuel Clemens","Clare Jefferson"};
       List<String> expectedNamesAndCities = new ArrayList<>();
        for (int i = 0,j=1; i < names.length; i++,j++) {
            expectedNamesAndCities.add("Name"+j+ ": "+names[i]+","+ " City"+j+": "+cities[i]);
        }


        for (int i = 0; i < expectedNamesAndCities.size(); i++) {
            Assert.assertEquals(namesAndCities.get(i),expectedNamesAndCities.get(i),"They are not  equal");
        }
    }
}
