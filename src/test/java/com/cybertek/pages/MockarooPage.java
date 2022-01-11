package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MockarooPage extends BasePage {

    @FindBy(name = "num_rows")
    public WebElement numberOfRowsField;

    @FindBy(id = "mui-component-select-file_format")
    public WebElement formatDropDown;

    @FindBy(xpath = "//li[.='Excel']")
    public WebElement excelOption;

    @FindBy(xpath = "//span[.='Preview']")
    public WebElement previewBtn;

    @FindBy(xpath = "//table//th")
    public List<WebElement> tableHeaders;

    public void selectExcelFormat() {
        BrowserUtils.scrollDown(500);
        formatDropDown.click();
        BrowserUtils.sleep(1);
        excelOption.click();
    }
}
