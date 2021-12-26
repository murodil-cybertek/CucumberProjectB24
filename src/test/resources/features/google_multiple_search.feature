@google
Feature: Passing multiple parameters to the step

  Scenario: User searches for multiple items
    Given User is on Google home page
    Then User should be able to search for following:
      |java|
      |selenium|
      |cucumber bdd|
      |QA automation|
      |wooden spoon|
