Feature: Public Kajian Main

  Background: User Logged in as Public
    Given user is on fresh page
    And user is on the login page
    When the user enters valid credentials as "joko@mail.com" and "11111111"
    Then the user is redirected to the "public" dashboard page

  Scenario: access the kajian main page
    Given a web browser is at the MWCC main page
    When the users clicks the Kajian on the navigation bar
    Then the users are redirected to the Kajian page

  Scenario: Showed the user preferences for the Kajian Main page
    Given a web browser is at the MWCC main page
    When the users clicks the Kajian on the navigation bar
    Then the users can see the preferenced kajian
