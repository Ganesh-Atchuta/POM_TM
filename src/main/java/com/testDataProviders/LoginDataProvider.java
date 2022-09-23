package com.testDataProviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name="invalid")
    public Object[][] getUserDetails(){
        Object[][] userDetails=new Object[3][2];
        userDetails[0][0]="abc@gmail.com";
        userDetails[0][1]="pswd123";

        userDetails[1][0]="bcd@gmail.com";
        userDetails[1][1]="pswd234";

        userDetails[2][0]="cde@gmail.com";
        userDetails[2][1]="pswd345";


        return userDetails;
    }
}
