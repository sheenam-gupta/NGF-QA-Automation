# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the Finwise financial advisor submodule for Business Finance Advice
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

   Scenario Outline: User get personal financial advice for Student Loan Repayment option
     Given User should be logged in and see the homepage
     And User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     When User select Business financial Advice option from Financial Advice dropdown
     And User enters profit for Business Financial Advice'<profit>'
     And User enters expenses for Business Financial Advice'<expenses>'
     And User enters interest rate for Business Financial Advice'<interest_rate>'
     And User enters cash flow for Business Financial Advice'<cash_flow>'
     And User clicks on submit button for Financial Advisor
     Then User should see assistant label be present for the Financial Advisor
     Examples:
       | profit | expenses | interest_rate | cash_flow |
       | 12000  | 6800     | 6             | 4000      |
       | 12347  | 5600     | 3.45          | 2500      |

