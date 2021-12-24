@etsy @regression #this is a tag
Feature: User etsy search
  As a user, when i search for item, I should see the results.

  Scenario: User search for wooden spoon
    Given User is on etsy homepage
    Then Page title should be as expected
    When User searches for wooden spoon
    Then Page title should start with wooden spoon

  Scenario: Users empty search
    Given User is on etsy homepage
    Then Page title should be as expected
    When User searches for empty value
    Then All categories should be displayed

