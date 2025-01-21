#Author: Paola Luna
@Sprint8
Feature: Resume Refinement

  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

  Scenario: User navigates to the Keyword Matching submodule
    Given User should be logged in and see the homepage
    When User clicks explore ResRev button
    And User clicks explores Keyword matching button
    Then User is on the Keyword Matching submodule

  Scenario Outline: User requests feedback on resume based on a job title
    Given User should be logged in and see the homepage
    When User clicks explore ResRev button
    And User clicks explores Keyword matching button
    And User clicks on I am a job seeker button for Resume Review
    When User enters job description '<job_description>' for Resume Review
    And User enters Resume '<resume>' for Resume Review
    And User clicks receive feedback button for Resume Review
    Then User should see feedback provided by assistant for Resume Review

    Examples:
    | job_description | resume |
    | IT Developer    | KeywordMatching_Resume_DataFile.txt |

  Scenario Outline: User requests resume enhancement as a job seeker
    Given User should be logged in and see the homepage
    When User clicks explore ResRev button
    And User clicks explores Keyword matching button
    And User clicks on I am a job seeker button for Resume Review
    When User enters job description '<job_description>' for Resume Review
    And User enters Resume '<resume>' for Resume Review
    And User clicks receive feedback button for Resume Review
    And User clicks enhance resume button for Resume Review
    Then User receives an enhanced resume provided by assistant for Resume Review

    Examples:
      | job_description | resume |
      | IT Developer    | KeywordMatching_Resume_DataFile.txt |

