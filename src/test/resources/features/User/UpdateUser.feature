Feature: Verify update user endpoint

  Scenario: Verify user information can be updated
    Given I want to update a user with username "user1"
    When I attempt to modify a user with data
    Then the response status code should be 200

  Scenario: Verify user information can be updated
    Given I want to update a user with username ""
    When I attempt to modify a user with data
    Then the response status code should be 400