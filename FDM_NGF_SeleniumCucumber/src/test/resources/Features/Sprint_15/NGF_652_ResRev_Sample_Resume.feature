#Author: Besirat Melaku
@Sprint15 
@NGF_652
Feature: Resume Sample Download


  Scenario: User selects a stream and clicks on download resume
  
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User navigates to Sample Resume
    Then User validates download feature works as intended


