package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class PercentageCalculatorStepDefs {
    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
        
    }
    
    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer, Integer> valuesMap) {
        System.out.println("valuesMap = " + valuesMap);
    }
}
