package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddSpartanPage extends BasePage {

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "genderSelect")
    public WebElement genderElem;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "submit_btn")
    public WebElement submitBtn;

    public void selectGender(String gender) {
        new Select(genderElem).selectByVisibleText(gender);
    }

}
