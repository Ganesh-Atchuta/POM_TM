package com.annotations;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {
    SoftAssert SoftAssert=new SoftAssert();
    @AfterMethod
    public void afterMethod(){
        SoftAssert.assertAll();
    }
    @Test
    public void checkAssertions(){
        int a=10;
        int b=30;
        SoftAssert.assertEquals(a,b,"Error in Message");
        System.out.println("Hard Assertion check");
    }
}
