package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MockarooPage extends BasePage {

    @FindBy(name = "num_rows")
    public WebElement numberOfRowsField;

    @FindBy(id = "mui-component-select-file_format")
    public WebElement formatDropDown;

    @FindBy(xpath = "//li[.='Excel']")
    public WebElement excelOption;

    public void selectExcelFormat() {
        //BrowserUtils.
        formatDropDown.click();
        excelOption.click();
    }
}
