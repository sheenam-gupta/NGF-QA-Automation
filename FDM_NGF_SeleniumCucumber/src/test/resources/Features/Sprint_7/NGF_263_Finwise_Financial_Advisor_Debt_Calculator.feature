# Author: Umaid Malik
@Sprint7
Feature: User tries features in the FinWise financial advisor submodule
  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

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