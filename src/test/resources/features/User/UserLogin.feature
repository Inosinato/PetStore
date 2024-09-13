Feature: Verify user login endpoint

  Scenario: Verify user can login to the system
    Given I want to login to system
    And the username is "username"
    And the password is "password"
    When I try to login
    Then the response status code should be 200

  Scenario: Verify user cannot login with correct username but incorrect password
    Given I want to login to system
    And the username is "username"
    And the password is "incorrect"
    Then the response status code should be 400

  Scenario: Verify user cannot login with incorrect username but correct password
    Given I want to login to system
    And the username is "incorrect"
    And the password is "password"
    Then the response status code should be 400

  Scenario: Verify user cannot login with incorrect username and incorrect password
    Given I want to login to system
    And the username is "incorrect"
    And the password is "incorrect"
    Then the response status code should be 400

  Scenario: Verify user cannot login with empty username and empty password
    Given I want to login to system
    And the username is "username"
    And the password is ""
    Then the response status code should be 400