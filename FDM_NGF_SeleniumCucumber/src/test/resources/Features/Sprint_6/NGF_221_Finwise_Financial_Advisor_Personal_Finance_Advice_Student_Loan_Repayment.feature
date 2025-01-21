# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the FinWise financial advisor submodule Personal Financial Advice for Student Loan Repayment
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

   Scenario: User launch Financial advisor submodule
     Given User should be logged in and see the homepage
     When User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     Then User should be navigated to Financial advisor submodule page

   Scenario Outline: User get personal financial advice for Student Loan Repayment option
     Given User should be logged in and see the homepage
     And User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     When User select Personal financial Advice option from Financial Advice dropdown
     And User click on Student loan Repayment option
     And User enter loan amount '<loan_amount>'
     And User enter interest rate'<interest_rate>'
     And User enter monthly payment'<monthly_payment>'
     And User enter location "toronto"
     And User clicks on submit button for Financial Advisor
     Then User should get personal advice for student loan repayment

     Examples:
       | loan_amount | interest_rate | monthly_payment |
       |       12000 |           2.4 |             300 |
       |       12347 |             5 |          340.50 |
       |    23000.56 |             4 |             450 |
       |       20000 |             0 |             500 |
       |           0 |             4 |             200 |
       |       50000 |           2.5 |               0 |

   Scenario Outline: User should not be able to click on submit without entering loan amount field
     Given User should be logged in and see the homepage
     And User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     And User select Personal financial Advice option from Financial Advice dropdown
     And User click on Student loan Repayment option
     When User enter interest rate'<interest_rate>'
     And User enter monthly payment'<monthly_payment>'
     And User enter location "toronto"
     Then User should not be able click on submit button for Financial Advisor

     Examples:
       | loan_amount | interest_rate | monthly_payment |
       |       12000 |           2.4 |             300 |
       |       20000 |             0 |             500 |