@Sprint11
@VirtualNetworkingEvents

Feature: Logged in and logged out user navigates to the virtual networking events page

Background: User is attempting to navigate to the virtual networking events page

Scenario: Logged in user clicks on the virtual networking events button in the footer then navigates to that page

Given User is on the home page 
When User navigates to the log in page 
And User enters their username and password and clicks the log in button
When User clicks on the virtual networking events button in the footer
Then User should be navigated to the virtual networking events page 
