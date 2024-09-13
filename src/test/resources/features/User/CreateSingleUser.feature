Feature: Verify User controller

  Scenario: Verify create single user with empty params
    Given I want to create a single new user
    When I attempt to create a new single user with data
    Then the response status code should be 500

  Scenario: Verify create single user happy path
    Given I want to create a single new user
    And with id as 1
    And with username as "testing3234"
    And with firstname as "john"
    And with lastname as "doe"
    And with email as "john.doe@email.com"
    And with password as "secure"
    And with phone as "012345"
    And with user status as 1
    When I attempt to create a new single user with data
    Then the response status code should be 200
    And the body response should contain "testing324"

  Scenario: Verify create single user with empty username
    Given I want to create a single new user
    And with id as 1
    And with username as ""
    And with firstname as "john"
    And with lastname as "doe"
    And with email as "john.doe@email.com"
    And with password as "secure"
    And with phone as "012345"
    And with user status as 1
    When I attempt to create a new single user with data
    Then the response status code should be 200

  Scenario: Verify create single user with empty id
    Given I want to create a single new user
    And with id as ""
    And with username as "john.doe"
    And with firstname as "john"
    And with lastname as "doe"
    And with email as "john.doe@email.com"
    And with password as "secure"
    And with phone as "012345"
    And with user status as 1
    When I attempt to create a new single user with data
    Then the response status code should be 200

  Scenario: Verify create single user with empty email
    Given I want to create a single new user
    And with id as 1
    And with username as "john.doe"
    And with firstname as "john"
    And with lastname as "doe"
    And with email as ""
    And with password as "secure"
    And with phone as "012345"
    And with user status as 1
    When I attempt to create a new single user with data
    Then the response status code should be 200

  Scenario: Verify create single user with empty password
    Given I want to create a single new user
    And with id as 1
    And with username as "john.doe"
    And with firstname as "john"
    And with lastname as "doe"
    And with email as "john.doe@email.com"
    And with password as ""
    And with phone as "012345"
    And with user status as 1
    When I attempt to create a new single user with data
    Then the response status code should be 200