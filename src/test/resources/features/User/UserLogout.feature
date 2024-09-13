Feature: Verify user logout endpoint

  Scenario: Verify can log out
    Given I want to logout
    When I try to logout
    Then the response status code should be 200