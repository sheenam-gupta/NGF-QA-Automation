#PaolaLuna
@Sprint13

Feature:User is able to take mock exams within the IPrep module

  Scenario: User can access the Mock Exam submodule within the Iprep module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User navigates to IPrep Module
    And User navigates to Mock Exam page
    Then User should see the Mock Exam page


  Scenario Outline: User can take a mock exam according to a subject
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User navigates to IPrep Module
    And User navigates to Mock Exam page
    And User selects a subject '<subject>' for the mock exam
    And User clicks on Take Mock Exam button
    And User enters answer '<answer_1>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_2>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_3>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_4>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_5>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_6>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_7>' for the question in mock exam
    And User clicks on the next question button in mock exam
    And User enters answer '<answer_8>' for the question in mock exam
    And User clicks on the submit answers button in mock exam
    Then User should obtain a score, number of correct questions and feedback
    And User should see review and retry buttons in mock exam results page
    When User clicks Retry button in mock exam results page
    Then User should see the Mock Exam page

    Examples:
      | subject   | answer_1 | answer_2 | answer_3 | answer_4 | answer_5 | answer_6 | answer_7 | answer_8 |
      | Java      | a        | b        | c        | d        | b        | a        | b        | c        |
      | JavaScript| b        | c        | d        | a        | b        | a        | d        | d        |
      | BA/PM     | c        | d        | a        | b        | a        | b        | c        | a        |
      | QA        | b        | c        | a        | b        | b        | c        | a        | b        |