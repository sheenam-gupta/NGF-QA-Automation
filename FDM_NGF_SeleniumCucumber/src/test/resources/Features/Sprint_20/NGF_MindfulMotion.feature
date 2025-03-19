#Author: your.email@your.domain.com


Feature: Mindful Motion Module
  
  @mindfulMotion
  Scenario Outline: NGF Mindful Motion Module
    Given User is on the home page
    And User clicks explore mindful motion button
    When User enters body part '<bodyPart>' for exercise
    And User clicks submit button
    #Then Verify exercises for entered body part
    
		Examples: 
 		| bodyPart |
 		|  neck    |

