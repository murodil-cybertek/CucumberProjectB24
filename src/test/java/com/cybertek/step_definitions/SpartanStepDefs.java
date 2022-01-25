package com.cybertek.step_definitions;

import com.cybertek.pages.AddSpartanPage;
import com.cybertek.pages.SpartanHomePage;
import com.cybertek.pages.SpartansDataTablePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class SpartanStepDefs {

    @Given("User is on spartan home page")
    public void user_is_on_spartan_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("spartan.url"));
    }

    @When("User goes to Web Data page")
    public void user_goes_to_web_data_page() {
        SpartanHomePage homePage = new SpartanHomePage();
        homePage.webDataLink.click();
    }

    @When("clicks on add spartan")
    public void clicks_on_add_spartan() {
        SpartansDataTablePage dataTablePage = new SpartansDataTablePage();
        dataTablePage.addSpartanBtn.click();
    }

    @When("enters following data and submits:")
    public void enters_following_data_and_submits(Map<String, String> spartanInfo) {
        AddSpartanPage addSpartanPage = new AddSpartanPage();
        addSpartanPage.name.sendKeys(spartanInfo.get("name"));
        addSpartanPage.selectGender(spartanInfo.get("gender"));
        addSpartanPage.phone.sendKeys(spartanInfo.get("phone"));
        addSpartanPage.submitBtn.click();
    }

    @Then("success message should be displayed")
    public void success_message_should_be_displayed() {

    }

    @Then("data on confirmation page must be same")
    public void data_on_confirmation_page_must_be_same() {

    }
}
