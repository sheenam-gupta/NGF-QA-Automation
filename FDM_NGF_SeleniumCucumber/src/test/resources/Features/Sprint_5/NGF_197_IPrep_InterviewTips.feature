# Author: Umaid Malik
@Sprint5
  Feature: NGF-197 IPrep Module Interview Tips
    Background:
      Given User is on the home page for login
      When User navigates to login page
      And User enters valid username
      And User enters valid password
      And User clicks on login button
      Then User should be logged in and see the homepage

    Scenario: User can access the Interview Tips page
      Given User should be logged in and see the homepage
      When User navigates to IPrep Module
      And User navigates to the Interview Guidance page
      And User clicks the Interview Tips button
      Then User should be able to see the Interview Tips page

    Scenario Outline: User can manipulate the options and prompt on the Interview Tips page
      Given User should be logged in and see the homepage
      And User navigates to IPrep Module
      And User navigates to the Interview Guidance page
      And User clicks the Interview Tips button
      When User clicks on subject dropdown and selects '<subject>' from Interview Tips page
      And User clicks on role dropdown and selects '<role>' from Interview Tips page
      And User clicks on level dropdown and selects '<level>' from Interview Tips page
      And User clicks edit button in the Interview Tips page
      And User writes their prompt '<prompt>' in the Interview Tips page
      And User clicks start button in the Interview Tips page
      Then User should see the assistant web element appear on the response box for the Interview Tips page
      And User should see the api response from their prompt '<response>' for the Interview Tips page
      Examples:
        | prompt                            | response | subject     | role    | level        |
        | Give me interview tips on node js | Node.js  | Development | Backend | Fresher      |
        | Give me interview tips on python  | Python   | Development | Backend | Intermediate |