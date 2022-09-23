package com.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions {
    @Test
    public void checkAssertions(){
        int a=10;
        int b=50;
        Assert.assertEquals(a,b,"Error in Message");
        System.out.println("Hard Assertion check");
    }
}
