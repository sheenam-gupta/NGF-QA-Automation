#Author: Paola Luna
@Sprint8
Feature: Resume Matching And OverUsed Word Flagging

  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

  Scenario Outline: Recruiter requests resume matching feedback for a job posting
    Given User should be logged in and see the homepage
    When User clicks explore ResRev button
    And User clicks explores Keyword matching button
    And User clicks on I am a recruiter button for Resume Refinement
    When User enters job description '<job_description>' for Resume Refinement
    And User enters Resume '<resume>' for Resume Review
    And User clicks receive feedback button for Resume Review
    Then User receives feedback for job applicant by assistant for Resume Refinement

    Examples:
      | job_description | resume |
      | KeywordMatching_MatchJob_DataFile.txt | KeywordMatching_Resume_DataFile.txt |