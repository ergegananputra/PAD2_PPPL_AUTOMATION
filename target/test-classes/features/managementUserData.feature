Feature: Management User Data

  Scenario: See list of users
    Given a web browser is at the Dashboard Admin Panel MWCC
    When the users clicks the Data User on the side menu
    Then list of users are shown on the result page

  Scenario: Search User
    Given a web browser is at the Data User page
    When the user enter "Man" on the search bar
    Then user that the name contain "man" shown on the result page

  Scenario: Search User
    Given a web browser is at the Data User page
    When the user enter "" on the search bar
    Then list of users are shown on the result page

  Scenario: See User Detail
    Given a web browser is at the Data User page
    When the user click one of the eye icon on the user item
    Then a detail of the selected user is shown on the result page

  Scenario: Edit User Detail
    Given a web browser is at the Data User Detail page
    When the user click one of the pen icon on the user item
    Then a pre-filled form related to the user is shown

#  Scenario: Delete User
#    Given a web browser is at the Data User page
#    When the user clicks one of the delete icon on the user item
#    Then a confirmation box is shown on the result page
#    But if the user clicks the confirm button on the confirmation box
#    Then the selected user will be deleted
#
#  Scenario: Delete User
#    Given a web browser is at the Data User page
#    When the user clicks one of the delete icon on the user item
#    Then a confirmation box is shown on the result page
#    But if the user clicks the cancel button on the confirmation box
#    Then the selected user will not be deleted