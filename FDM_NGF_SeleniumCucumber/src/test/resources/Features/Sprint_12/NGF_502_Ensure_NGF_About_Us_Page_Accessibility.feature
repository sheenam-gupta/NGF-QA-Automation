#Author: Daniel Usani
@Sprint12

Feature: Ensure NGF "About Us" Page Accessibility via "About" Button from Mortgage Advisor
  As a user,
  I want the ability to navigate back to the "About Us" page from the submodule view
  So that I can easily return to the "About Us" page where the mission/vision statement is located.

  Scenario: Verify "About" button navigation to the "About Us" page
    Given User is on the home page
    When User navigates to login page
  And User enters their username and password and clicks the log in button
    When User navigates to the about page
    Then User should see our vision statements on the about page
    When User clicks on Home button
    When User explores Finwise module and then launch Mortgage Advisor
    When User navigates to the about page
    Then User should see our vision statements on the about page