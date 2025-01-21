@Recommend_Strong_Passwords
@Sprint15

Feature: Ensure strong passwords are recommended to users.

  Scenario: Verify strong passwords are recommended to users.
    Given User is on the home page
    When User navigates to the registration page
    And User is able to see the suggest password button
    Then User is able to click the button
    When User is able to see a suggest password 
    Then user is able to verify it is at least eight characters, mix of upper case and lowercase, and at least one numeric and one special character