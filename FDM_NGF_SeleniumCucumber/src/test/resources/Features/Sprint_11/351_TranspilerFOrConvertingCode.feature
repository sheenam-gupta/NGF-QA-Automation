#Author: Adarsh Kaushal
@Sprint11
Feature: As a developer,
I want to enhance the Intelli-Sense Code Assistant with frontend features to support code transpilation,
so that users can easily select, convert, and manage code across different programming languages.

  Scenario Outline: Transpiler for Converting Code from One Programming Language to another one
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    When User explores Intellisense and then lanches code assistant
    And User chooses the option to convert your code to any programming language "<option>"
    And User Selects the programming language "<language>"
    And User paste the code in the field to get converted "<code>"
    Then Clicks on the receive feedback 
    Examples:
    |option|language|code|
    |Convert your code to any programming language|java|CodeAssitant_DataFile.txt|

    
