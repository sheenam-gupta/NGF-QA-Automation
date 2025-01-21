# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the Finwise budget calculator submodule
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

     Scenario Outline: User uses the budget calculator
       Given User should be logged in and see the homepage
       When User click on Finwise Module
       And User clicks on Budget Calculator
       And User clicks start from the budget calculator welcome page
       And User selects on employment status for budget calculator '<employment_status>'
       And User enters response for budget calculator '<response>'
       And User enters phone number for budget calculator '<phone_number>'
       And User enters email for budget calculator '<email>'
       Then User clicks on next button from the budget calculator
       And User click on reset button from the budget calculator
       Examples:
         | employment_status | response | phone_number | email              |
         | full-time         | 50000    | 1234567890   | john@fdmgroup.com  |
         | part-time         | answer   | 8765432123   | red@fdmgroup.com   |
         | unemployed        | ertte    | 1234567890   | blue@fdmgroup.com  |
         | retired           | 42rgwg   | 2343435678   | green@fdmgroup.com |
         | self-employed     | 1234f    | 1234567890   | black@fdmgroup.com |
