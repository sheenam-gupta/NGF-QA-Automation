#Author: Adarsh Kaushal
@Sprint12
Feature:As a developer, I want the application to convert my code into human-understandable 
pseudo code using AI, so that, I can easily generate detailed and clear documentation with minimal effort.

  Scenario Outline: Generate Pseudo Code from Source Code for Documentation
    Given User is on the home page for login
    When User navigates to login page
     And User enters their username and password and clicks the log in button
    When User explores Intellisense and then lanches code assistant
    And User chooses the option to convert your code to any programming language "<option>"
    And User paste the code in the field to get converted "<code>"
    Then Clicks on the receive feedback 
    Examples:
    |option|code|
    |Generate readable pseudo code from source code|CodeAssitant_DataFile.txt|

    
