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

    Scenario: User reads the about page
      Given User should be logged in and see the homepage
      When User navigates to the about page
      Then User should see our vision statements on the about page
      And User should see our mission statements on the about page