@Sprint4
Feature: Registration Functionality

  Scenario Outline: User registers with valid details
    Given User is on the home page for registration
    When User navigates to registration page
    When User enters full name '<fullName>'for registration
    And User enters email '<email>' for registration
    And User enters date of birth '<dob>' for registration
    And User enters username '<username>' for registration
    And User enters password '<password>' for registration
    And User enters confirm password '<confirmPassword>' for registration
    And User selects the '<securityQuestion>' security question for registration
    And User enters security answer '<securityAnswer>' for registration
    And User agrees to terms and conditions for registration
    And User clicks on create account button for registration
    Then User should be registered successfully

    Examples: 
      | fullName | email  | dob        | username | password      | confirmPassword | securityQuestion | securityAnswer |
      | rbugje   | johnan | 1990-01-11 | rbugje   | Password@123! | Password@123!   |                2 | Street         |
      | wbjiva   | jnnan  | 1991-07-01 | osvid    | pasWword@1!   | pasWword@1!     |                2 | Street         |
      | iwbarvp  | john   | 2001-08-10 | sbouvosd | assWWord@2@3  | assWWord@2@3    |                2 | Street         |

  Scenario: User registers with duplicate username
    Given User is on the home page for registration
    When User navigates to registration page
    When User enters full name "johndoe" for registration
    And User enters email "johnnan" for registration
    And User enters date of birth "1990-01-01" for registration
    And User enters username "johndoe" for registration
    And User enters password "Password@123!" for registration
    And User enters confirm password "Password@123!" for registration
    And User selects the "2" security question for registration
    And User enters security answer "Street" for registration
    And User agrees to terms and conditions for registration
    And User clicks on create account button for registration
    Then User should see an error message for duplicate username

  Scenario: User registers with invalid details for all fields
    Given User is on the home page for registration
    When User navigates to registration page
    When User enters full name "N" for registration
    Then User should see an error message for invalid fullname
    And User enters date of birth "1901-01-01" for registration
    Then User should see an error message for invalid dob
    And User enters username "u" for registration
    Then User should see an error message for invalid username
    And User enters password "pass" for registration
    Then User should see an error message for short password
    And User enters confirm password "differentPassword" for registration
    Then User should see an error message for incorrect confirm password
    And User selects the "0" security question for registration
    Then User should see an error message for empty security question
    And User enters security answer "a" for registration
    Then User should see an error message for inavlid security answer
    And User agrees to terms and conditions for registration
    And User agrees to terms and conditions for registration
    Then User should see an error message for unchecked terms & conditions
