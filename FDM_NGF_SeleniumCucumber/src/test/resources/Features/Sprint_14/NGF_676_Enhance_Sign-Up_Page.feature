#Author: reshma.varghese@fdmgroup.com
#Feature: This feature will only  Check the password recommendation in the signup page, Signup page is already automated so for regression make use of it.
@Sprint14

Feature: Enhance Sign-Up Page to Recommend Strong Passwords for New Users

  Scenario: User registration page contains suggested password and it meets the criteria
    Given User is on the home page
    When User navigates to registration page
    And suggested password is displayed 
    And suggested password meets the user password criteria
    
   Scenario Outline: User Enter password that doesnt meet the criteria then error message is displayed
    Given User is on the home page
    When User navigates to registration page
    And User enters password '<invalidpassword>' for registration
    Then User receives new password validation message '<message1>' '<message2>'
    Examples:
| invalidpassword  | message1                                    | message2                                                          |
| passwor         | Password must be at least 8 characters long. | Password must contain uppercase, lowercase, symbols, and numbers.  |
    
    
    