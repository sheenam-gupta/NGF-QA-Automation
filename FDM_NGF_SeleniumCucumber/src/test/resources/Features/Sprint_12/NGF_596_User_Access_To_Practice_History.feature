@Sprint12
# Paola Luna

Feature: User views past practice sessions on IPrep
  Scenario: Secure Access to User-Specific Practice History for Mock Interview
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User navigates to IPrep Module
    When User navigates to the simulate interview page
    Then A welcome message for the username is displayed
    And User clicks on Practice History button
    Then User should see the practice history table
    And User should see the date, type of session and performance summary
    When User clicks on the view button of the practice history table
    Then A detailed feedback with questions, answers and individual feedbacks is provided.