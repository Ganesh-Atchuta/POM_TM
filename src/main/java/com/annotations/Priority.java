package com.annotations;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    public void login(){
        System.out.println("User Logged In");
    }
    @Test
    public void NoPriority(){
        System.out.println("No Priority TestCase");
    }
    @Test(priority = 3)
    public void log_Out(){
        System.out.println("User Logged Out");
    }
    @Test(priority = 2)
    public void Reg_User(){
        System.out.println("User Registered");
    }
}
