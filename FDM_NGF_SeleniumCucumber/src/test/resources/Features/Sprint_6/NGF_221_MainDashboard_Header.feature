# Author: Umaid Malik
@Sprint6
Feature: User tries features in the main dashboard header
  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

    Scenario: User logs out
      Given User should be logged in and see the homepage
      When User clicks on the logout button
      Then User should be logged out and see the homepage

    Scenario: Navigation to registration page
    Given User should be logged out and see the homepage
      When User navigates to registration page
      Then User should be in the registration page

    Scenario: Checking terms and conditions text
      Given User should be logged out and see the homepage
      When User navigates to registration page
      And User clicks on the terms, conditions and privacy policies link
      Then The body of the text should read as outlined

