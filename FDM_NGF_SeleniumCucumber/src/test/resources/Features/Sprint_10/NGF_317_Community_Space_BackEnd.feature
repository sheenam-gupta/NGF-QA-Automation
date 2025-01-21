#Paola Luna
@Sprint10
Feature: Community Space idea submission is functional

  Scenario Outline: Logged out user sends idea regarding a module on the Community Space Page
    Given User is on the home page for login
    When User clicks on the Community Space button
    And User clicks on submit a suggestion button
    Then User is navigated to the suggestion form
    When User selects suggestion related to a module '<module-related>'
    And User selects module '<module>' to submit idea or suggestion
    And User selects submodule '<submodule>' to submit idea or suggestion
    And User enters suggestion or idea '<idea>' to submit it to the Community Space
    And User enters email '<email>' for idea submission to the Community Space
    And User clicks on the Submit button on the Community Space Page
    Then Suggestion is sent to API for evaluation and relevant suggestion is added to the suggestions table '<idea>'

    Examples:
    | module-related | module  | submodule     | idea                                 | email             |
    | Yes            | IPrep   | Mock Exam     | Add Javascript as a subject          | john.doe@fdmgroup |
    | Yes            | ResRev  | Sample Resume | Sample resume feature is not working | john.doe@gmail    |
    | Yes            | Finwise | New Module    | Program Module with AI Tax features  | john.doe@outlook  |

    Scenario Outline: Logged out user sends a general idea on the Community Space Page
      Given User is on the home page for login
      When User clicks on the Community Space button
      And User clicks on submit a suggestion button
      Then User is navigated to the suggestion form
      When User selects suggestion related to a module '<module-related>'
      And User enters suggestion or idea '<idea>' to submit it to the Community Space
      And User enters email '<email>' for idea submission to the Community Space
      And User clicks on the Submit button on the Community Space Page
      Then Suggestion is sent to API for evaluation and relevant suggestion is added to the suggestions table '<idea>'

      Examples:
        | module-related | idea                                      | email             |
        | No             | Create a mobile app for the NGF project   | john.doe@fdmgroup |
        | No             | Create a profile for each registered user | john.doe@gmail    |
        | No             | Add cookies and cream                     | john.doe@gmail    |

  Scenario Outline: Logged in user sends an idea related to a module on the Community Space Page
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page
    And User clicks on submit a suggestion button
    Then User is navigated to the suggestion form
    When User selects suggestion related to a module '<module-related>'
    And User selects module '<module>' to submit idea or suggestion
    And User selects submodule '<submodule>' to submit idea or suggestion
    And User enters suggestion or idea '<idea>' to submit it to the Community Space
    And User enters email '<email>' for idea submission to the Community Space
    And User clicks on the Submit button on the Community Space Page
    Then Suggestion is sent to API for evaluation and relevant suggestion is added to the suggestions table '<idea>'

    Examples:
      | module-related | module        | submodule         | idea                                             | email             |
      | Yes            | InsureTech    | AI Risk Assessor | Add a House Insurance option                      | john.doe@fdmgroup |
      | Yes            | Intellisense  | Code Optimization | Create an AI Code Optimizer for React            | john.doe@fdmgroup |
      | Yes            | ResRev        | Keyword Matching  | Create an option to create resume for job seekers | john.doe@gmail   |

  Scenario Outline: Logged in user sends a general idea on the Community Space Page
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page
    And User clicks on submit a suggestion button
    Then User is navigated to the suggestion form
    When User selects suggestion related to a module '<module-related>'
    And User enters suggestion or idea '<idea>' to submit it to the Community Space
    And User enters email '<email>' for idea submission to the Community Space
    And User clicks on the Submit button on the Community Space Page
    Then Suggestion is sent to API for evaluation and relevant suggestion is added to the suggestions table '<idea>'

    Examples:
      | module-related | idea                                      | email             |
      | No             | Create a mobile app for the NGF project   | john.doe@fdmgroup |
      | No             | Create a profile for each registered user | john.doe@fdmgroup |
      | No             | 123456789                                 | john.doe@gmail  |

  Scenario: Logged out user is able to see the ideas provided on the Community Space Page
    Given User is on the home page for login
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page
    And User is able to see the fields title, description, category and tags
    And User is able to see the ideas previously provided.


  Scenario: Logged in user is able to see the ideas provided on the Community Space Page
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage
    When User clicks on the Community Space button
    Then User should be navigated to the Community Space page
    And User is able to see the fields title, description, category and tags
    And User is able to see the ideas previously provided.