Feature: feature to test Google search  functionality

  Scenario: Validate Google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigate to search result
