package com.cybertek.step_definitions;

import com.cybertek.pages.MockarooPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.List;

public class MockarooStepDefs {

    MockarooPage mockarooPage = new MockarooPage();

    @Given("User is on mockaroo homepage")
    public void user_is_on_mockaroo_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mockaroo.url"));
    }

    @Given("Number of rows is {int}")
    public void number_of_rows_is(int rowsCount) {
        //mockarooPage.numberOfRowsField.clear();
        mockarooPage.numberOfRowsField.sendKeys(Keys.DELETE);
        mockarooPage.numberOfRowsField.sendKeys(rowsCount+"");
    }

    @Given("Format is Excel")
    public void format_is_excel() {
        mockarooPage.formatDropDown.click();
        mockarooPage.excelOption.click();
    }

    @When("User clicks on preview")
    public void user_clicks_on_preview() {

    }

    @Then("following columns should be displayed:")
    public void following_columns_should_be_displayed(List<String> expectedColumns) {

    }

    @Then("{int} rows of data should be displayed")
    public void rows_of_data_should_be_displayed(Integer int1) {

    }
}
