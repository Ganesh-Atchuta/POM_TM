package com.testcases;

import com.annotations.TestAnnotations;
import com.applicationBehaviour.Authentication;
import com.applicationBehaviour.Homepage;
import com.testDataProviders.LoginDataProvider;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TC_55 extends TestAnnotations {
    @Test(testName = "navigate to authentication page",priority = 1)
    @Story("US-005")
    @Feature("User Registration")
    @Severity(SeverityLevel.CRITICAL)

    public void userLogin(){
        Homepage homepage=new Homepage();
        homepage.clickSignin();

        Authentication authentication=new Authentication();
        authentication.validAuthenticationpageTitle();
        authentication.checkAuthenticationHeader();

    }
    @Test(dataProviderClass = LoginDataProvider.class,dataProvider = "invalid",priority = 2)
    public void validUserCredentials(String userName,String passWord){
        Authentication authentication=new Authentication();
        authentication.validateUserlogin(userName,passWord);

    }
}
