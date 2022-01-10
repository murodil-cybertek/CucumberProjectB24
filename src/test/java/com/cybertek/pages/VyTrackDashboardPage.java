package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackDashboardPage extends BasePage{

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement fullName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    public void logout() {
        fullName.click();
        logOutLink.click();
    }
}
