package com.annotations;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
    @DataProvider(name="QAlogin")
    public Object[][] qaUsers(){

        Object[][]arr=new Object[3][2];

        arr[0][0]="User_01";
        arr[0][1]="Pswd_01";

        arr[1][0]="User_02";
        arr[1][1]="Pswd_02";

        arr[2][0]="User_03";
        arr[2][1]="Pswd_03";

        return arr;
    }
}
