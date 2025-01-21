@Sprint11
@LoginAuthenticationBetweenTabs

Feature: Maintaining Login Authentication between Tabs

Scenario: Logged in user opens second tab and verify they are logged in

Given User is on the home page 
When User navigates to the log in page 
And User enters their username and password and clicks the log in button
When User opens a new tab
Then User should be logged in on the new tab
 