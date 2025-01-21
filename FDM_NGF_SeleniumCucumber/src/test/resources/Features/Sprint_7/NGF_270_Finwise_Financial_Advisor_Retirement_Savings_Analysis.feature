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
    And User enters location for Retirement Savings Analysis '<location>'
    And User clicks on submit button for Financial Advisor
    Then User should see the Retirement Savings Analysis results '<monthly_savings_needed>'
    Examples:
      | current_savings | years_until_retirement | annual_return_rate | amount_saved_at_retirement | monthly_savings_needed | location |
      | 100000          | 20                     | 5                  | 1000000                    | 1772.93                | Toronto  |
      | 200000          | 30                     | 6                  | 2000000                    | 791.91                 | Montreal |