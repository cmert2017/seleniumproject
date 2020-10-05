package com.cybertek.tests.day05_testNG_into_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNG_Introduction {
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

        Assert.assertTrue(str1.equals(str2));
        Assert.assertTrue(str1.equals(str3),"Str1 is not equal to Str3");
        Assert.assertEquals(str1,str3,"Str1 is not equal str2");
    }
}
