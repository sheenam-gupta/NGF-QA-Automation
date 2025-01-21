#Author: Paola Luna
@Sprint7
Feature: Footer Functionality

  Background:
    Given User is on the home page for login
    When User navigates to login page
    And User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be logged in and see the homepage

  Scenario: User reads the copyright
    Given User should be logged in and see the homepage
    Then User should see copyright statements on the main page

  Scenario: User clicks on contact us link on footer
    Given User should be logged in and see the homepage
    When User clicks on the contact us button on the footer
    Then User should be navigated to the fdmgroup contact us page

  Scenario: User clicks on linkedin icon on footer
    Given User should be logged in and see the homepage
    When User clicks on the linkedin icon on the footer
    Then User should be navigated to the fdmgroup linkedin page

  Scenario: User clicks on facebook icon on footer
    Given User should be logged in and see the homepage
    When User clicks on the facebook icon on the footer
    Then User should be navigated to the fdmgroup facebook page

  Scenario: User clicks on x icon on footer
    Given User should be logged in and see the homepage
    When User clicks on the x icon on the footer
    Then User should be navigated to the fdmgroup x page

  Scenario: User clicks on instagram icon on footer
    Given User should be logged in and see the homepage
    When User clicks on the instagram icon on the footer
    Then User should be navigated to the instagram page

  Scenario: User clicks on tiktok icon on footer
    Given User should be logged in and see the homepage
    When User clicks on the tiktok icon on the footer
    Then User should be navigated to the tiktok page

