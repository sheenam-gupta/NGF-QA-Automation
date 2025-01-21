# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the IPrep Networking Tips
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

   Scenario Outline: User can manipulate the options and prompt on the Networking Tips page
     Given User should be logged in and see the homepage
     And User navigates to IPrep Module
     And User navigates to the Interview Guidance page
     And User clicks the Networking Tips button
     When User clicks on subject dropdown and selects '<subject>' from Networking Tips page
     And User clicks on role dropdown and selects '<role>' from Networking Tips page
     And User clicks edit button in the Networking Tips page
     And User writes their prompt '<prompt>' in the Networking Tips page
     And User clicks start button in the Networking Tips page
     Then User should see the assistant web element appear on the response box for the Networking Tips page
     And User should see the api response from their prompt '<response>' for the Networking Tips page
     Examples:
       | prompt                     | response             | subject     | role     |
       | Tips as a new grad         | industry events      | Development | Frontend |
       | Tips as a senior developer | professional network | Development | Backend  |