#PaolaLuna
@Sprint13

Feature:User is able to toggle on or off the Dark mode in any submodule page

  Scenario: Logged out user can enable dark mode in any module and submodule page
    Given User is on the home page
    When User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User click on Finwise Module
    Then Dark mode is enabled for Finwise submodule page
    When User clicks on Home button
    And User navigates to IPrep Module
    Then Dark mode is enabled for IPrep submodule page
    When User clicks on Home button
    And User navigates to Intellisense page
    Then Dark mode is enabled for Intellisense submodule page
    When User clicks on Home button
    And User clicks explore ResRev button
    Then Dark mode is enabled for ResRev submodule page
    When User clicks on Home button
    And User clicks explore InsureTech button
    Then Dark mode is enabled for InsureTech submodule page
    When User clicks on Home button
    And User clicks explore InsightVision button
    Then Dark mode is enabled for InsightVision submodule page

  Scenario: Logged in user can enable dark mode in Finwise Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User click on Finwise Module
    Then Dark mode is enabled for Finwise submodule page
    When User click on Explore Financial Advisor button
    When User click on launch button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for Finwise Module
    When User goes back to Master Dashboard
    And User explores Finwise module and then launch Mortgage Advisor
    And User toggles dark mode button on for Mortgage Advisor Page
    Then Dark mode is on and dark mode icon is enabled for Finwise Module

  Scenario: Logged in user can enable dark mode in IPrep Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User navigates to IPrep Module
    Then Dark mode is enabled for IPrep submodule page
    When User navigates to Mock Exam page
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for IPrep submodule page
    When User goes back to Master Dashboard
    And User navigates to IPrep Module
    And User navigates to the Interview Guidance page
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for IPrep submodule page
    When User goes back to Master Dashboard
    And User navigates to IPrep Module
    And User navigates to the simulate interview page
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for IPrep submodule page


  Scenario: Logged in user can enable dark mode in Intellisense Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User navigates to Intellisense page
    Then Dark mode is enabled for Intellisense submodule page
    When User clicks on Explore Code Assistant
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled


  Scenario: Logged in user can enable dark mode in ResRev Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User clicks explore ResRev button
    Then Dark mode is enabled for ResRev submodule page
#    When User clicks explore Sample Resume button
#    And User toggles dark mode button on
#    Then Dark mode is on and dark mode icon is enabled
#    When User goes back to Master Dashboard
#    And User clicks explore ResRev button
    When User clicks explores Keyword matching button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for ResRev Pages

  Scenario: Logged in user can enable dark mode in InsureTech Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User clicks explore InsureTech button
    Then Dark mode is enabled for InsureTech submodule page
    When User clicks explores AI Risk Assessor button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for InsureTech Pages


  Scenario: Logged in user can enable dark mode in InsightVision Module
    Given User is on the home page
    When User navigates to the log in page
    And User enters their username and password and clicks the log in button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled
    When User clicks explore InsightVision button
    Then Dark mode is enabled for InsightVision submodule page
    When User clicks explore Data Visualization button
    And User toggles dark mode button on
    Then Dark mode is on and dark mode icon is enabled for InsightVision pages