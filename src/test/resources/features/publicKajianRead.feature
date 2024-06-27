Feature: Public Kajian Read

  Background: User Logged in as Public and Access The Kajian Main Page
    Given user is on fresh page
    And user is on the login page
    When the user enters valid credentials as "joko@mail.com" and "11111111"
    Then the user is redirected to the "public" dashboard page
    Given a web browser is at the MWCC main page
    When the users clicks the Kajian on the navigation bar
    Then the users are redirected to the Kajian page

  Scenario: Access Detail Kajian
    Given a web browser is at the MWCC kajian page
    When the users clicks the Kajian card
    Then the users are redirected to the Kajian detail page

#  Scenario: Access Detail Kajian New Version
#    Given a web browser is at the MWCC detail kajian page
#    When the users clicks the kajian new version card
#    Then the users are redirected to the detail kajian new version page
#
#  Scenario: Download Kajian
#    Given a web browser is at the MWCC detail kajian page
#    When the users clicks the download button
#    Then the users are downloading to the kajian file
#
#  Scenario: Share Kajian
#    Given a web browser is at the MWCC detail kajian page
#    When the users clicks the share button
#    Then the notification appears that the kajian link has been copied

