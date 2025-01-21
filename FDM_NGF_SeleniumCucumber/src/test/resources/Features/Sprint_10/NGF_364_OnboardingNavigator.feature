@Sprint10
@GlossaryPage


Feature: Logged in and logged out user navigates to the glossary page

Scenario Outline: Logged in user navigates to the glossary page

Given User is on the home page 
When User navigates to the log in page 
And User enters their username and password and clicks the log in button
When User clicks on the onboarding navigator button
Then User should navigate to the onboarding navigator dashboard
When User clicks on the Glossary button
Then User should be navigated to the glossary page 
Then verify user sees the welcome message 
When User clicks on the '<term>' dropdown
Then User should see the definition of the '<explanation>' in the glossary page 

Examples:
| term         | explanation |
|Select a term |Select a term to see the definition. |
|Branch       |Branch: a parallel version of a repository, allowing for isolated development and testing.|
|Commit       |Commit: a record of changes made to the codebase, typically saved in a version control system.|
|Merge        |Merge: the process of combining changes from different branches into a single branch.|
|Pull Request |Pull request: a request to merge changes from one branch into another, often reviewed by other developers. |
|Repository   |Repository: the process of combining changes from different branches into a single branch.|

Scenario Outline: Logged out user navigates to the glossary page
Given User is on the home page 
When User clicks on the onboarding navigator button
Then User should navigate to the onboarding navigator dashboard
When User clicks on the Glossary button
Then User should be navigated to the glossary page 
Then verify user sees the welcome message 
When User clicks on the '<term>' dropdown
Then User should see the definition of the '<explanation>' in the glossary page 

Examples:
| term         | explanation |
|Select a term |Select a term to see the definition. |
|Branch       |Branch: a parallel version of a repository, allowing for isolated development and testing.|
|Commit       |Commit: a record of changes made to the codebase, typically saved in a version control system.|
|Merge        |Merge: the process of combining changes from different branches into a single branch.|
|Pull Request |Pull request: a request to merge changes from one branch into another, often reviewed by other developers. |
|Repository   |Repository: the process of combining changes from different branches into a single branch.|