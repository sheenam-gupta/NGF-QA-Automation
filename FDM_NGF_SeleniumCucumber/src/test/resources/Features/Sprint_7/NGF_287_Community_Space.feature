# Author : Simon Salami
@Sprint7
Feature: Community Space Functionality

  Scenario: Logged out user clicks the community space link
    Given User is on the home page for login
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page

  Scenario: Logged in user clicks the community space link
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page


