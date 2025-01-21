@Sprint4
Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

  Scenario: User logs in with invalid credentials
    Given User is on the home page for login
    When User navigates to login page
    And User enters invalid username
    And User enters invalid password
    And User clicks on login button
    Then User should see an error message for invalid credentials
