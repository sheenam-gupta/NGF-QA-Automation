@Sprint7
# Author: Umaid Malik
Feature: Username should only be a single word with no spaces, can have special characters

  Scenario: User enters a username and verifies the validity
    Given User is on the home page for login
    When User navigates to registration page
    And User selects a security question
    Then User should see a dropdown menu containing the predefined security questions