@Sprint7
Feature: User navigates to the registration page and reads the terms and conditions page

    Scenario: User reads terms and conditions
      Given User is on the home page for login
      When User navigates to registration page
      And User clicks on the terms, conditions and privacy policies link
      Then User should see the terms and conditions body
      And User should see the liability disclaimer
