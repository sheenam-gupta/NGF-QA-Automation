# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the FinWise financial advisor submodule
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

   Scenario Outline: User gets personal financial advice for Retirement Savings Analysis option
     Given User should be logged in and see the homepage
     And User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     When User select Personal financial Advice option from Financial Advice dropdown
     And User select Retirement Savings Analysis option from the Personal Finance Advice dropdown
     And User enters current savings amount for the Retirement Savings Analysis '<current_savings>'
     And User enters years until retirement for the Retirement Savings Analysis '<years_until_retirement>'
     And User enters annual return rate for the Retirement Savings Analysis '<annual_return_rate>'
     And User enters amount saved at retirement for the Retirement Savings Analysis '<amount_saved_at_retirement>'
     And User clicks on submit button for Financial Advisor
     Then User should see the Retirement Savings Analysis results '<monthly_savings_needed>'
        Examples:
          | current_savings | years_until_retirement | annual_return_rate | amount_saved_at_retirement | monthly_savings_needed |
          | 100000          | 20                     | 5                  | 1000000                    | 1772.93                |
          | 200000          | 30                     | 6                  | 2000000                    | 791.91                 |

   Scenario Outline: User gets personal financial advice for Credit Card Debt Calculator option
     Given User should be logged in and see the homepage
     And User click on Finwise Module
     And User click on Explore Financial Advisor button
     And User click on launch button
     When User select Personal financial Advice option from Financial Advice dropdown
     And User select Credit Card Debt Calculator option from the Personal Finance Advice dropdown
     And User enters the credit card balance for the Credit Card Debt Calculator '<credit_card_balance>'
     And User enters the interest rate for the Credit Card Debt Calculator '<interest_rate>'
     And User enters the monthly payment for the Credit Card Debt Calculator '<monthly_payment>'
     And User enters the location for the Credit Card Debt Calculator '<location>'
     And User clicks on submit button for Financial Advisor
     Then User should see the Credit Card Debt Calculator results '<months_to_pay_off>'
            Examples:
              | credit_card_balance | interest_rate | monthly_payment | location | months_to_pay_off |
              | 10000               | 3             | 4000            | toronto  | 3                 |
              | 20000               | 6             | 1000            | montreal | 22                |