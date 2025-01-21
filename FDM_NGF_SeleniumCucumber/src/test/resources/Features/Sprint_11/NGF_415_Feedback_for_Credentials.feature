@Sprint11
#Adarsh Kaushal
Feature: As a user,
				I want to receive clear feedback when I enter incorrect credentials on the login page,
				so that I know to recheck my username and password.
 
    
  Scenario: Authentication Operation wrong username
    Given The user is on the login page
    When User navigate to the log in page
    Then Enter the incorrect username "<username>" and correct password "<password>" check the message
  Examples:	
  	|username|password|
  	|johndo|Password@123!|


 Scenario: Authentication Operation wrong password
    Given The user is on the login page
    When User navigate to the log in page
    Then Enter the correct username "<username>" and incorrect password "<password>" check the message
  Examples:	
  	|username|password|
  	|johndoe|Password123!|


 Scenario: Authentication Operation wrong password
    Given The user is on the login page
    When User navigate to the log in page
    Then Enter the correct username "<username>" and correct password "<password>" check the message
  Examples:	
  	|username|password|
  	|johndoe|Password@123!|
