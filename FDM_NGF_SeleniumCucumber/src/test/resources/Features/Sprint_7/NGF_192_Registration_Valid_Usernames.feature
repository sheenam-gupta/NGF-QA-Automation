@Sprint7
# Author: Umaid Malik
  Feature: Username should only be a single word with no spaces, can have special characters

    Scenario Outline: User enters a username and verifies the validity
      Given User is on the home page for login
      When User navigates to registration page
      And User enters username '<username>' for registration
      Then User should see the username is valid '<is_valid>'
      Examples:
        | username | is_valid |
        | ffff4*&^ | true     |
        | ffff 4   | false    |
        | ff ff    | false    |
        | ff 45f   | false    |
        | 1234567  | true     |
        | eeee     | false    |