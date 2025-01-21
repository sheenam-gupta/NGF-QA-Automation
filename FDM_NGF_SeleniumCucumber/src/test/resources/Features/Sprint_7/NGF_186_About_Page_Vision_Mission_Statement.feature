@Sprint7
Feature: User reads the mission and vision statements from the about page

  Scenario: User reads the about page
    Given User is on the home page for login
    When User navigates to the about page
    Then User should see our vision statements on the about page
    And User should see our mission statements on the about page