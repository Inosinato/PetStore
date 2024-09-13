Feature: Verify delete user endpoint

  Scenario: Verify delete endpoint with valid username
    Given I want to delete a user
    When I attempt to delete the user "theUser"
    Then the response status code should be 200

  Scenario: Verify delete endpoint with valid username
    Given I want to delete a user
    When I attempt to delete the user ""
    Then the response status code should be 401