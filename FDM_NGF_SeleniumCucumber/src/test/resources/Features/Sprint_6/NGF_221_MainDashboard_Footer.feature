# Author: Umaid Malik
@Sprint6
Feature: User tries features in the IPrep Interview Tips submodule
  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage