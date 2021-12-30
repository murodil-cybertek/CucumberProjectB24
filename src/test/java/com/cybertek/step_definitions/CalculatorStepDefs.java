package com.cybertek.step_definitions;

import com.cybertek.pages.CalculatorPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalculatorStepDefs {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @Given("User clicks on {string} on calculator")
    public void user_clicks_on_on_calculator(String buttonText) {
        calculatorPage.clickOn(buttonText);
    }

    @Then("result {string} should be displayed")
    public void result_should_be_displayed(String string) {

    }
}
