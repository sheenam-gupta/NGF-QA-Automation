#Author: Karan Punjabi

@Registration_Form_Refinement
@Sprint16
@NGF_855

Feature: Ensure Terms and Conditions Acceptance 

  Scenario: Prompt user to accept terms and conditions before account creation
    Given User is on the registration page
    When User enters all required details
    And User clicks the "Create NGF ID!" button without accepting the terms and conditions

   
