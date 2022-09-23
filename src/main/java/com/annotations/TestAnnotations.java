package com.annotations;

import com.genericmethods.Weblib;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestAnnotations {
    Weblib weblib=new Weblib();

    @BeforeSuite
    public void beforeSuite(){

        weblib.launchBrowser();
    }

    @AfterMethod
    public void afterMethod(){
        weblib.checkError();
    }

}
