package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackLoginPage extends BasePage {
    //no need for @FindBy, since "name" in html is matching variable name
    public WebElement _username;
    public WebElement _password;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String userName, String password) {
        _username.sendKeys(userName);
        _password.sendKeys(password);
        loginBtn.click();
    }

}
