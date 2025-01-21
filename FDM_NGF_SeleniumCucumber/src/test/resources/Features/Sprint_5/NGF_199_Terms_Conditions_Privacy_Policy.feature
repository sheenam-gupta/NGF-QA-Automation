# Author: Umaid Malik
@Sprint5
  Feature: NGF-199 User can view terms, conditions and privacy policy

    Background:
      Given User is on the home page for login
      When User navigates to login page
      And User enters valid username
      And User enters valid password
      And User clicks on login button
      Then User should be logged in and see the homepage

    Scenario: User can view terms and conditions
      Given User is on the home page and not logged in
      And User navigates to register page
      When User clicks on the terms, conditions and privacy policies link
      Then User should see the terms and conditions page