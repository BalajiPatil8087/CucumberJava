Feature: Test Login functionality

  Scenario: Check login is Successful with valid credentials
    Given browser is open
    And user is on login page
    When user enter username and password
    And user clicks on login
    Then user navigated to home page
