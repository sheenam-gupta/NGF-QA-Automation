#Author: Hani Saravanan
@Sprint16
@NGF_767
Feature: As a user, I want to be able to save my tasks in a to-do list that is integrated with a calendar, so that I can easily view, organize, and manage my tasks at any time to stay on top of my schedule.

  Background: 
    Given User is on the home page for login
    And User navigates to login page
    And User enters valid username
    And User enters valid password
    When User clicks on login button
    Then User should be logged in and see the homepage

	@TaskCreate
  Scenario: Create a task with title, description, and due date
    Given User is on the task manager page
    When User clicks on Add Task
    And User enters "Testing task title" as the title
    And User selects start time as "08:05:AM"
    And User selects end time as "11:45:AM"
    And User enters "Testing task description" as the description
    And User clicks on Save button
    Then The task should be added to the task list

	@TaskEdit
  Scenario: Edit all details of a task
    Given User is on the task manager page
    When User clicks on Add Task
    And User enters "Testing task title" as the title
    And User selects start time as "08:05:AM"
    And User selects end time as "11:45:AM"
    And User enters "Testing task description" as the description
    And User clicks on Save button
    Then The task should be added to the task list
    When User clicks on the Edit button of a task
    And User enters "Updated testing task title" as the title
    And User selects start time as "12:05:PM"
    And User selects end time as "05:35:PM"
    And User enters "Updated testing task description" as the description
    And User clicks on Save button
    Then The task should be updated with "Updated testing task title", "12:05 PM", "05:35 PM" in the task list
	
	@TaskDelete
  Scenario: Delete a task
    Given User is on the task manager page
    When User clicks on Add Task
    And User enters "Testing task title" as the title
    And User selects start time as "08:05:AM"
    And User selects end time as "11:45:AM"
    And User enters "Testing task description" as the description
    And User clicks on Save button
    When User clicks on the Delete button for a task
    Then The task should be removed from the task list

	@CurrentStatus
  Scenario: Identify current time in calendar with a red line
    Given User is on the task manager page
    Then A red line should indicate the current time

  @TaskView
  Scenario: View the calendar in an hourly view
    Given User is on the task manager page
    Then Calendar should be displayed in the hourly view
    
    @CalandarIntegration
    Scenario: View the calendar 
    Given User is on the task manager page
    When User clicks on the calendar dropdown
    And User selects year "2025" and month "Dec" 
    And User selects "Friday, December 19, 2025" date
    Then Calendar should be displayed for "Dec 19 2025"
