Feature: Verify get user by username endpoint

  Scenario: Verify get user by username
    Given I want to search a user by username
    When I perform the search by username with "user1"
    Then the response status code should be 200

  Scenario: Verify get user by username
    Given I want to search a user by username
    When I perform the search by username with "invalidUser"
    Then the response status code should be 400