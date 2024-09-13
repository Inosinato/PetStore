Feature: Verify get store inventory endpoint

  Scenario: Verify get store inventory
    Given I want to check store inventory
    When I attempt to fetch inventory
    Then the response status code should be 200
