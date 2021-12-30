@calculator
Feature: Calculator Tests

  Background:
    Given User is on calculator page

  Scenario: Adding
    Given User clicks on "5" on calculator
    And User clicks on "+" on calculator
    And User clicks on "3" on calculator
    Then result "8" should be displayed

  Scenario: Subtracting
    Given User clicks on "9" on calculator
    And User clicks on "–" on calculator
    And User clicks on "5" on calculator
    Then result "4" should be displayed

  Scenario: Multiplying
    Given User clicks on "8" on calculator
    And User clicks on "×" on calculator
    And User clicks on "7" on calculator
    Then result "56" should be displayed

  Scenario: Dividing
    Given User clicks on "8" on calculator
    And User clicks on "/" on calculator
    And User clicks on "2" on calculator
    Then result "4" should be displayed