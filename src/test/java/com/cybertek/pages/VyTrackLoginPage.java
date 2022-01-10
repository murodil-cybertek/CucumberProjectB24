package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackLoginPage extends BasePage {
    public WebElement _username;
    public WebElement _password;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

}
