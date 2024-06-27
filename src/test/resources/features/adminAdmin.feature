Feature: L - Admin Journey
  Background: User Logged in as Admin
    Given user is on the login page
    When the user enters valid credentials as "admin@mail.com" and "11111111"
    Then the user is redirected to the "admin" dashboard page

  Scenario: Dashboard Admin
    Given user is on admin panel
    When the user click on the "dashboard" menu admin page
    Then the user is redirected to the "dashboard" admin page

  Scenario: History Login
    Given user is on admin panel
    When the user click on the "history login" menu admin page
    Then the user is redirected to the "history login" admin page

  Scenario: History Login - Filter Pencarian
    Given user is on admin panel
    When the user click on the "history login" menu admin page
    And the user fill the search form in history login with "adly"
    Then the user see the history login with "adly" in table

  Scenario: History Download
    Given user is on admin panel
    When the user click on the "history download" menu admin page
    Then the user is redirected to the "history download" admin page

  Scenario: History Download - Filter Pencarian
    Given user is on admin panel
    When the user click on the "history download" menu admin page
    And the user fill the search form in history download with "Ramadhan Tiba"
    Then the user see the history download with "Ramadhan Tiba" in table

  Scenario: History Upload
    Given user is on admin panel
    When the user click on the "history upload" menu admin page
    Then the user is redirected to the "history upload" admin page

  Scenario: History Upload - Filter Pencarian
    Given user is on admin panel
    When the user click on the "history upload" menu admin page
    And the user fill the search form in history upload with "Ramadhan Tiba"
    Then the user see the history upload with "Ramadhan Tiba" in table

  Scenario: Kategori Kajian
    Given user is on admin panel
    When the user click on the "kategori kajian" menu admin page
    Then the user is redirected to the "kategori kajian" admin page

  Scenario: Kategori Kajian - Filter Pencarian
    Given user is on admin panel
    When the user click on the "kategori kajian" menu admin page
    And the user fill the search form in kategori kajian with "Sejarah"
    Then the user see the kategori kajian with "Sejarah" in table

  Scenario: Kategori Kajian - Menambah Kategori
    Given user is on admin panel
    When the user click on the "kategori kajian" menu admin page
    And the user click on the tambah kategori button in kategori kajian
    And the user fill the form in tambah kategori with "Mandalik"
    Then the user see the kategori kajian with "Mandalik" in table

  Scenario: Kategori Kajian - Edit
    Given user is on admin panel
    When the user click on the "kategori kajian" menu admin page
    And the user fill the search form in kategori kajian with "Mandalik"
    And the user click on the edit button in kategori kajian
    And the user fill the form in tambah kategori with "Mandalika"
    Then the user see the kategori kajian with "Mandalika" in table

  Scenario: Kategori Kajian - Hapus
    Given user is on admin panel
    When the user click on the "kategori kajian" menu admin page
    And the user fill the search form in kategori kajian with "Mandalika"
    And the user click on the hapus button in kategori kajian
    And the user click on the "ya" button in alert dialog
    Then the user see the kategori kajian with "Mandalika" not in table

  Scenario: Logout
    Given user is on admin panel
    When the user click on the "logout" menu admin page
    Then the user is redirected to the "public" dashboard page