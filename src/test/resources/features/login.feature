Feature: Login

  Scenario: Login with valid credentials
    Given user is on the login page
    When the user enters valid credentials
    Then the user is redirected to the dashboard page