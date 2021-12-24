package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyAllCategoriesPage {
    public EtsyAllCategoriesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.='All categories']")
    public WebElement allCategoriesHeader;

}
