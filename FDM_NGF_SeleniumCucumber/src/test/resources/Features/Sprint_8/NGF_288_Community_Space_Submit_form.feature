#Paola Luna
@Sprint8
Feature: Community Space Submit Suggestion form is displayed

  Scenario: Logged out user navigates to the suggestion form
    Given User is on the home page for login
    When User clicks on the Community Space button
    And User clicks on submit a suggestion button
    Then User is navigated to the suggestion form
    When User clicks on discard my suggestion button
    Then User has its suggestion discarded

  Scenario: Logged in user navigates to the suggestion form
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page
    And User clicks on submit a suggestion button
    Then User is navigated to the suggestion form
    When User clicks on discard my suggestion button
    Then User has its suggestion discarded