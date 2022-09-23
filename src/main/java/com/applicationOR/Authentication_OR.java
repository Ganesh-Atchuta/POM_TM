package com.applicationOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication_OR {
    @FindBy(xpath="//h1[text()='Authentication']")
    public WebElement authenticationHeader;

    @FindBy(css="#email")
    public WebElement userName;

    @FindBy(css="#passwd")
    public WebElement passWord;

    @FindBy(css="#SubmitLogin")
    public WebElement signin;

    @FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
    public WebElement authenticationError;


}

