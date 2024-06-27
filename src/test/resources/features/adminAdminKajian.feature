Feature: L - Admin Journey
  Background: User Logged in as Admin
    Given user is on the login page
    When the user enters valid credentials as "admin@mail.com" and "11111111"
    Then the user is redirected to the "admin" dashboard page

  Scenario: Admin Data Kajian
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    Then the user is redirected to the "data kajian" admin page

  Scenario: Admin Data Kajian - Mencari Kajian
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    And the user fill the search form in data kajian page with "Malam Purnama Berkilau Bintang"
    Then the user see the kajian with title "Malam Purnama Berkilau Bintang" in the table

  Scenario: Admin Data Kajian - Melihat Detail Kajian (Original)
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    And the user fill the search form in data kajian page with "Malam Purnama Berkilau Bintang"
    And the user click on the "detail" button in the data kajian table
    Then the user is redirected to the detail kajian page with keyword "Malam Purnama Berkilau Bintang"

  Scenario: Admin Data Kajian - Melihat Detail Kajian (Versi Baru)
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    And the user fill the search form in data kajian page with "Part"
    And the user click on the "detail" button in the data kajian table
    Then the user is redirected to the detail kajian page with keyword "Part"

#  Scenario: Admin Data Kajian - Download Kajian
#    Given user is on admin panel
#    When the user click on the "data kajian" menu admin page
#    And the user fill the search form in data kajian page with "Part"
#    And the user click on the "detail" button in the data kajian table
#    And the user click on the "download" button in the detail kajian page
#    Then the user download the kajian file

  Scenario: Admin Data Kajian - Share Kajian
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    And the user fill the search form in data kajian page with "Part"
    And the user click on the "detail" button in the data kajian table
    And the user click on the "share" button in the detail kajian page
    Then the user copied the kajian url

  Scenario: Admin Data Kajian - Automated Commit Message
    Given user is on admin panel
    When the user click on the "data kajian" menu admin page
    And the user fill the search form in data kajian page with "Part"
    And the user click on the "detail" button in the data kajian table
    Then the user see the commit message in the detail kajian page
