package com.applicationBehaviour;

import com.applicationOR.Authentication_OR;
import com.applicationOR.Homepage_OR;
import com.genericmethods.Weblib;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Authentication extends Weblib {
    Authentication_OR authentication_or;
    public Authentication(){

        this.authentication_or= PageFactory.initElements(driver,Authentication_OR.class);
    }
    public void validAuthenticationpageTitle(){
        String pageTitle=getpageTitle();
        Assert.assertEquals(true,pageTitle.startsWith("Login"));
    }
    public void checkAuthenticationHeader(){
        boolean Status=CheckElementExist(authentication_or.authenticationHeader,"Authentication","Authentication Header");
        Assert.assertEquals(true,Status,"Authentication header not found");
    }
    public void validateUserlogin(String userName,String passWord){
        enterdata(authentication_or.userName,userName);
        enterdata(authentication_or.passWord,passWord);
        clickElement(authentication_or.signin);
        boolean Status=CheckElementExist(authentication_or.authenticationError,"Authentication","Authentication Header");
        softAssert.assertEquals(true,Status,"Invalid userName:"+userName);

    }
}
