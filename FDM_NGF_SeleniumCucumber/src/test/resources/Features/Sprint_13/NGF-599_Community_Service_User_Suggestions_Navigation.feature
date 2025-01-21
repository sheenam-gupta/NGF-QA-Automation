@Community_Service_Suggestions
@Sprint13

Feature: Ensure 'View all suggestions' table is displayed in the 'Community Space Module' after a user 
enters a suggestions

Scenario Outline: Verify suggestions table is displayed after submitting a suggestion not related to a module

Given User is on the home page 
When User navigates to the log in page 
And User enters their username and password and clicks the log in button
When User navigates to the Community Space Module
Then User should be navigated to the Community Space Module page
When User clicks the Submit a Suggestion button
Then User should see the Submit a Suggestion form
When User selects '<suggestionRelated>' to module dropdown
And  User enters '<suggestion>' in the suggestion text box
And  User enters '<userDetails>' in the user details text box
And  User enters '<email>' in the email text box
And  User selects '<domain>' from the domain dropdown
Then User clicks the Submit button
Then User clicks the ok button in the alert box
When User clicks View all Suggestions button
Then User should see the Title displayed
And User should see the Description comment displayed
And User should see the Category comment displayed
And User should see the Tags comment displayed

Examples:
| suggestionRelated | suggestion                                            | userDetails                                  | email             | domain |
| No                | Add a module for selecting different health insurance | I am in search for  health insurance options | Customer1@fdmgroup| .au   |






Scenario Outline: Verify suggestions table is displayed after submitting a suggestion related to a module

Given User is on the home page 
When User navigates to the log in page 
And User enters their username and password and clicks the log in button
When User navigates to the Community Space Module
Then User should be navigated to the Community Space Module page
When User clicks the Submit a Suggestion button
Then User should see the Submit a Suggestion form
When User selects '<suggestionRelated>' to module dropdown
And  User select '<module>' from the module dropdown
And  User selects '<subModule>' from the sub-module dropdown
And  User enters '<suggestion>' in the suggestion text box
And  User enters '<userDetails>' in the user details text box
And  User enters '<email>' in the email text box
And  User selects '<domain>' from the domain dropdown
Then User clicks the Submit button
Then User clicks the ok button in the alert box
When User clicks View all Suggestions button
Then User should see the Title displayed
And User should see the Description comment displayed
And User should see the Category comment displayed
And User should see the Tags comment displayed

Examples:
| suggestionRelated | module | subModule         | suggestion                                           | userDetails      |email             | domain |
| Yes               | IPrep  | Mock Exam         | Add more mock exams options such as React            | I am a developer |Customer1@fdmgroup| .com   |
| Yes               | Finwise| Financial Advisor | Please add an option to contact the financial advisor|                  |Customer1@fdmgroup| .ca    |

