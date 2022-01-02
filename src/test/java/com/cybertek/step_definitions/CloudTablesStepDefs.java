package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTablesStepDefs {
    @Given("User is on cloudtables homepage")
    public void user_is_on_cloudtables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        Assert.assertEquals("Editor | Editing for DataTables", Driver.getDriver().getTitle());
    }

    @When("User clicks on New button")
    public void user_clicks_on_new_button() {

    }

    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String string) {

    }

    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String string) {

    }

    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String string) {

    }

    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String string) {

    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {

    }
}
