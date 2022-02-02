Feature: Add new spartan

  Scenario: Add new spartan on UI and Compare with Confirmation page
    Given User is on spartan home page
    When User goes to Web Data page
    And clicks on add spartan
    And enters following data and submits:
      | name | Wooden Tester |
      | gender | Male |
      | phone | 1231231234 |
    Then success message should be displayed
    And data on confirmation page must be same

    @db
  Scenario: Add new spartan on UI and Compare with Oracle Database
    Given User is on spartan home page
    When User goes to Web Data page
    And clicks on add spartan
    And enters following data and submits:
      | name | Wooden Tester |
      | gender | Male |
      | phone | 1231231234 |
    Then success message should be displayed
    And data in database must be match
