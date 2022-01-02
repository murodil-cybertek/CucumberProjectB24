package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablesPage {
    public CloudTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //all WebElements with locators. Reusable
    //methods. for some actions on the page

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newBtn;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameField;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameField;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionField;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryField;

    @FindBy(className = "btn")
    public WebElement createBtn;


}
