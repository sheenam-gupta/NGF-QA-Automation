#Author: Adarsh Kaushal
@Sprint11
Feature: Mortgage Advisor

  Scenario: Mortgage Advisor
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    When User explores Finwise module and then launch Mortgage Advisor
    And Enter input fields loan "<loan>" city "<city>" rate type "<rate>" Amortization "<amortization>"
    And Enter other fields property type "<property>" down payment "<payment>" province "<province>" term "<term>" and credit score "<score>"
    And verify the pop up message and verify the output fields having rates as current best worst qualifying and AI advice  
    Examples:
    |loan|city|rate|amortization|property|payment|province|term|score|
    |10000|toronto|variable|25|commercial|5|ON|2|700|
   
    
     	