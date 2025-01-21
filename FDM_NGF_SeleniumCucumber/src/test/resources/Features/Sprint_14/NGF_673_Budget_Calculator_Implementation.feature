#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Test the Budget Calculator module under Finwise
@Sprint14

Feature: Testing the new implementation of Budget Calculator.
  
  Scenario Outline: Users should be able to add, edit, and delete entries for different categories of income and expenses
  and should be able to calculate the total income.
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    When User click on Finwise Module
    And User clicks on Budget Calculator
    And User clicks start from the budget calculator welcome page
    When User enters the Income details '<hours>' '<paid>' '<other_inome>'
    And User click on reset button in the income page
    Then Income details set to blank
    When User enters the Income details '<hours>' '<paid>' '<other_inome>'
    And User Click Expenses_button 
    And User clicks on Back button in Expense page
    Then User able to see the details entered for Income '<hours>' '<paid>' '<other_inome>'
    And User Click Expenses_button 
    When User enters Expense details '<rent_housing>' '<groceries>' '<transportation>' '<subscriptions>' '<debts>'
    And User click on Reset button in Expense page
    Then Expense details set to blank
    When User enters Expense details '<rent_housing>' '<groceries>' '<transportation>' '<subscriptions>' '<debts>'
    And click on Savings and Goals
    And User click on Back button in Savings and expense page
    Then user able to see the details entered for expense '<rent_housing>' '<groceries>' '<transportation>' '<subscriptions>' '<debts>'
    And click on Savings and Goals
    When User enters savings and goals details '<save>' '<goal>'
    And User click calculate button
    Then User able to see the summary page with Monthly total income '<hours>' '<paid>' '<other_inome>'
    And user should be able to see Monthly total expense '<rent_housing>' '<groceries>' '<transportation>' '<subscriptions>' '<debts>'
    And user should be able to see savings and goals '<save>' '<goal>'
    And user should be able to see recommendations '<save>' '<goal>'
    
    Examples:
    | hours | paid | other_inome | rent_housing | groceries | transportation | subscriptions | debts | save | goal | 
    | 30    | 20   | 100         | 1500         | 200       | 100            | 20            | 500   | 50   | 100  |
    
    
    
    
    
