package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PercentageCalculatorPage {

    public PercentageCalculatorPage() {
        //init elem statement:
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@size='3']")
    public WebElement percent;

    @FindBy(xpath = "//input[@size='7']")
    public WebElement input;

    @FindBy(xpath = "(//input[@size='6'])[1]")
    public WebElement result;

}
