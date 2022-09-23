package com.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dependency {
    org.testng.asserts.SoftAssert SoftAssert=new SoftAssert();
    @AfterMethod
    public void afterMethod(){
        SoftAssert.assertAll();
    }
    @Test
    public void login(){
        int a=10;
        int b=30;
        SoftAssert.assertEquals(a,b,"Error in Message");
        System.out.println("Hard Assertion check");
    }
    @Test(dependsOnMethods ="login")
    public void userReg(){
        System.out.println("check my dependency");
    }
}
