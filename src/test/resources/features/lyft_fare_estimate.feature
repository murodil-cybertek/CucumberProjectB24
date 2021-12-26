Feature: Searching Lyft fare details

  As a rider , I should be able to enter pickup and drop off locations so that I can see the estimated fare

  Scenario: Fare estimate using City
    Given User is on lyft fare estimate page
    When User enters "Mclean, VA" to pickup address
    And User enters "Woodbridge, VA" to drop-off address
    And User clicks on get estimate button
    Then User should see estimated prices
