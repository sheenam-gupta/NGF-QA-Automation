# Author: Umaid Malik
@Sprint7
 Feature: User tries features in the IPrep Simulate Mock Interview submodule

   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

     Scenario Outline: User navigates to simulate interview module and does a mock interview
       Given User should be logged in and see the homepage
       And User navigates to IPrep Module
       When User navigates to the simulate interview page
       And User selects the Mock Interview option in the simulate interview page
          And User selects the interview type '<interview_type>' option for simulate interview
          And User selects the choose_level '<choose_level>' option for simulate interview
          And User selects the stream '<stream>' option for simulate interview
       And User clicks on Show Questions button for simulate interview
       And User enters their answer '<answer_1>' for the question in mock interview
        And User clicks on the next question button in mock interview
       And User enters their answer '<answer_2>' for the question in mock interview
        And User clicks on the next question button in mock interview
       And User enters their answer '<answer_3>' for the question in mock interview
        And User clicks on the next question button in mock interview
       And User clicks submit button in simulate interview
       Then User should see the feedback title of the mock interview
       And User should see the feedback text of the mock interview
       Examples:
         | interview_type | choose_level | stream                        | answer_1  | answer_2    | answer_3     |
         | Behavioral     | Beginner     | Java                          | An answer | Some answer | Final answer |
         | Developer      | Intermediate | Python                        | An answer | Some answer | Final answer |
         | QA             | Advanced     | Automated/Manual Testing      | An answer | Some answer | Final answer |
         | BA             | Advanced     | Requirements Elicitation/MGMT | An answer | Some answer | Final answer |
         | PO             | Advanced     | UX/Product Management         | An answer | Some answer | Final answer |
