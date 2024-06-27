Feature: Admin Logout

  Scenario: Login with valid credentials
    Given user is on fresh page
    Given user is on the login page
    When the user enters valid credentials as "admin@mail.com" and "11111111"
    Then the user is redirected to the "admin" dashboard page
    
  Scenario: Logout
    Given user is on admin panel
    When the user click on the "logout" menu admin page
    Then the user is redirected to the "public" dashboard page