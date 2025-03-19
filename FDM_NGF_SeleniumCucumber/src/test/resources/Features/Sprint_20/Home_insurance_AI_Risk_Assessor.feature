#Author: sheenam.gupta@fdmgroup.com

  @RiskAssessor
  Feature: AI assessor prompts for information about my location, property status,
    property value and asset value so that I can receive an estimated home insurance.

    Scenario Outline: User requests risk rating on the AI Risk Assessor for home insurance
      Given User is on the home page
      When User navigates to the log in page
      And User enters their username and password and clicks the log in button
      And User clicks explore InsureTech button
      And User clicks explores AI Risk Assessor button
      And User clicks on home insurance for AI risk rating
      When User enters age for AI risk rating '<age>'
      And User selects gender for AI risk rating '<gender>'
      And User enters city for AI risk rating '<city>'
      And User selects owning status for AI risk rating '<owning_status>'
      And User enters dwelling amount for AI risk rating '<dwelling_amount>'
      And User enters personal property amount for AI risk rating '<personal_property_amount>'
      And User enters liability for AI risk rating '<liability>'
      And User enters deductible for AI risk rating '<deductible>'
      And User enters income for AI risk rating '<income>'
      And User clicks get risk rating button for AI risk rating
      Then User should see the risk rating level response for the AI risk rating '<tier>'
      Examples:
        | gender | age | city      | owning_status | dwelling_amount | personal_property_amount | liability | deductible | income | tier       |
        | Male   | 20  | Toronto   | Renting       | 2000            | 0                        | 60000     | 200        | 80000  | Medium-Low |
        #| Female | 36  | Vancouver | Owning        | 30000000        | 1000000                  | 25000     | 12000      | 200000 | Medium-Low |