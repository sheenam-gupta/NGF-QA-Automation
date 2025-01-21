@Sprint11
#Paola Luna

Feature: User views past practice sessions on IPrep
  Scenario: Implement Practice History UI in Intelli-Prep
    Given User is on the home page
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    And User navigates to IPrep Module
    When User navigates to the simulate interview page
    And User clicks on Practice History button
    Then User should see the practice history table
    And User should see the date, type of session and performance summary
    When User clicks on the view button of the practice history table
    Then A detailed feedback with questions, answers and individual feedbacks is provided.

