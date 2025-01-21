@Basic_UI_for_Resource_Creator_Module
@Sprint15

Feature: Ensure resource creator module is created 

Scenario: Verify resource creator module is displayed

Given User is on the home page 
When User navigates to the log in page
And User enters their username and password and clicks the log in button
When User navigates to the Resource Creator Module
Then User should be navigated to the Resource Creator Module page


