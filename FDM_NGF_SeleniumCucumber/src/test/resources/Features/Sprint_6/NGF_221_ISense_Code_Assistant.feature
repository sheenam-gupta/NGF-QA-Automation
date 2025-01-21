# Author: Umaid Malik
@Sprint6
 Feature: User tries features in the IPrep Interview Tips submodule
   Background:
     Given User is on the home page for login
     When User navigates to login page
     And User enters valid username
     And User enters valid password
     And User clicks on login button
     Then User should be logged in and see the homepage

   Scenario: Accessing Code Assistant Homepage
     Given User should be logged in and see the homepage
     When User navigates to Intellisense page
     And User clicks on Explore Code Assistant
     Then User should see the Code Assistant page

   Scenario Outline: Accessing Code Assistant Documentation
     Given User should be logged in and see the homepage
     And User navigates to Intellisense page
     And User clicks on Explore Code Assistant
     When User enters a prompt in the input box '<prompt>'
     Then User should see the response box be dynamically created
     And User should see the response be relevant to the prompt '<response>'
     Examples:
       | prompt                                                                                                                     | response                |
       | write an efficient non-recursive algorithm for my Fibonacci code with time complexity of O(n) and space complexity of O(1) | non-recursive algorithm |
       | write conways game of life using a 2d array as your grid                                                                   | Game of Life            |