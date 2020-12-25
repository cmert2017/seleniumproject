package com.cybertek.tests.day05_testNG_into_dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNG_Introduction {
    @BeforeTest
    public void sampleBeforeTestMethod(){
        System.out.println("BeforeTest is running");
    }


    @AfterTest
    public void sampleAfterTestMethod(){
        System.out.println("AfterTest is running");
    }


    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public  void tearDownClass(){
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running....");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }

    @Test
    public void test3(){
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = "abdd";

        System.out.println("test3 is running...");

        /*Assert.assertTrue(str1.equals(str2));
        Assert.assertTrue(str1.equals(str3),"Str1 is not equal to Str3");
        Assert.assertEquals(str1,str3,"Str1 is not equal str2");*/
    }
}


class TestNG_int2{

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 in new class is running....");
    }




}



