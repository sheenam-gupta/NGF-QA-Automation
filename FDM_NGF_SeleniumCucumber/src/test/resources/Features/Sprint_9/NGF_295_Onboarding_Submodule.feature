#Author: Paola Luna
@Sprint9
Feature: User tries features in the Onboarding submodule


  Scenario: User navigates NGF Onboarding Git page
    Given User is on the onboarding home page submodule
    When User navigates to git page
    And User clicks on the install Git link
    Then User should be navigated to git downloads website
    And User clicks on the NGF apps repositories link
    Then User should be navigated to NGF Git Repository website
    And User navigates to python scripts video
    Then User should be navigated to the python scripts video fdm page
    And User clicks on the Git Branching Strategy Link
    Then User should be navigated to the Git Branching Page

  Scenario: User navigates to NGF Onboarding BackEnd page
    Given User is on the onboarding home page submodule
    When User Navigates to BackEnd page
    And User clicks on the Java11 installation link
    Then User navigates to Java11 installation page
    And User clicks on the Java17 installation link
    Then User navigates to Java17 installation page
    And User clicks on the IDE Installation
    Then User navigates to the STS4 IDE page
    And User clicks on the Download Lombok page
    Then User navigates to the Lombok downloads website
    And User clicks on Install Lombok
    Then User navigates to the installation instructions Lombok website
    And User clicks on the Maven Repository Link
    Then User navigates to the Maven Repository Website
    And User clicks on the Setting up Lombok Link
    Then User navigates to the Lombok IDE Setup Website
    And User clicks on the Setup database link
    Then User navigates to the Database page

  Scenario:  User navigates NGF Onboarding Database page
    Given User is on the onboarding home page submodule
    When User clicks on the Onboarding Database page button
    And User clicks on the Install MySQL link
    Then User navigates to the MySQL installation website
    And User clicks on the MySQL workbench link
    Then User navigates to the MySQL workbench website
    And User clicks on the NGF FDM database script link
    Then User navigates to the NGF FDM database script link
    And User clicks on the FrontEnd setup Page
    Then User navigates to the FrontEnd Page

    Scenario: User navigates to NGF Onboarding FrontEnd page
      Given User is on the onboarding home page submodule
      When User navigates to the NGF Onboarding FrontEnd page
      And User clicks on the VS Code Installation link
      Then User navigates to the VS Code Installation page
      And User clicks on the NodeJS Installation Link
      Then User navigates to the NodeJS Installation page
      And User clicks on the Angular CLI installation link
      Then User navigates to the Angular CLI Installation Page
      And User clicks on the NGF git repository cloning link
      Then User navigates to the Onboarding Git Page
      And User clicks on the Running the NGF Project link
      Then User navigates to the running NGF Page

    Scenario: User navigates to NGF Onboarding Glossary page
      Given User is on the onboarding home page submodule
      When User navigates to the NGF Onboarding Glossary Page
      Then User is able to see the Onboarding Page Glossary List

