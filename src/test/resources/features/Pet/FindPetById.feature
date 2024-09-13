Feature: Verify find pet by id endpoint

  Scenario: Verify get pet by id
    Given I want to search a pet by id
    When I perform a pet search by id with "petId"
    Then the response status code should be 200

  Scenario: Verify get pet by id with invalid petId
    Given I want to search a pet by id
    When I perform a pet search by id with "petId"
    Then the response status code should be 400