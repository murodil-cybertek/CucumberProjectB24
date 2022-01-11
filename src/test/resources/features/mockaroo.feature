@Mockaroo
Feature: Mockaroo random data generation

  Background:
    Given User is on mockaroo homepage
    And Number of rows is 100
    And Format is Excel

  Scenario: Generate 100 rows of random data
    When User clicks on preview
    Then following columns should be displayed:
      |id           |
      |first_name   |
      |last_name    |
      |email        |
      |gender       |
      |ip_address   |
    And 100 rows of data should be displayed
