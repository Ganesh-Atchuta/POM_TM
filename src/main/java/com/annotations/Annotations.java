package com.annotations;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before the test suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After the test suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before the test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After the test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before the test method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After the test method ");
    }
}
