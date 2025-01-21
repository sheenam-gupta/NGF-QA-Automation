#Author: Hani Saravanan
@Sprint18 @MockExam_Loading_Spinner_Error_Message
Feature: Display Loading Animation and Error Message for Quiz Loading in IPrep Mock Exam Submodule

  Scenario: Verify loading animation appears before the mock questions loads
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    When User navigates to IPrep Module
    And User navigates to Mock Exam page
    When User selects a subject "Java" for the mock exam
    And User clicks on Take Mock Exam button
    Then Loading animation appears with text "Loading"


    