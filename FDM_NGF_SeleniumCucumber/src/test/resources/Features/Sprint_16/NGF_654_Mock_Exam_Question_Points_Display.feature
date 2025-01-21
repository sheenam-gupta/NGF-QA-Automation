@Mock_Exam_Question_Points_Display
@Sprint16

Feature: Ensure mock exam questions display points

  Scenario Outline: Verify each question in a mock exam displays a score of <Points> points beside it
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    When User navigates to IPrep Module
    And User navigates to Mock Exam page
  	When User selects a subject "<Subject>" for the mock exam
    And User clicks on Take Mock Exam button
    Then User should see <Points> beside each question in exam
    And Test should fail due to missing score

	  Examples:
	    | Subject     | Points |
	    | Java        | 1      |
	    | JavaScript  | 1      |
	    | BA/PM       | 1      |
	    | QA          | 1      |
	    | ITSM        | 1      |
