package com.applicationBehaviour;

import com.applicationOR.Homepage_OR;
import com.genericmethods.Weblib;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Weblib {
    Homepage_OR homepage_or;
    public Homepage(){

        this.homepage_or= PageFactory.initElements(driver,Homepage_OR.class);
    }
    @Step("Clicking Signin on homepage")
    public void clickSignin(){
        homepage_or.signin.click();
    }
}
