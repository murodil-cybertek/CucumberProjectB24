package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LyftFareEstimateStepDefs {

    @Given("User is on lyft fare estimate page")
    public void user_is_on_lyft_fare_estimate_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lyft.fare.estimate.url"));
        String expectedTitle = "Get Fare Estimates for Your City - Lyft Price Estimate | Lyft";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Lyft fare estimate page is not displayed", expectedTitle, actualTitle);
    }

    @When("User enters {string} to pickup address")
    public void user_enters_to_pickup_address(String pickUpLocation) {

    }

    @And("User enters {string} to drop-off address")
    public void user_enters_to_drop_address(String dropOffLocation) {

    }

    @And("User clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {

    }

    @Then("User should see estimated prices")
    public void user_should_see_estimated_prices() {

    }

}
