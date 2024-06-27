Feature: Public Kajian Main

  Scenario: access the kajian main page
    Given a web browser is at the MWCC main page
    When the users clicks the Kajian on the navigation bar
    Then the users are redirected to the Kajian page

  Scenario: Showed the user preferences for the Kajian Main page
    Given a web browser is at the MWCC main page
    When the users clicks the Kajian on the navigation bar
    Then the users can see the preferenced kajian
