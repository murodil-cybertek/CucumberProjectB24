package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LyftFareEstimatePage {
    public LyftFareEstimatePage() {
        //init elem statement:
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "fare-start")
    public WebElement pickUp;

    @FindBy(name = "fare-end")
    public WebElement dropOff;

    @FindBy(xpath = "//button[.='Get estimate']")
    public WebElement getEstimateBtn;

    public void enterPickUpLocation(String location) {
        pickUp.sendKeys(location);
    }

}
