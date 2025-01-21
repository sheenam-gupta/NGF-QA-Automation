@Sprint7
Feature: User navigates to the registration page and enters invalid date of birth

  Scenario Outline: User enters invalid date of birth
    Given User is on the home page for login
    When User navigates to registration page
    And User enters date of birth '<dob>' for registration
    Then User should see an error message for invalid dob
    Examples:
      | dob      |
      | 11111321 |
      | 17991000 |