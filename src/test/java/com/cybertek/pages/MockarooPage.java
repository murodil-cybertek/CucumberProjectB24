package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MockarooPage extends BasePage {

    @FindBy(name = "num_rows")
    public WebElement numberOfRowsField;

}
