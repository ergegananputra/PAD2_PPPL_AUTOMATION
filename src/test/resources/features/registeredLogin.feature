Feature: Registered Login

  Scenario Template: Login with invalid credentials
    Given user is on fresh page
    And user is on the login page
    When the user enters valid credentials as "<email>" and "<password>"
    Then the user sees an error message invalid email or password

    Examples:
      | email           | password  |
      | mandelar@mail.com  | 11111111  |
      | mandelanofek@mail.com   | 111111112 |

  Scenario: Login with valid credentials
    Given user is on fresh page
    And user is on the login page
    When the user enters valid credentials as "mandelanofek@mail.com" and "11111111"
    Then the user is redirected to the "registered" dashboard page