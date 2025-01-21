#Author: Karan Punjabi

@PreferenceMenu
@Sprint18
@NGF_662

Feature: As a back-end developer,
  I want to support the logout functionality and prepare endpoints for user preference management,
  so that users can log out, adjust their settings, and easily extend functionality in the future.

Background: 
    Given User is on the home page for login
    And User navigates to login page
    And User enters valid username
    And User enters valid password
    When User clicks on login button
    Then User should be logged in and see the homepage
 
@preferences
  Scenario: User accesses the preferences page
    Given a logged-in user with an active session
    When the user navigates to the "Preferences" page
    Then the user should see options to update "Dark Mode"
    And the options should reflect the user's current settings
    And placeholders for "Contact Email" and "Password" are prepared
  

    When the user clicks the "Logout" button

    

    


