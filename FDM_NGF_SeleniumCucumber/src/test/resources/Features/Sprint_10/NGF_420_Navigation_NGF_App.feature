@Sprint10
#Paola Luna

Feature: User can easily navigate back to the home page without unnecessary steps
Scenario: Logged out user selects a module to view its modules and goes back to the home page
  Given User is on the home page for login
  When User click on Finwise Module
  And User clicks on Home button
  Then User is navigated to the NGF home page
  When User navigates to Intellisense page
  And User clicks on Home button
  Then User is navigated to the NGF home page
  When User navigates to Intellisense page
  And User clicks on Home button
  Then User is navigated to the NGF home page
  When User clicks explore ResRev button
  And User clicks on Home button
  Then User is navigated to the NGF home page

Scenario: Logged in user selects a module to view its modules and goes back to the home page
  Given User is on the home page for login
  When User navigates to login page
  And User enters valid username
  And User enters valid password
  And User clicks on login button
  Then User should be logged in and see the homepage
  And User navigates to IPrep Module
  And User clicks on Home button
  Then User is navigated to the NGF home page
  When User clicks explore ResRev button
  And User clicks on Home button
  Then User is navigated to the NGF home page
  When User clicks explore InsureTech button
  And User clicks on Home button
  Then User is navigated to the NGF home page
