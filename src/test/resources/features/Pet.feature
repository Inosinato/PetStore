Feature: Verify Pet controller

  Scenario: Verify get pet by status with valid status
    Given I make a GET request to "/pet/findByStatus"
    When status is "available"
    Then the response status code should be 200

  Scenario: Verify get pet by status with invalid status
    Given I make a GET request to "/pet/findByStatus"
    When status is "availablee"
    Then the response status code should be 400